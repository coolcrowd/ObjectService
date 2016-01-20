package edu.kit.ipd.crowdcontrol.objectservice.rest.transformer;

import edu.kit.ipd.crowdcontrol.objectservice.proto.ErrorResponse;
import edu.kit.ipd.crowdcontrol.objectservice.proto.Template;
import edu.kit.ipd.crowdcontrol.objectservice.rest.exceptions.InternalServerErrorException;
import edu.kit.ipd.crowdcontrol.objectservice.rest.exceptions.NotAcceptableException;
import org.junit.Before;
import org.junit.Test;
import spark.Request;
import spark.Response;
import spark.Route;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class OutputTransformerTest {
    private Request request;
    private Response response;
    private Route route;

    @Before
    public void setUp() {
        this.request = mock(Request.class);
        this.response = mock(Response.class);
        this.route = mock(Route.class);
    }

    @Test
    public void transformJson() {
        when(request.headers("accept")).thenReturn("application/json");

        ErrorResponse error = ErrorResponse.newBuilder().setCode("OK").build();
        String output = OutputTransformer.transform(request, response, error);

        verify(response).type("application/json");
        assertEquals("{\n  \"code\": \"OK\"\n}", output);
    }

    @Test
    public void transformProto() {
        when(request.headers("accept")).thenReturn("application/protobuf");

        ErrorResponse error = ErrorResponse.newBuilder().setCode("OK").build();
        String output = OutputTransformer.transform(request, response, error);

        verify(response).type("application/protobuf");
        assertEquals(new String(error.toByteArray()), output);
    }

    @Test (expected = NotAcceptableException.class)
    public void transformError() {
        when(request.headers("accept")).thenReturn("text/html");

        ErrorResponse error = ErrorResponse.newBuilder().setCode("OK").build();
        OutputTransformer.transform(request, response, error);
    }

    @Test
    public void transformDefaultJson() {
        when(request.headers("accept")).thenReturn("*/*");

        ErrorResponse error = ErrorResponse.newBuilder().setCode("OK").build();
        String output = OutputTransformer.transform(request, response, error);

        verify(response).type("application/json");
        assertEquals("{\n  \"code\": \"OK\"\n}", output);
    }

    @Test
    public void nullIs204NoContent() throws Exception {
        when(route.handle(request, response)).thenReturn(null);

        OutputTransformer transformer = new OutputTransformer(route);
        String output = transformer.handle(request, response);

        assertEquals("", output);
        verify(response).status(204);
    }

    @Test
    public void handleAndTransformDefault() throws Exception {
        when(request.headers("accept")).thenReturn("*/*");
        when(route.handle(request, response)).thenReturn(Template.newBuilder().build());

        OutputTransformer transformer = new OutputTransformer(route);
        String output = transformer.handle(request, response);

        assertEquals("{\n}", output);
    }

    @Test (expected = InternalServerErrorException.class)
    public void handleAndTransformNonMessage() throws Exception {
        when(request.headers("accept")).thenReturn("*/*");
        when(route.handle(request, response)).thenReturn(new Object());

        OutputTransformer transformer = new OutputTransformer(route);
        transformer.handle(request, response);
    }
}