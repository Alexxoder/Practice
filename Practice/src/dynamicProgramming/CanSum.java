package dynamicProgramming;

public class CanSum {

	public static void main(String[] args) {
		
		// Given a set of non-negative integers and a value target, 
		//the task is to check if there is a subset of the given set 
		//whose sum is equal to the given sum. 
		
		int[] arrayint = {5,3,4};
		int target = 7;
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
		System.out.println(canSum(target,arrayint));
	}
	
	static boolean canSum(int target, int[] array) {
		
		boolean[] tabla = new boolean[target +1];
		
		tabla[0] = true;
		
		for(int j=0;j<tabla.length;j++) {
			
			for(int i=0; i<array.length;i++) {
				
				if(array[i]+j<tabla.length && tabla[j]!= false) {
					tabla[array[i]+j] = true;
				}
			}
		}
	
		return tabla[target];
		
	}

}
