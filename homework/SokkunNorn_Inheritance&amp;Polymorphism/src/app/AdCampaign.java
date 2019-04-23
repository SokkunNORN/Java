package app;
import java.util.ArrayList;

public class AdCampaign {

    private ArrayList<Advertise> campaign;
    private String name;

    public AdCampaign(String name) {
        campaign = new ArrayList<Advertise>();
        this.name = name;
    }

    public void addAd(Advertise ad) {
        campaign.add(ad);
    }

    public int getCost() {
        int total = 0;
        for (Advertise c: campaign) {
            total += c.cost();
        }
        return total;
    }

    @Override
    public String toString() {
        String ads= "";
        for (Advertise c: campaign) {
            ads += c.toString();
        }
        return "Advertisement Campaign Name: " + 
            name + " costs in Total is " + 
            getCost() + ads;
    }
}