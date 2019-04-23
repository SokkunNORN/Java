package app;
public class NewspaperAd extends Advertise {

    private int columnCm;
    private int rate;

    public NewspaperAd (int fee, int columnCm, int ratePerCm) {
        super(fee);
        this.columnCm = columnCm;
        rate = ratePerCm;
    }

    @Override
    public int cost() {
        return fee + (rate * columnCm);
    }

    @Override
    public String toString() {
        return super.toString() + 
            " ,Newspaper Advertisement { column centimeter: " + 
            columnCm + " ,rate per centimeter: " + rate + " }";
    }
    
}