package dynamicProgramming;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fibo1 = Fibo(7);
		int fibo2 = FiboTabulation(7);
		System.out.println(fibo1);
		System.out.println(fibo2);
	}
	
	private static int Fibo(int i) {
		if(i <= 0) {
			return 0;
		} else if(i==1) {
			return 1;
		} else return Fibo(i-1)+Fibo(i-2);
	}
	
	private static int FiboTabulation(int i){
		int[] array = new int[i+1];
		array[0]=0;
		array[1]=1;
		for(int j=2;j<i+1;j++) {
		array[j]= array[j-1]+array[j-2];	
		}
		return array[i];
	}
}
