package Day1;
import java.io.*;
import java.util.ArrayList;

public class find2020 {

    public static Result something(int one, int two, int three){
        int number1 = one;
        int number2 = two;
        int number3 = three;

        return new Result(number1, number2, number3);
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
        System.out.println("first: " + found.getFirst()  + " second: " + found.getSecond() + " third: " + found.getThird());
    }


    public static Result check2020(ArrayList<Integer> expenses){
        for(int i = 0; i < expenses.size() - 1; i++){
            for(int j = 1; j < expenses.size() - 2; j++){
                for(int k = 2; k < expenses.size() - 3; k++){
                    int sum = expenses.get(i) + expenses.get(j) + expenses.get(k);
                    if(sum == 2020){
                        Result xx = something(expenses.get(i), expenses.get(j), expenses.get(k));
                        return xx;
                }
//                int sum = expenses.get(i) + expenses.get(j);

                }
            }
        }return null;
    }
}

final class Result {
    private final int first;
    private final int second;
    private final int third;

    public Result(int first, int second, int third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public int getFirst(){
        return first;
    }

    public int getSecond(){
        return second;
    }

    public int getThird() { return third; }
}

