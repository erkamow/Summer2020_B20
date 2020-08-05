package day35_ArrayLists;

import java.util.ArrayList;

public class Combine2Arrays_List {
    public static void main(String[] args) {

        String[] group = {"Aalia","mohammed","Aslan","Ernis"};
        String[] group2 = {"Zarina","Mee","Irina","Virgina","Ali","Dawud"};

        ArrayList<String> studentList = new ArrayList<>();
        for(String each : group){
            studentList.add(each);
        }
        for(String each : group2){
            studentList.add(each);
        }
        System.out.println(studentList);
    }
}
