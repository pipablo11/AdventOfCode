import java.util.*;
import java.io.*;

public class code {
    private static int elvesToFind = 3;
    public static void main(String args[])throws FileNotFoundException{
        File f = new File(".//Day1//example.txt");
        Scanner s = new Scanner(f);
        Part1(f, s);
        s.close();
    }

    /*0 <= pos < elfToFind
    * method to update the list allocating the new element in order.
    * element 0 is the lesser one.
    */
    public static int[] addToList(int list[], int pos, int element){
        int temp;
        for (int i = pos; i >= 0; i--){
            temp = list[i];
            list[i] = element;
            element = temp;
        }
        return list;
    }


    /*method that prints the total amount of calories of the 3 elves with most calories. 
    * this is the general method, changing the value of the global variable elvesToFind we can select
    * how many elves we are going to consider.
    */
    public static void Part2(File f, Scanner s){
        //variable declaration 
        int maxCalories[] = new int[elvesToFind];
        int calories = 0;

        //search of the 3 elves with most calories
        do{
            String input = s.nextLine();
            if(input.equals("")){
                int pos = -1;
                for (int i = 0; i <= elvesToFind - 1; i++){
                    if(calories >= maxCalories[i]){
                        pos = i;
                    }
                }
                if(pos >= 0){addToList(maxCalories, pos, calories);}
                calories = 0;
            }
            else{
                calories += Integer.parseInt(input);
            }

        }while(s.hasNext());

        //print each amount of calories for the top 3 elves and the total
        int total = 0;
        for(int i = 0; i < maxCalories.length; i++){
            total += maxCalories[i];
            System.out.println(maxCalories[i]);
        }
        System.out.println(total);
    }
    




    public static void Part1(File f, Scanner s)throws FileNotFoundException{
        int maxCalories = 0;
        int calories = 0;
        do{
            String input = s.nextLine();
            if(input.equals("")){
                if(calories > maxCalories){
                    maxCalories = calories;
                }
                calories = 0;
            }
            else{
                calories += Integer.parseInt(input);
            }

        }while(s.hasNext());

        if(calories > maxCalories) maxCalories = calories;  //to take into account the last elf
        System.out.printf("elf with the most amount of calories: %d",  maxCalories);
        s.close();

    }
    
}
