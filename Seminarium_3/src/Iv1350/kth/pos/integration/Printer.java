package Iv1350.kth.pos.integration;

import Iv1350.kth.pos.modell.Receipt;

/**
 * Represents the printer call of a sale.
 */

public class Printer {

    /**
     * constructor for the printer.
     */
    public Printer (){
    }

    /**
     * Print the receipt, and simulates a real print out by writing to the console. Should not be confused with i/o to the GUI
     * @param receipt the receipt generated after the sale
     */
    public void activatePrinter (Receipt receipt){
        System.out.println(receipt);

    }
}



