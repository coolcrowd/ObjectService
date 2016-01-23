package edu.kit.ipd.crowdcontrol.objectservice.database.operations;

import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.GiftCodeRecord;
import edu.kit.ipd.crowdcontrol.objectservice.database.model.Tables;
import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.PaymentRecord;

import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.WorkerRecord;
import org.jooq.DSLContext;

import java.util.List;

/**
 * contains all the Operations needed for the Payment-Table
 * @author LeanderK
 * @version 1.0
 */
public class PaymentOperations extends AbstractOperations {
    protected PaymentOperations(DSLContext create) {
        super(create);
    }

    /**
     * Returns all giftcodes sorted after the amount of money in descending order.
     * @return a list of giftcodes
     */
    public List<GiftCodeRecord> getUnusedGiftCodesDescending() {
        //TODO
        return null;
    }
    
    public void markGiftCodeAsUsed(GiftCodeRecord giftCode, WorkerRecord worker) {
        //TODO
    }

    /**
     * Returns all the payments for the passed workerID.
     * @param workerID the primary key of the worker
     * @return a list of payment
     */
     public List<PaymentRecord> getAllPayments(int workerID) {
        return create.selectFrom(Tables.PAYMENT)
                .where(Tables.PAYMENT.WORKER_ID.eq(workerID))
                .fetch();
    }


}