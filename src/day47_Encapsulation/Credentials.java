package day47_Encapsulation;

public class Credentials {

    String name;
    int age;

    public Credentials(String name,int age){
        this.name = name;
        this.age = age;
    }
    public static String companyName;
    static {
        companyName = "Ultimate Turkey";
    }


    private String username = "erkamow";

    public String getUsername(){
        return username;
    }

    public void setUsername (String username){
        this.username = username;
    }

    private long password = 19941453;
    public long getPassword(){
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    public String toString(){
        return "Name: "+name+"\nAge: "+age+"\nCompany Name: "+companyName;
    }
}
