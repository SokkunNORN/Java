package app;
public class Advertise {

    protected int fee;

    public Advertise() {
        fee = 0;
    }

    public Advertise(int fee) {
        this.fee = fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int cost() {
        return fee;
    }

    @Override
    public String toString() {
        return "\n  Advertisement Fee: " + fee;
    }

}