/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author victorbarnett
 */
import java.util.Date;

public class Paystub {
    private Date payDate;
    private float grossAmount;
    private float taxFederal;
    private float taxProvincial;
    private float CPP;
    private float EI;
    private float netAmount;

    public Paystub(Date payDate, float grossAmount, float taxFederal, float taxProvincial, float CPP, float EI,
            float netAmount) {
        this.payDate = payDate;
        this.grossAmount = grossAmount;
        this.taxFederal = taxFederal;
        this.taxProvincial = taxProvincial;
        this.CPP = CPP;
        this.EI = EI;
        this.netAmount = netAmount;
    }

    // Getters and setters (if needed)

    public Date getPayDate() {
        return payDate;
    }

    public float getGrossAmount() {
        return grossAmount;
    }

    public float getTaxFederal() {
        return taxFederal;
    }

    public float getTaxProvincial() {
        return taxProvincial;
    }
    public float getCPP() {
        return CPP;
    }
    public float getEI() {
        return EI;
    }
    public float getNetAmount() {
        return netAmount;
    }
}

