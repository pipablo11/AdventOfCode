package Day4;
import java.util.*;
import java.io.*;

public class code {
    public static void main(String [] args)throws FileNotFoundException{
        File f = new File(".//Day4//input.txt");
        Scanner scan = new Scanner(f);

        int [] elf = new int [4];
        int contained = 0;
        String [] num;
        String line;

        while(scan.hasNext()){
            line = scan.nextLine();
            num = line.split("-|,");
            for (int i = 0; i < 4; i++){
                elf[i] = Integer.parseInt(num[i]);
            }

            if(elfFullyContained(elf)) contained++;
        }
        System.out.println(contained);
        scan.close();
    }


    public static boolean elfContained(int elf[]){
        if (elf[0] > elf[3]) return false;
        else if (elf[2] > elf[1]) return false;
        else return true;
    }

    public static boolean elfFullyContained(int elf[]){
        if(elf[0] <= elf[2] && elf[1] >= elf[3]) return true;
        if(elf[0] >= elf[2] && elf[1] <= elf[3]) return true;
        else return false;
    }
}
