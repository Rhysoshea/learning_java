package com.example.seriespackage;

public class Series {
    
    public static int nSum(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum+=i;
        }
        return sum;
        
    }

    public static int factorial(int n) {
        if (n==0) {
            return 0;
        }
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
 
    }

    public static int fibonacci(int n) {
        if (n==0 || n==1){
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }



}
