import java.util.Scanner;

public  class hillproblem {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int input1=sc.nextInt();//input to take level of hills
    int input2=sc.nextInt();//input to take first hill
    int input3=sc.nextInt();//input to take increment of hill
    int sum=0;//totalsum
    int curr=input2;//to iterate
    for(int i=1;i<=input1;i++){
    sum+=curr*i;
    curr+=input3;
}
System.out.println(sum);



}


}
