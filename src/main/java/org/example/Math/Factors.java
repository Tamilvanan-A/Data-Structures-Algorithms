package org.example.Math;

public class Factors {
    public static void main(String[] args) {
        factor1(20);
    }
    static void factors(int n) {
        for(int i=1;i<=n;i++) {
            if(n%i==0) {
                System.out.println(i);
            }
        }
    }
    static void factor1(int n) {
        for(int i=1;i<Math.sqrt(n);i++) {
            if(n%i==0) {
                if(n/i==i) {
                    System.out.print(i + " ");
                } else {
                    System.out.println(i + " " + n/i +" ");
                }
            }
        }
    }
}
