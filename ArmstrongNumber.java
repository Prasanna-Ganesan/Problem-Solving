import java.util.*;
public class ArmstrongNumber {
    public static void main(String[]args){
        int input,count=0,copy,sum=0,digit,power;
        Scanner sc=new Scanner(System.in);
        input=sc.nextInt();
        copy=input;
        while(input>0){
            input/=10;
            count++;
        }
        input=copy;
        while(input>0){
            digit=input%10;
            input=input/10;
            power=1;
            for(int i=1;i<=count;i++){
                power=power*digit;
            }
            sum=sum+power;
        }
        if(copy==sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
        sc.close();
    }
}
