package cput.ac.za.Question4.ADPCorrection;

/**
 * Created by Adeebo on 2017/03/31.
 */
public class calculateCost {

    private double saleCost;

    cost c1 = new cost();

    public calculateCost() {
    }

    public void calCost(double price, double tax){

        c1.setPrice(price);
        c1.setTax(tax);

        saleCost = (c1.getPrice() * c1.getTax()) + c1.getPrice();
    }

    public double getSaleCost(){

        return saleCost;
    }
}
