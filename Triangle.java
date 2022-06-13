public class Triangle{
    double height;
	double base;
	
	Triangle(){
	    
	}
	void Triangle(double height ,double base){
	    this.height=height;
		this.base=base;

	}
	void setHeight(double height){
	    this.height=height;
	}
	void setBase(double base){
	    this.base=base;
	}
	double getHeight(){
	    return base;  
	}
	double getBase(){
	    return base;
	}
	double getArea(){
	    return 0.5 * height * base;
	}
	public void showinfo(){
				System.out.println(height);
	}
	
}