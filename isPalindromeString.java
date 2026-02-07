
import java.util.Scanner;

public class isPalindromeString {

public  static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
      String input1 = sc.nextLine();
    int i=0;
    int j=input1.length()-1;
    while(i<j){
        char c1=Character.toLowerCase(input1.charAt(i));
        char c2=Character.toLowerCase(input1.charAt(j));
        if(c1!=c2){
            System.out.println(1);}
        i++;
        j--;}
    System.out.println(2);}}

