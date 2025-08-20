import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();//get input as string
        int l=a.length();//calculate length of string
      //reverse the string using for loop
        for(int i=l-1;i>=0;i--){
            char ch=a.charAt(i);
            System.out.print(ch+"");
        }
    }
}
