import java.util.Scanner;

public class prifibonaccci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int input1=sc.nextInt();
        int a=0,b=1,c=0;
        if(input1==1)System.out.println("0");
        if(input1==2) System.out.println("1");
        for(int i=3;i<=input1;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);}


}

