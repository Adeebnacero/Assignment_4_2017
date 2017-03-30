package cput.ac.za.Question4.ADPCorrection;

/**
 * Created by Adeebo on 2017/03/31.
 */
public class sale {

    product p1 = new product();
    calculateCost cc1 = new calculateCost();

    public void slip(String name, int barcode, double price, double tax){

        p1.setName(name);
        p1.setBarcode(barcode);
        cc1.calCost(price,tax);

        System.out.println("Name: "+name);
        System.out.println("Barcode: "+barcode);
        System.out.println("Price: "+price);
        System.out.println("Tax: "+tax);
        System.out.println("Total Cost: "+cc1.getSaleCost());
    }

}
