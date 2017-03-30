package cput.ac.za.Question4.ADPViolation;

/**
 * Created by Adeebo on 2017/03/31.
 */
public class calculateCost {

    private double totalCost;
    private double tax = 0.14;

    cost c1 = new cost();
    product p1 = new product();

    public calculateCost() {
    }

    public double calculateCost(double cost){

        p1.setTax(tax);
        return totalCost = (c1.getCost()*p1.getTax()) + c1.getCost();
    }
}
