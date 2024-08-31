package org.example.String;

public class palindrome {
    public static void main(String[] args) {
       String s = "A man, a plan, a canal: Panama";
        System.out.println(palindrome(s));
    }
    static boolean palindrome(String s) {
            if(s.length()==0 || s==null) {
                return true;
            }
            s = s.toLowerCase();
            for (int index = 0; index <= s.length() / 2; index++) {
                char start = s.charAt(index);
                char end = s.charAt(s.length() - 1 - index);
                    if (start != end) {
                        return false;
                    }
                }
            return true;
        }
}
