//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in
    import java.util.Scanner;
    public class oddorevendigitsum {

        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // number to be counted
            int input1=sc.nextInt();
            String input2=sc.next();
            int sum=0;
            int sign=(input1<0)?-1:1;
            if(input2.equals("odd")){
                int temp=input1;
                while(temp>0){
                    int d=temp%10;
                    if(d%2!=0){
                        sum+=d;
                    }temp/=10;
                }
            }
            else{
                int temp=input1;
                while(temp>0){
                    int d=temp%10;
                    if(d%2==0){
                        sum+=d;
                    }temp/=10;
                }
            }

            System.out.println(sum);}
    }