package Iv1350.kth.pos.integration;
import Iv1350.kth.pos.modell.Receipt;
import java.util.ArrayList;


/**
 * Represents the call to an accounting system.
 */

public class ExternalAccountingSystem {
    private ArrayList<Receipt> salesLog;

    /**
     * constructor for the accounting system, stores sales in an arraylist
     */
    public ExternalAccountingSystem(){
        this.salesLog = new ArrayList<>();
    }

    /**
     * Logs a completed sale in the external accounting system
     * @param receipt   the receit from the sale, is stored in the accounting system
     */
    public void logSale(Receipt receipt){
        salesLog.add(receipt);
        System.out.println("(External Accounting system) : sale logged");
    }
}
