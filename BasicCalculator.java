public class BasicCalculator implements Calculator{
    
	double value1;
	double value2;
	
	BasicCalculator(){
	
	System.out.println("empty constructor");
	}
	
	BasicCalculator(double v1,double v2){
	    value1=v1;
		value2=v2;
	}
	void setValue1(double v1){
	    value1=v1;
	}
	void setvalue2(double v2){
	    value2=v2;
	}
	double getValue1(){
	    return value1;
	}
	double getValue2(){
	    return value2;
	}
	
	public double add(){
	    
		return value1+value2;
	}
	public double subtract(){
	    
		return value1-value2;
	}
	public double multiply(){
	    
		return value1*value2;
	}
	public double divide(){
	    return value1/value2;
	}
	
}