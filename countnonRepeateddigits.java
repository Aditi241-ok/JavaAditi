//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in
    import java.util.Scanner;
    public class countnonRepeateddigits {

        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // number to be counted
            int input1=sc.nextInt();
           int c=0;
           int []a=new int[10];
           while(input1>0) {
               int d = input1 % 10;
               a[d]++;
               input1 = input1 / 10;
           }for(int i=0;i<10;i++){
               if(a[i]==1){c++;
               }
        }System.out.println(c);}
    }