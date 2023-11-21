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

    public Paystub(Date payDate, float grossAmount, float taxFederal, float taxProvincial) {
        this.payDate = payDate;
        this.grossAmount = grossAmount;
        this.taxFederal = taxFederal;
        this.taxProvincial = taxProvincial;
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
}

