import java.util.Scanner;
public class Switch{
     public static void main(String[] args){
	     Scanner input=new Scanner(System.in);
		 int a;
		 System.out.println("input: ");
		 a=input.nextInt();
		 
		 switch(a){
		     case 0:
			 System.out.println("zero");
			 break;
			 
			 case 1:
			 System.out.println("one");
			 break;
			 
			 case 2:
			 System.out.println("two");
			 break;
			 
			 case 3:
			 System.out.println("three");
			 break;
			 
			 case 4:
			 System.out.println("four");
			 break;
			 
			 case 5:
			 System.out.println("five");
			 break;
			 
			 default:
			 System.out.println("wrong key word");
			 break;
		 }
	 }
}