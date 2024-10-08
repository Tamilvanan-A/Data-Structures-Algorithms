package org.example.Math;

public class LCM_GCD {
    public static void main(String[] args) {
        System.out.println(gcd(12, 6));
        System.out.println(lcm(2, 7));
    }
    static int gcd(int a ,int b) {
        if(a==0) {
            return b;
        }
        return gcd(b%a,a);
    }
    static int lcm(int a, int b) {
        return a*b/gcd(a,b);
    }
}
