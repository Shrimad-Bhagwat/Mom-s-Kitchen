import java.util.*;
class Dish{
    int dishCount;
    Scanner sc = new Scanner(System.in);
    String[] dishes = new String[10];
    void setNumber(int dishC){
        dishCount = dishC;
    }
    
    void setDish(){
        String[] dishes = new String[dishCount];
        
        for (int i = 0; i < dishes.length; i++) {
            System.out.print("Enter dish "+i +" name : ");
            String value = sc.next();
            dishes[i] = value;
        }
    }
    void printDish(){
        for (int i = 0; i < dishes.length; i++) {
            System.out.println("Dish "+i +" name : "+ dishes[i]);
        }
    }
    
}
public class MomsKitchen {
    public static void main(String[] args) {
        int dishC=0;
        System.out.println("Welcome to Mom's Kitchen");
        Scanner sc = new Scanner(System.in);
        Dish d = new Dish();
        System.out.println("Chose option : 1.Show Dishes 2.Set Dishes");
        int option = sc.nextInt();
        if(option==1){
            d.printDish();
        }
        else if(option==2){
            System.out.println("Enter number of dishes: " );
            dishC = sc.nextInt();
            d.setNumber(dishC);
            d.setDish();
        }
        else{
            System.out.println("Wrong Option");
        }


        System.out.print("\nHow many members ? ");
        int memberCount = sc.nextInt();
        int[] member = new int[memberCount];
        int[] choice = new int[dishC];
        System.out.println("Enter dish number to chose");
        for (int i = 0; i < member.length; i++) {
            System.out.print("Choice of member "+ i + " ");
            int index = sc.nextInt();
            int count = choice[index];
            choice[index] = ++count;
        }
        System.out.println("\nChoices list output");
        for (int i = 0; i < choice.length; i++) {
            System.out.println(choice[i]);
        }


    }
}
