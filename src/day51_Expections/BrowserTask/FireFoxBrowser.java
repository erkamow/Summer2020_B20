package day51_Expections.BrowserTask;

public class FireFoxBrowser extends WebDriver{
    public void get(String url) {
        System.out.println("Opening the " + url + " in firefox browser");

    }

    public void close() {
        System.out.println("closing the firefox browser");
    }

}
