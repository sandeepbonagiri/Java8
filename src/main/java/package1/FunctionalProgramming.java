package package1;

import java.util.Arrays;

import com.sun.tools.javac.util.List;

public class FunctionalProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //List<String> list2 = List.of("Sandeep:Bonagiri", "Ravi:Kumar",
		// "Sreekanth:Bonagiri"); 
		 String[] str = {"Sandeep:Bonagiri", "Ravi:Kumar",
				 "Sreekanth:Bonagiri"};
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
				 System.out.println(str2[0]);
				 //added new code
				 System.out.println(str2[1]);
				 System.out.println(str2[1]);

			  
			  }
			 else {
				 System.out.println(false);
				 System.err.println(parts[0]);
				 System.out.println(str2[0]);

			 }
		  
		 }
		 
		 


		/*
		 * String string = "Sandeep:Bonagiri", "Sandeep:Avinash"; String[] parts =
		 * string.split(":"); String part1 = parts[0]; // 004- String part2 = parts[1];
		 * // 034556 System.out.println(part1); System.out.println(part2);
		 */

		
	}

}
