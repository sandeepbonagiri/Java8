package package1;

import java.util.Arrays;

import com.sun.tools.javac.util.List;

public class FunctionalProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //List<String> list2 = List.of("Sandeep:Bonagiri", "Ravi:Kumar",
		// "Sreekanth:Bonagiri"); 
		 String[] str = {"Sandeep:Bonagiri", "Ravi:Kumar",
				 "Sreekanth:Bonagi"};
		 String[] str2 = {"Sandeep","Ravi","Sreekanth"};
		 for(String str1 : str) 
		 {
			 System.out.println(str1);
			 String [] parts =str1.split(":");
			System.out.println(parts[0]);
			
			 if(parts[0].equalsIgnoreCase(str2[0]))
					 {
				 
				 System.out.println(true);
				 System.out.println(parts[0]);
				 //added new code
				 System.out.println("statshing my chnages");
				 System.out.println(false);
				 System.err.println(parts[0]);
				 System.out.println(str2[0]);
			  
			  }
			 else {
				 System.out.println(false);
				 System.err.println(parts[0]);
				 System.out.println(str2[0]);
				 System.out.println(false);
				 System.err.println(parts[0]);
				 System.out.println(str2[0]);
				 System.out.println(false);
				 System.err.println(parts[0]);
				 System.out.println(str2[0]);

			 }
		  
		 }
		 
		 
	}
}

		

	