package Day1;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;

public class find2020 {

    public static void main(String[] args){

        BufferedReader br = new BufferedReader(new FileReader("input.csv"));

        ArrayList<Integer> expenseList = new ArrayList<>(Arrays.asList(1721, 979, 366, 299, 675, 1456));
        int found = check2020(expenseList);
        System.out.println(found);
    }


    public static int check2020(ArrayList<Integer> expenses){
        for(int i = 0; i < expenses.size() - 1; i++){
            for(int j = 1; j < expenses.size() - 2; j++){
                int sum = expenses.get(i) + expenses.get(j);
                if(sum == 2020){
                    return sum;
                }
            }
        }return -1;
    }

    public static List<>
}
