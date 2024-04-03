package task12Programs;

import java.util.TreeMap;

public class Q3 {
	
	public static void main(String[] args) {
		
		 TreeMap<Integer, String> employees = new TreeMap<>();
		 
		 employees.put(5002, "gokul");
	        employees.put(5005, "zen");
	        employees.put(5008, "Arun");
	        employees.put(5001, "Ravi");
	        
	    
	      
	        System.out.println("Names of all employees in alphabetical order:");
	        
	        for (String name : employees.values()) {
	            System.out.println(name);
	        }
	    }
	}

