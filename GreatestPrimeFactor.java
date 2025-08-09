import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,c=0;
        int i,great=2;
        for(i=n-1;i>=2;i--){
            if(n%i==0){
                great=i;
                for(int j=1;j<=great;j++){
                    if(great%j==0){ 
                    c++;}
                }
                if(c==2){
                    System.out.println(great);
                }
                count++;
            }
        }
        if(count==0){
            System.out.println(n);
        }
        
    }
}
