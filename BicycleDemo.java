class BicycleDemo{
	public static void main(String [] args){
		Bicycle obj1=new Bicycle();
		Bicycle obj2=new Bicycle();
		
		obj1.changeCadence(50);
		obj1.speedUp(10);
		obj1.changeGear(2);
		obj1.printStates();
		
		obj2.changeCadence(50);
		obj2.speedUp(10);
		obj2.changeGear(2);
		obj2.changeCadence(40);
		obj2.speedUp(10);
		obj2.changeGear(3);
		obj2.printStates();
	}
}