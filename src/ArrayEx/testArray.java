package ArrayEx;

import java.util.Scanner;

public class testArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String names[] = new String [5];
		int greade[] = new int [5];
		for( int x=0; x<names.length; x++) {
		System.out.println("enter Student Number" + String.valueOf(x+1));
		names[x] = sc.next();
		System.out.println("enter Student Greade" + String.valueOf(x+1));
		greade[x] = sc.nextInt();
		
		}
		for(int x =0; x<greade.length; x++) {
			
			System.out.println("Student Name"+"  "+ String.valueOf(x+1 ) +names[x] +" ; Greade " +greade[x]);
			
		}
	
		
		;
	}

}
