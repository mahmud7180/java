import java.io.*;
public class CopyFileCharStream{

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;
	  FileWriter out1 = null;
      try {
         in = new FileReader("input.txt");
         out = new FileWriter("output.txt");
		 out1 = new FileWriter("output1.txt");
		 String str="Hello";
		 out1.write(str);
		 out1.close();
		 
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }
	  catch(Exception e){
		  System.out.println("There is an exception "+e+"please solve the issue");  
	  }
	  finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
