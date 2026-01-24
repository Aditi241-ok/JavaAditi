//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in
    import java.util.Scanner;
    public class countdigits {

        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // number to be counted
            long input=sc.nextLong();
        int count=0;
        Long temp=input;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
System.out.println("Number of digits in your number are "+count);



        }}
