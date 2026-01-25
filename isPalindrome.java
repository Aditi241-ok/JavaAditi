//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in
    import java.util.Scanner;
    public class isPalindrome {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // number to be counted
            int input1 = sc.nextInt();
            int temp = input1;
            int rev = 0;
            int rem;
            while (temp > 0) {
                rem = temp % 10;
                rev = rev * 10 + rem;
                temp /= 10;
            }
            if (rev == input1) {
                System.out.println("2");
            } else {
                System.out.println("1");
            }
        }}