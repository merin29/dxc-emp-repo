package demo;

import java.util.Scanner;
import java.util.*;


public class Animal {
	
	public static final double FAVNUMBER = 1.6180;
	
	private String name;
	private int weight;
	private long uniqueID;
	private boolean hasowner=false;
	private byte age;
	private char favouriteChar;
	private float height;
	
	protected static int numberofAnimals = 0;
	
	
	static Scanner userinput = new Scanner(System.in);


	public Animal() {
		numberofAnimals++;
		int sumOfnumbers = 5+1;
		System.out.println("5+1="+sumOfnumbers);
		
		int diffofnumbers = 5-1;
		System.out.println("5-1="+diffofnumbers);
		
		int multofnumbers = 5*1;
		System.out.println("5*1="+multofnumbers);
	}
	
	
	
	
	public static void main(String[]args) {
		
		Animal a1=new Animal();
		
	}
	
	
	
	
	
	
	
	

}
