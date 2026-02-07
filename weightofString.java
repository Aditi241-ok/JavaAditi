import java.util.Scanner;
public class weightofString {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String input1=sc.nextLine();
    int input2=sc.nextInt();
    int twei=0;
	for(int i=0;i<input1.length();i++){
        char c=input1.charAt(i);
        if(Character.isLetter(c)){
            char C=Character.toLowerCase(c);
            if(input2==0 && (C=='a' ||C=='e'||C=='i' || C=='o' || C=='u')){
                continue;
            }twei+=(C-'a'+1);
        }
    }
        System.out.println(twei);}}


