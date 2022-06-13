public class PhoneLock{
	     String MobileOwnerName;
		 String MobileNumber;
		 String MobileBalance;
		 String MobileOSName;
		 
		 void setMobileOwnerName(String newValue){
		     MobileOwnerName= newValue;
		 
		 }
		 String getMobileOwnerName(){
		     return MobileOwnerName;
		 }
		 
		 void setMobileNumber(String newValue){
		     MobileNumber= newValue;
		 
		 }
		 String getMobileNumber(){
		     return MobileNumber;
		 }
		 
		 void setMobileBalance(String newValue){
		     MobileBalance= newValue;
		 
		 }
		 String getMobileBalance(){
		     return MobileBalance;
		 }
		 
		 void getMobileOSName(String newValue){
		     MobileOSName= newValue;
		 
		 }
		 String getMobileOSName(){
		     return MobileOSName;
		 }
		 
		 void showInfo(){
		 
		     System.out.println("mobileOwnerName= " + MobileOwnerName + "mobileNumber+ " + MobileNumber + "mobileBalance" + MobileBalance + "mobileOSName= " + MobileOSName);
		 
		 }
	 public static void main(String[] args){
	 
         PhoneLock obj1=new PhoneLock();
		 PhoneLock obj2=new PhoneLock();
		 
		 
		     System.out.println("enter your password");
			 
	     obj1.setMobileOwnerName("ankon sarker");
		 obj1.setMobileNumber("01767****");
		 obj1.setMobileBalance("50/-");
		 obj1.getMobileOSName("As2");
		 obj1.showInfo();
			
	 }
	}