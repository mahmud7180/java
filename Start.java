public class Start{
	
    public static void main(String [] args){
	    Circle obj1=new Circle();
		obj1.setRadius(5);
		obj1.getRadius();
		obj1.getArea( );
		
	
		
		Square obj2=new Square();
		obj2.setSide(7);
		obj2.getSide();
        obj2.getArea();
		
		Rectangle obj3=new Rectangle();
		obj3.setLength( 9);
		obj3.setWidth( 8);
		obj3.getArea();
		
		Triangle obj4=new Triangle( );
		//Triangle obj4=new triangle(9,1);
		obj4.setHeight(8);
		obj4.setBase( 3);
		obj4.getArea();
		obj4.showinfo();
	}
}