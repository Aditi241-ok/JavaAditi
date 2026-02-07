
import java.util.Scanner;

public class wordUppercase{

public  static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    String input1 = sc.nextLine();
    String[] arr = input1.split(" ");
    if (arr.length < 2) {
        System.out.println("LESS");
    }
    System.out.println(arr[1].toUpperCase());

}}