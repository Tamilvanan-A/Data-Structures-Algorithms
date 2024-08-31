package org.example.LinearSearch;

public class StringSearch {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'l';
        System.out.println(stringSearch(name,target));
    }
    static int stringSearch(String str,char target) {
        if(str.length()==0) {
            return -1;
        }
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)==target) {
                return i;
            }
        }
        return -1;
    }
}
