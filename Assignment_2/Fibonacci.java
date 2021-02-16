package Assignment_2;

import java.util.*;
public class Fibonacci {

    static int Fibonacci(int n){
        if(n <= 1)
            return 1;
        return (Fibonacci(n - 1) +  Fibonacci(n - 2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        System.out.println(Fibonacci(n));
    }
}
