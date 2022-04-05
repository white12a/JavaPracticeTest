package automationtest;

public class ForLoop_Q4 {
    public void printMyName(String name,int howManyType){
        for(int i=0; i<=howManyType; i++){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        ForLoop_Q4 q= new ForLoop_Q4();
        q.printMyName("Bhavesh",10);
        System.out.println("------------------------");
        q.printMyName("Bhavesh",15);
    }
}
