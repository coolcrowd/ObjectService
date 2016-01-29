package edu.kit.ipd.crowdcontrol.objectservice.notification;

import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.NotificationRecord;
import edu.kit.ipd.crowdcontrol.objectservice.database.operations.NotificationOperations;
import edu.kit.ipd.crowdcontrol.objectservice.mail.MailSender;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.sql.Timestamp;
import java.time.Instant;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author Simon Korz
 * @version 1.0
 */
public class DBEmailNotificationPolicyTest {
    private static final String TESTQUERY = "SELECT test query";
    private static final String RECEIVER = "mail@example.com";
    DBEmailNotificationPolicy policy;
    Notification notification;
    NotificationRecord record;
    Result<Record> result;

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    private MailSender mailSender;

    @Mock
    private NotificationOperations notificationOperations;

    @Captor
    ArgumentCaptor<String> messageCaptor;

    @Before
    public void setUp() throws Exception {
        policy = new DBEmailNotificationPolicy(mailSender, RECEIVER, notificationOperations);
        notification = new Notification(5, "Test Notification",
                "This is a test notification", 60 * 60 * 24, 60 * 10, TESTQUERY, policy);

        DSLContext create = DSL.using(SQLDialect.MYSQL);
        // this could be any record from the db
        record = new NotificationRecord(5, "Test Notification",
                "This is a test notification", 60 * 60 * 24, 60 * 10, TESTQUERY, Timestamp.from(Instant.now()));
        result = create.newResult();
        result.add(record);
    }

    @Test
    public void testCheckPositive() throws Exception {
        when(notificationOperations.runReadOnlySQL(TESTQUERY)).thenReturn(result);
        Result<Record> token = policy.check(notification);

        assertEquals(result, token);
    }

    @Test
    public void testCheckNegative() throws Exception {
        // return empty result
        result.clear();
        when(notificationOperations.runReadOnlySQL(TESTQUERY)).thenReturn(result);
        Result<Record> token = policy.check(notification);

        assertEquals(null, token);
    }

    @Test
    public void testSend() throws Exception {
        policy.send(notification, result);
        verify(mailSender).sendMail(eq(RECEIVER), eq(notification.getName()), messageCaptor.capture());
        System.out.println(messageCaptor.getValue());
    }
}