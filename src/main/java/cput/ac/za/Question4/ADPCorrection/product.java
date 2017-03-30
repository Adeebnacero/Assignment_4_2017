package cput.ac.za.Question4.ADPCorrection;

/**
 * Created by Adeebo on 2017/03/31.
 */
public class product {

    private String name;
    private int barcode;

    public product() {
    }

    public int getBarcode() {
        return barcode;
    }

    public product setBarcode(int barcode) {
        this.barcode = barcode;
        return this;
    }

    public String getName() {
        return name;
    }

    public product setName(String name) {
        this.name = name;
        return this;
    }
}
