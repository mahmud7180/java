public class A{
    public int a;
	
	public A(){
	    this(0);
		System.out.println("inside A is empty");
	}
	
	public A(int a){
	    this.a=a;
		System .out.println("A is constructor- valued");
	}
	public void show(){
	    System.out.println("show: "+a);
		a-=1;
	}
	
}