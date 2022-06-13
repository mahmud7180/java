public class ScientificCalculator implements BasicCalculator extends ScientificCalculation{
    double value1;
     double value2;
    public double toThePow(){
   
        return value1*value2;

    }
    public ScientificCalculator(){

    }
     public void ScientificCalculator(double v1,double v2){
   
        value1=v1;
        value2=v2;
    }

}