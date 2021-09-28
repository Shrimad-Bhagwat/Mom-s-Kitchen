import java.util.*;

public class MomsKitchen {
    public static void main(String[] args) {
        System.out.println("Welcome to Mom's Kitchen");
        Scanner sc = new Scanner(System.in);
 
        System.out.print("How many dishes? ");
        int dishCount = sc.nextInt();
        String[] dishes = new String[dishCount];
        for (int i = 0; i < dishes.length; i++) {
            System.out.print("Enter dish "+i +" name : ");
            String value = sc.next();
            dishes[i] = value;
        }

        System.out.print("\nHow many members ? ");
        int memberCount = sc.nextInt();
        int[] member = new int[memberCount];
        int[] choice = new int[dishCount];
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
