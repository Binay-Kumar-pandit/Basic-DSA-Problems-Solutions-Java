package Mathematics_Logic;

import java.lang.Math;
import java.util.Scanner;

public class CheckArmstrong {
    public static int countDigits(int num){
        int count=0;
        while (num!=0) {
            num/=10;
            count++;
        }
        return count;
    }
    public static boolean isArmstrong(int num){
        int originalNum=num;
        int d=countDigits(num);
        double result=0;
        while (num!=0) {
            int lastDigit=num%10;
            double power=Math.pow(lastDigit,d);
            result+=power;
            num/=10;
        }
        return originalNum==result?true:false;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number to check armstrong:");
        int num=input.nextInt();
        input.close();
        String message=isArmstrong(num)?" is a armstrong Number":" is not a armstrong number.";
        System.out.println(num+message);
    }
}
