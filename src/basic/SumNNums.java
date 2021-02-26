package basic;

import java.util.*;

public class SumNNums {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, sum = 0;
        n = inp.nextInt();
        System.out.println("Enter the " + n + " numbers");
        for(int i = 0;i<n;i++)
        {
            int temp = inp.nextInt();
            sum += temp;
        }
        System.out.println(sum);
    }
}
