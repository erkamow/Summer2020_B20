package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        cat1.setCatInfo("jenny",4,'F',"white","Van");
        cat2.setCatInfo("Billy",2,'M',"Black","British");
        cat3.setCatInfo("jane",1,'F',"Gray","American");
        cat4.setCatInfo("Toffy",6,'M',"Orange","Siamese");

        ArrayList<Cat> catsList =  new ArrayList<>();
        catsList.addAll(Arrays.asList(cat1,cat2,cat3,cat4));
        // catsList.removeIf(p->p.gender == 'F');
        // catsList.removeIf(p->p.age<2);

        for(Cat eachCat : catsList){
            System.out.println(eachCat);
        }
    }
}
