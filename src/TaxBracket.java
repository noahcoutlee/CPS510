/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author victorbarnett
 */

public class TaxBracket {
    public int tbID;
    public int year;
    public String region;
    public int lower_amount;
    public int upper_amount;
    public int taxRate;

    public TaxBracket(int tbID, int year, String region, int lower_amount, int upper_amount, int taxRate) {
        this.tbID = tbID;
        this.year = year;
        this.region = region;
        this.lower_amount = lower_amount;
        this.upper_amount = upper_amount;
        this.taxRate = taxRate;
    }
}

