package app;

public class Demo {
    public static void main(String[] args) {
        AdCampaign citra = new AdCampaign("Citra");
        citra.addAd(new Advertise(500));
        citra.addAd(new TVAd(5000, 20, 30, true));
        System.out.println(citra); 

        AdCampaign pizza = new AdCampaign("Pizza");
        pizza.addAd(new NewspaperAd(100, 3, 40));
        pizza.addAd(new TVAd(2000, 10, 20, false));
        System.out.println(pizza);
    }

}