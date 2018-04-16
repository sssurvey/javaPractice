import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class SolutionTwo {

    public static int numberNeeded(String first, String second) {
        int total = first.length()+second.length();
        int minus = 0;
        String [] firstArr = first.split("");
        String [] secondArr = second.split(""); //arr[0] = empty

        for (int i = 0; i < firstArr.length; i++){
            for (int j = 0; j < secondArr.length; j++){
                if(firstArr[i].equals(secondArr[j])){
                    minus = minus + 2; //take the same number out and all the char come in pairs thus +2
                    secondArr[j] = null;
                    break;
                }
            }
        }
        return total-minus;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

