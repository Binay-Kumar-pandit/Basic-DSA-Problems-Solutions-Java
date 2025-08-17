package Mathematics_Logic;
import java.lang.Math;

public class GCD {

    //The Euclidean Algorithm
    public static int findGCD1(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //Broute force approach
    public static int findGCD2(int n1,int n2){
        int min=Math.min(n1,n2);
        int gcd=0;
        for(int i=1; i<=min; i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        System.out.println(findGCD1(4,5));
    }
}
