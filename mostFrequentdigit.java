import java.util.Scanner;

public class mostFrequentdigit {
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       int input1=sc.nextInt();
       int input2=sc.nextInt();
       int input3=sc.nextInt();
       int input4=sc.nextInt();


       int []arr=new int[10];
    while(input1!=0){
        arr[input1%10]++;
        input1/=10;
    }
    while(input2>0){
        arr[input2%10]++;
        input2/=10;
    }while(input3>0){
        arr[input3%10]++;
        input3/=10;
    }while(input4>0){
        arr[input4%10]++;
        input4/=10;
    }int max=-1;
    int f=-1;
    for(int i=0;i<10;i++){
        if(arr[i]>max){
            max=arr[i];

        }
    }for(int i=9;i>=0;i--){if(arr[i]==max){
        f=i;
        break;}}
    System.out.println( f);}}
