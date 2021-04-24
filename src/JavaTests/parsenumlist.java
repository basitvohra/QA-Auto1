package JavaTests;

import java.util.ArrayList;
import java.util.List;

public class parsenumlist {
	public static void main(String[] args) throws InterruptedException {
		
		//Array of Numbers
		 int[] mainList = new int[]{1,4,3,2,0,6,3,8,2,0,9,8}; 
		
		 List<Integer> newlist=new ArrayList<Integer>();  
		 List<Integer> zerolist=new ArrayList<Integer>();  
		 for (int i = 0; i < mainList.length; i++) {
			  System.out.println(i+": "+mainList[i]);
			  if (mainList[i] ==0) {
				  zerolist.add(mainList[i]);
			  } else
			  {
				  newlist.add(mainList[i]);
			  }
			}

		 for (int x = 0; x < zerolist.size(); x++) {
			 newlist.add(0);
		 }
		 System.out.println("------New LIst-----");
		 System.out.println(newlist);

	}	
}
