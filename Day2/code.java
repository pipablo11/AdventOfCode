package Day2;
import java.util.*;
import java.io.*;

public class code {

    /* Playing Rock Paper Scissor
     *              opononent   you     points os shape
     * Rock:        A           X               1
     * Papper:      B           Y               2
     * Scissors:    C           Z               3
     * 
     * Win: 6
     * Lose: 0
     * Draw: 3
     * 
     * Lose = x
     * Draw = Y
     * win = Z
     */

     private static final int ROCK = 1, PAPER = 2, SCISSORS = 3; 
    public static void main(String args[])throws FileNotFoundException{
        File f = new File(".//Day2//input.txt");
        Scanner scan1 = new Scanner(f);
        Scanner scan2 = new Scanner (f);
        part1(f, scan1);
        scan1.close();
        part2(f, scan2);
        scan2.close();
    }

    public static void part1(File f, Scanner scan){
        String oponent;
        String you;
        int score = 0;

        while(scan.hasNext()){
            oponent = scan.next();
            you = scan.next();
            if(oponent.equals("A")){ //rock
                switch(you){
                    case("X"): score += ROCK + 3;
                    break;
                    case("Y"): score += PAPER + 6;
                    break;
                    case("Z"): score += SCISSORS;
                }
            }

            if(oponent.equals("B")){ //paper
                switch(you){
                    case("X"): score += ROCK ;
                    break;
                    case("Y"): score += PAPER + 3;
                    break;
                    case("Z"): score += SCISSORS + 6;
                }
            }
            
            if(oponent.equals("C")){ //scissors
                switch(you){
                    case("X"): score += ROCK + 6;
                    break;
                    case("Y"): score += PAPER ;
                    break;
                    case("Z"): score += SCISSORS + 3;
                }
            }            
        
        }
        System.out.println(score);
    }

    public static void part2(File f, Scanner scan){
        String oponent;
        String you;
        int score = 0;

        while(scan.hasNext()){
            oponent = scan.next();
            you = scan.next();
            if(oponent.equals("A")){ //rock
                switch(you){
                    case("X"): score += SCISSORS;  //lose
                    break;
                    case("Y"): score += ROCK + 3; //draw
                    break;
                    case("Z"): score += PAPER + 6; //win
                }
            }

            if(oponent.equals("B")){ //paper
                switch(you){
                    case("X"): score += ROCK ;
                    break;
                    case("Y"): score += PAPER + 3;
                    break;
                    case("Z"): score += SCISSORS + 6;
                }
            }
            
            if(oponent.equals("C")){ //scissors
                switch(you){
                    case("X"): score += PAPER;
                    break;
                    case("Y"): score += SCISSORS + 3 ;
                    break;
                    case("Z"): score += ROCK + 6;
                }
            }            
        }
        System.out.println(score);
    }
}
