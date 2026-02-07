
import java.util.Scanner;

public class isPalindromePossible {

public  static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[10];
        while (num > 0) {
            arr[num % 10]++;
            num /= 10;
        }
        int c = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                c++;
            }
            if (c <= 1) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
        }
    }}