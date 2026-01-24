import java.util.Scanner;

public class nthPrime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n to compute the nth prime number");
        int input1=sc.nextInt();
    sc.close();
    int nthPrime=findNthPrime(input1);
    System.out.println("The"+ input1+ "th prime number is" +nthPrime);}
     public static int findNthPrime(int n){
        int count=0;int num=1;
        while(count<n){
            num++;
            if(isPrime(num)){count++;}
        }
        return num;
        }
     public static boolean isPrime(int num){
        if(num<=1){return false;}
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0)return false;
        }
        return true;
        }}




