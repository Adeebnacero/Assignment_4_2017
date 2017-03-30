package cput.ac.za.Question4.ADPViolation;

/**
 * Created by Adeebo on 2017/03/31.
 */
public class product {

    private String name;
    private int barcode;
    private double cost;
    private double totalCost;
    private double tax;

    calculateCost c1 = new calculateCost();
    product p1 = new product();

    public product() {
    }

    public int getBarcode() {
        return barcode;
    }

    public product setBarcode(int barcode) {
        this.barcode = barcode;
        return this;
    }

    public double getCost() {
        return cost;
    }

    public product setCost(double cost) {
        this.cost = cost;
        return this;
    }

    public String getName() {
        return name;
    }

    public product setName(String name) {
        this.name = name;
        return this;
    }

    public double getTax() {
        return tax;
    }

    public product setTax(double tax) {
        this.tax = tax;
        return this;
    }

    private double calculateCost(){

        totalCost = c1.


    }
}
