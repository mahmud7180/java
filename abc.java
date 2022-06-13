import java.util.Scanner;
 
public class Abc{
     public static void main(String[] args){
	 
        char x;
		Scanner input=new Scanner(System.in);
		System.out.print("input= ");
		x=input.nextChar();
		if('a','e','i','o','u'){
		     System.out.println("vowel number");
		
		}
		else{
		     System.out.println("consonant");
		}
     }   	 
}