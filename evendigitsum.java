//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in
    import java.util.Scanner;
    public class evendigitsum {

        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // number to be counted
            int input1=sc.nextInt();
            int sum=0;
            int sign=(input1<0)?-1:1;
            int temp=Math.abs(input1);
            while(temp>0)
            {
                if(temp==0){
                    temp=sum;
                    sum=0;}
                int d=temp%10;
                if(d%2==0){sum+=d;}
                temp/=10;
            }System.out.println( sum*sign);
        }}