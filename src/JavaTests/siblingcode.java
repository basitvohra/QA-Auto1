package JavaTests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class siblingcode {
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int inputa = myObj.nextInt();
		System.out.println("Enter Array: ");
		int[] inputb = new int[inputa];
		for(int i=0; i<inputa; i++)  
		{
			inputb[i]=myObj.nextInt();  
		} 
		System.out.println("Enter Fetch Sibling: ");
		int inputc = myObj.nextInt();

		System.out.println("Result: " + findsibling(inputb,inputc));
	}
	public static List<Integer> findsibling(int list[], int input){
		 List<Integer> ret=new ArrayList<Integer>();  
		 if (input>list.length-1 || input<list[0])
		 {
			 ret.add(-1);
		 }
		 else {
		 for (int i = 0; i < list.length; i++) {
			 if(list[i]==input) {
				
				 if (i!=0 && i!=list.length-1 ) {
					 ret.add(list[i-1]);
					 ret.add(list[i+1]);
					 
				 }
				 else {
					 ret.add(-1);	 
				 }
			 }

		 }}
		return ret;
	}
}
