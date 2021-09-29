import java.util.*;

/*
* @ Shrimad Bhagwat
*
* Modeling Business Problem
* Daily Dish Selection App by MOM
**/

class Dish {
    int dishCount;
    Scanner sc = new Scanner(System.in);
    String[] dishes = new String[5];

    void setNumber(int dishC) {
        dishCount = dishC;
    }

    String[] setDish() {
        String[] dishes = new String[dishCount];

        for (int i = 0; i < dishes.length; i++) {
            System.out.print("Enter dish " + i + " name : ");
            String value = sc.next();
            dishes[i] = value;
        }
        return dishes;
    }
}

// Main Function
public class MomsKitchen {
    public static void printList(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printList(int[] array,String[] setDishes) {
        for (int i = 0; i < array.length; i++) {
            try {
                System.out.println("Member "+i+" choose "+setDishes[array[i]]); 
            } catch (Exception e) {
                
                System.out.println("-----");
            }    
        }
    }

    public static int getIndexOfLargest( int[] array ){
        if ( array == null || array.length == 0 ) return -1; 
        int largest = 0;
        for ( int i = 1; i < array.length; i++ ){
            if ( array[i] > array[largest] ) largest = i;
        }
        return largest; 
    }

    public static void main(String[] args) {
        boolean flag=false;
        int dishC = 0,res=0;
        String[] setDishes = new String[dishC];
        
        System.out.println("\n----- Welcome to Mom's Kitchen -----");
        Scanner sc = new Scanner(System.in);
        Dish d = new Dish();
        int[] finalChoice = {9,9,9,9,9,9,9,9,9,9};

        while(true){
            int[] choice = new int[dishC];
            System.out.println("\n----------\nChose User : \n0.Show Dishes\n1.Mom \n2.Family Members\n3.Exit");
            int option = sc.nextInt();
            if (option==0) {
                System.out.println("\nList of dishes: ");
                printList(setDishes);
            }
            else if (option == 1) {
                System.out.println("\n----------\n1.Set Dishes \n2.See Choices(After Choosing)");
                int func = sc.nextInt();
                if(func==1){
                    System.out.println("Enter number of dishes: ");
                    dishC = sc.nextInt();
                    d.setNumber(dishC);
                    setDishes = d.setDish();
                    continue;
                }
                else if(func==2){
                    System.out.println("\nChoices Displayed");
                    printList(finalChoice,setDishes);
                }
            } else if (option == 2) {
                System.out.print("\nHow many members ? ");
                int memberCount = sc.nextInt();
                int[] member = new int[memberCount];
                if(setDishes.length>0){

                    for (int i = 0; i < member.length; i++) {
                        finalChoice[i] = 9;
                    }
                    System.out.println("Enter dish number to chose\n");
                }
                else{
                    System.out.println("-----Set Dishes First!-----");
                    continue;
                }
                try {
                    for (int i = 0; i < member.length; i++) {
                            System.out.print("Choice of member " + i + ": ");
                            int index = sc.nextInt();
                            int count = choice[index];
                            choice[index] = ++count;
                            finalChoice[i] = index;        
                        }
                } catch (Exception e) {
                    System.out.println("Set Dishes First!");
                    
                }

                System.out.println("\nChoices list output");
                int finalDishIndex = Integer.MIN_VALUE;
                for (int i = 0; i < choice.length; i++) {
                    System.out.println("Dish "+setDishes[i]+": "+choice[i]);
                    if (choice[i] > finalDishIndex) {
                        finalDishIndex = choice[i];
                    }
                }
                res = finalDishIndex = getIndexOfLargest(choice);
                flag = true;
            }
            else {
                System.out.println("Exiting...");
                break;
            }
            try {
                if (flag){
                    System.out.println("\n----------\nDish " + setDishes[res] + " will be made\n----------\n");
                }
                else{
                    System.out.println("-----");
                }
                
            } catch (Exception e) {
                System.out.println("Some Error Occured!");
            }
            
        }
        sc.close();
    }
}
