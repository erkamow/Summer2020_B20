package day51_Expections.BrowserTask;

public class WebDriver {


        public void get(String url) {
            System.out.println("Opening the " + url + " in default browser");
        }

        public void close(){
            System.out.println("closing the default browser");
        }

    }
