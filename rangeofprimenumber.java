import java.util.Scanner;

public class rangeofprimenumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n to compute the nth prime number");
        int input1=sc.nextInt();
        int input2=sc.nextInt();
    sc.close();
    int nthPrime=rangeofprime(input1,input2);}
    public static int rangeofprime(int lower,int upper){
        int count=0;
        if(lower<=2){lower=2;}
        for(int i=lower;i<=upper;i++)

            if(isPrime(i)){System.out.println(i+" ");}

        return count;
        }
     public static boolean isPrime(int num){
        if(num<=1){return false;}
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0)return false;
        }
        return true;
        }}




