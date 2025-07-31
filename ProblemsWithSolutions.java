//Reverse a Number--JAVA
//get  integer input n from user.
//reverse the integer and print the output.
import java.util.*;
public class ReverseSolution{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int rev = 0,digit;
      while(n > 0){
        digit = n % 10;
        n = n / 10;
        reverse = reverse * 10 + digit;
      }
    System.out.println(reverse);
  }
}
