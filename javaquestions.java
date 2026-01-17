import java.util.Scanner;

import java.util.Scanner;
public class javaquestions {
    public static void main(String[] args) {
        //isEven?
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        if(input%2==0) {
            System.out.println("2");
        }else{System.out.println("1");}

        //isOdd?
        if(input%2!=0){System.out.println("2");}
        else{System.out.println("1");}

        //lastDigit?
        if(input<0){
            input = input*(-1);
        }
        if(input%10==0)  System.out.println("0");
        else System.out.println(input%10);
        //Secondlastdigit
        input = Math.abs(input);
        System.out.println( (input<10) ? -1:(input/10));

    }
    }
