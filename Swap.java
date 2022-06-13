public class swap{
     
	     public void method1() { 
	     int x = 50; 
		 int y = 100; 
		 swap(x,y); 
		 System.out.println("x is:" + x + " y is:" + y);
		 }
         public void swap(int var1, int var2) { 
		     int temp = var1; 
			 var1 = var2; 
			 var2 = temp; 
			 System.out.println("var1 is:" + var1 + " var2 is:" + var2);
			 }
			 
	    public static void main(String[] args){
			swap obj=new swap();
			obj.method1();
			obj.swap(50,100);
			
	    }	
}
	
	 