package officeHours;

public class Pizza {

String size;
    int numOfCheeseTopping;
    int numOfPepperoniTopping;

    public void setPizzaInfo(String size,int numOfCheeseTopping,int numOfPepperoniTopping){
        this.size = size;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfPepperoniTopping = numOfPepperoniTopping;

        System.out.println("=================================================================");


    }
    public double calCost(){
        int totalNumOfTopping = numOfCheeseTopping + numOfPepperoniTopping;
        double totalPriceOfTopping = totalNumOfTopping * 2;
        double totalPrice = totalPriceOfTopping;

        if(size.equalsIgnoreCase("small")){
            totalPrice+=10;
        }else if(size.equalsIgnoreCase("medium")){
            totalPrice+=12;
        }else{
            totalPrice+=14;
        }
        return totalPrice;

    }
    public String toString(){
        return "size: "+size+"\nnumOfCheeseTopping: "+numOfCheeseTopping+
                "\nnumOfPepperoniTopping: "+numOfPepperoniTopping+"\ntotal price: "+" $"+calCost();
    }
}
