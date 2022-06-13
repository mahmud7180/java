public class C extends B{
    public int c;
	public C(){
	    System.out.println("inside C empty");
	}
	
	public C(int c){
	    super(20);
		this.c=c;
		System.out.println("c is constructor -valued");
		
	}
	public void show(){
	    System.out.println("show: "+ a+ " "+c);
		a++;c*=2;
	}
}