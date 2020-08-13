package day40_CustomClassRecap;

public class offer {

   double salary;
   String location;
   boolean hasPTO;
   boolean isfullTime;
   boolean WFH;
   String jobTitle;
   boolean benefits;


   public void setOffer(double salary,String location,boolean hasPTO,boolean isfullTime,boolean WFH,
                     String jobTitle,boolean benefits){
       this.salary = salary;
       this.location = location;
       this.hasPTO = hasPTO;
       this.isfullTime = isfullTime;
       this.WFH = WFH;
       this.jobTitle = jobTitle;
       this.benefits = benefits;



   }
   public void getOfferInfo(){
       System.out.println("$"+salary);
       System.out.println("Location: "+location);
       System.out.println("hasPTO: "+hasPTO);
       System.out.println("isfullTime: "+isfullTime);
       System.out.println("WFH: "+WFH);
       System.out.println("Title: "+jobTitle);
       System.out.println("Benefits: "+benefits);

       System.out.println("==============================================================");
   }

}
