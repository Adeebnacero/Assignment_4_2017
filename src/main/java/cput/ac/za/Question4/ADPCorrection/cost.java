package cput.ac.za.Question4.ADPCorrection;

/**
 * Created by Adeebo on 2017/03/31.
 */
public class cost {

    public cost() {
    }

    private double price;
    private double tax = 0.0;

    public double getPrice() {
        return price;
    }

    public cost setPrice(double price) {
        this.price = price;
        return this;
    }

    public double getTax() {
        return tax;
    }

    public cost setTax(double tax) {
        this.tax = tax;
        return this;
    }
}
