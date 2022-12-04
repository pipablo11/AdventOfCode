package Day3;
import java.util.*;
import java.io.*;

public class code {
        public static void main (String args[])throws FileNotFoundException{
            File f = new File(".//Day3//input.txt");
            Scanner scan = new Scanner(f);

            String rucksack1, rucksack2, rucksack3;  //all even Strings
            int total = 0;
            //String compartment1, compartment2;

            while (scan.hasNext()){
                rucksack1 = scan.nextLine();
                rucksack2 = scan.nextLine();
                rucksack3 = scan.nextLine();
                boolean found = false;
                for(int i = 0; i < rucksack1.length() && !found; i++){
                    for (int j = 0; j < rucksack2.length() && !found; j++){
                        for (int k = 0; k < rucksack3.length(); k++){
                            if (rucksack1.charAt(i) == rucksack2.charAt(j) && 
                            rucksack1.charAt(i) == rucksack3.charAt(k)){
                                total += charValue(rucksack1.charAt(i));
                                found = true;
                                break;
                            }
                        } 
                    }
                }

            }
            
            System.out.println(total);

            scan.close();
        }

        // A - Z == 65 - 90
        // a - z == 97 - 122
        public static int charValue (char c){
            int value = c;
            if(value < 97){ //UpperCase
                value = value - 38;
            }
            else{ //LowerCase
                value = value - 96;
            }
            return value;
        }






        public static void part1() throws FileNotFoundException{
            File f = new File(".//Day3//input.txt");
            Scanner scan = new Scanner(f);
            
            String rucksack;  //all even Strings
            int total = 0;
            String compartment1, compartment2;

            while (scan.hasNext()){
                rucksack = scan.nextLine();
                int wordLength = rucksack.length();
                compartment1 = rucksack.substring(0, wordLength/2);
                compartment2 = rucksack.substring(wordLength/2, wordLength);
                boolean found = false;
                for(int i = 0; i < wordLength/2 && !found; i++){
                    for (int j = 0; j < wordLength/2; j++){
                        if (compartment1.charAt(i) == compartment2.charAt(j)){
                            total += charValue(compartment1.charAt(i));
                            found = true;
                            break;
                        } 
                    }
                }

            }
            
            System.out.println(total);

            scan.close();
        
        }
}
