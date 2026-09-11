public class App {
    private String name;
    private double rate;
    private int downloads;
    public App()
    {
        name = "NewApp";
        rate = 0.0;
        downloads = 5;
    }
    public void setApp (String newN , double newR , int newD)
    {
        name = newN;
        if(newR >= 0.0 && newR <= 5.0)
            rate = newR;
        else
            rate = 0.0;
        if(newD > 0)
            downloads = newD;
        else
            downloads = 5;
    }
    public String getName() {
        return name;
    }
    public double getRate() {
        return rate;
    }
    public int getDownloads() {
        return downloads;
    }
    public boolean isTopApp() {
        if (rate == 5 && downloads > 100)
            return true;
        else
            return false;
    }
}
