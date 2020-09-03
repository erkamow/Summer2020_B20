package officeHours.webDriverTask;

public class BrowserObjects {
    public static void main(String[] args) {

        ChromeBrowser chr1 = new ChromeBrowser();
        chr1.getURL();
        chr1.close();
        System.out.println("url Name: "+chr1.getURL()+"\nclosing browser: "+chr1.close());
        System.out.println("===================================");
        FireFoxBrowser fire1 = new FireFoxBrowser();
        fire1.getURL();
        fire1.close();
        System.out.println("url Name: "+fire1.getURL()+"\nclosing browser: "+fire1.close());
        System.out.println("====================================");
        OperaBrowser opr1 = new OperaBrowser();
        opr1.getURL();
        opr1.close();
        System.out.println("url Name: "+opr1.getURL()+"\nclosing browser: "+opr1.close());
    }
}
