package basic;

import java.util.Scanner;

public class Functions {
    // return_type func_name(params)
    int calculateSum(int n){
        Scanner inp = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the " + n + " numbers");
        for(int i = 0;i<n;i++)
        {
            int temp = inp.nextInt();
            sum += temp;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        System.out.println(new Functions().calculateSum(n));
    }
}
