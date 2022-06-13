public class Rectangle{
    double length;
	double width;
	
	public Rectangle(){
	
	}
	
	void Rectangle(double length,double width){
	    this.length=length;
		this.width=width;
	}
	void setLength(double length){
	    this.length=length;
	}
	void setWidth(double width){
	    this.width=width;
	}
	double getLength(){
	    return length;
	}
	double getWidth(){
	    return width;
	}
	double getArea(){
	    return length*width;
	}
}