package app;

public class TVAd extends Advertise {

    private int second;
    private int rate;
    // popular time for showing the ads
    private boolean peakTime;

    public TVAd (int fee, int rate, int adLenght, boolean peakTime) {
        super(fee);
        this.rate = rate;
        second = adLenght;
        this.peakTime = peakTime;
    }

    @Override
    public int cost() {
        return super.cost() + second * (peakTime?rate*2:rate);
    }

    @Override
    public String toString() {
        return super.toString() + 
            " ,TV advertisement lenght: " + 
            second + "secs" + " ,Rate: " + 
            (peakTime?rate*2:rate);
    }
}