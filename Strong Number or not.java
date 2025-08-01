import java.util.*;
public class Strong{
  public static void main(String[]args){
    long n,ld,fact=1,sum=0,i,copy;
    n=sc.nextLong();
    copy=n;
    while(n>0){
      ld=n%10;
      fact=1;
      for(i=1;i<=ld;i++)
      {
        fact=fact*i;
        sum=sum+fact;
        n=n/10;
      }
      if(copy==sum)
        System.out.println("Strong Number");
      else
        System.out.println("Not a Strong Number");
  }
}
