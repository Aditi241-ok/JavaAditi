import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int input1=sc.nextInt();
        int count=0;
        for(int i=1;i<=input1;i++){
            if(input1%i==0){
                count++;
            }
        }
        if(count==2){System.out.println(" 2");}
        else{System.out.println("1");}
    }

          }
    }
