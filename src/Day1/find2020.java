package Day1;
import java.io.*;
import java.util.ArrayList;

public class find2020 {

    public static Result something(int one, int two){
        int number1 = one;
        int number2 = two;

        return new Result(number1, number2);
    }

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\cattoy\\Documents\\Java Projects\\Advent Code\\adventcode\\src\\Day1\\input.csv";
        File f = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(f));
        String dataRow = br.readLine();
        ArrayList<Integer> listOfExpenses = new ArrayList<Integer>();
        while (dataRow != null){
            listOfExpenses.add(Integer.parseInt(dataRow));
            dataRow = br.readLine();
        }
        Result found = check2020(listOfExpenses);
        System.out.println(found.getFirst() + "first" + "second" + found.getSecond());
    }


    public static Result check2020(ArrayList<Integer> expenses){
        for(int i = 0; i < expenses.size() - 1; i++){
            for(int j = 1; j < expenses.size() - 2; j++){
                int sum = expenses.get(i) + expenses.get(j);
                if(sum == 2020){
                    Result xx = something(expenses.get(i), expenses.get(j));
                    return xx;
                }
            }
        }return null;
    }
}

final class Result {
    private final int first;
    private final int second;

    public Result(int first, int second){
        this.first = first;
        this.second = second;
    }

    public int getFirst(){
        return first;
    }

    public int getSecond(){
        return second;
    }
}

