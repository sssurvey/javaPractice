//Haomin Shi
//Mar 28, 2018
//https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionOne {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int[] old_array = a;
        int[] new_array = new int[n]; //create that is the same length
        int[] left_out = new int[k]; //an array for left outs
        int array_length = n; //5
        int shift_amount = k; //4
        int shift_amount_cpy = k;
        int array_index_total = n-1; //0,1,2,3,4, = 5 elements
        int manipulation = n-k; //for loop // 1
        int manipulation_cpy = manipulation;

        //deal with the unchanged first, to me is the remainder of the shift
        for (int i = 0; i < manipulation_cpy; i++){
            new_array[i] = old_array[shift_amount_cpy++];
        } //i think its done

        for (int i = 0; i < shift_amount; i++){
            new_array[manipulation_cpy++] = old_array[i];
        }

        return new_array;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}

