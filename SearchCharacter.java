import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        String ch=s.next();
        s.nextLine();
        String a=s.nextLine();
        if(a.contains(ch)){
            System.out.println("Present");
        }
        else{
            System.out.println("Not Present");
        }
    }
}
