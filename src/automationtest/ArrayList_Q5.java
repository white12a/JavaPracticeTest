package automationtest;

import java.util.ArrayList;

public class ArrayList_Q5 {
    public static void main(String[] args) {
        ArrayList<String>name=new ArrayList<>();
        name.add("Scrum");
        name.add("Java");
        name.add("Jira");
        name.add("Selenium");
        name.add("Cucumber");
        name.add("PostMan");
        name.add("RestAssured");

        for (String i :name){
            System.out.println(i);
        }
    }
}
