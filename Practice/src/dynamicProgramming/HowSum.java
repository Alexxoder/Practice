package dynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HowSum {

	public static void main(String[] args) {
		
		// The function should return an array containing any combinations of 
		//elements that add up to  exactly the targetsum. 
		//If there is no combination that adds up to targetsum, then return null
		
		int[] arrayint = {5,3,4};
		int target = 7;
		System.out.println("howsum");
		System.out.print("target ");
		System.out.println(target);
		System.out.print("input ");
		System.out.print("[");
		for(int i = 0;i<arrayint.length;i++) {
			
			if(i>0) {
				System.out.print(",");
			}
			System.out.print(arrayint[i]);

		}
		System.out.println("]");
		System.out.print("output ");
		Map<Integer,ArrayList<Integer>> collection = new HashMap<>();
		System.out.println(howSum(target,arrayint,collection));

	}
	static ArrayList<Integer> howSum(int target,int[] array,Map<Integer,ArrayList<Integer>> memo) {
			
			//if the memo contains value return the arraylist
			if(memo.containsKey(target)) {
				return memo.get(target);
			}
			
			ArrayList<Integer> res;
			
			//base case, if the target == 0 return an empty arraylist
			if(target == 0) {
				res = new ArrayList<Integer>();
				return  res;
			}
			
			//if target < 0, another base case, 
			//return null
			if (target < 0) {
				return null;
			}
			
			for(int i = 0;i<array.length; i++) {
				
				int resta = target - array[i];
				res = howSum(resta,array,memo);
				
				//execute only if res not null and not contain the value of target
				if (res != null && !memo.containsKey(target)) {
					
					res.add(array[i]);
					memo.put(target, res);
					return res;
				}
			}
			 //if target cant be reached
			memo.put(target, null);
			return null;
			
		}
	
}
