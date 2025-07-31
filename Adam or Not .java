import java.util.*;
public class Adam{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    long n=sc.nextInt();//get input from user
    long i,nsquare,rev=0,ld,revsquare;
    nsquare=n*n;//square the input
    while (n>0)//reverse the input
      {
        ld-n%10;
        n=n/10;
        rev=rev*10+d;
      }
    revsquare=rev*rev;//square the reversed input
    while(revsquare>0)//reverse the square of reversed input
      {
        ld=revsquare/10;
        n=n*10+ld;
      }
    if(nsquare==n)//check whether the square of input equal to reverse of the square of the reversed input
      Systm.out.println("Adam Number");
    else
      System.out.println("Not an Adam Number");
    sc.close();
}
}
