//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in
    import java.util.Scanner;
    public class countuniquedigits {

        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // number to be counted
            int input1=sc.nextInt();
            int []a=new int[10];
            int c=0;
            while(input1>0){
                int d=input1%10;
                if(a[d]==0){
                    a[d]=1;
                    c++;
                }
                input1=input1/10;
            }System.out.println(c);
        }
    }