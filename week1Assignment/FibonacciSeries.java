package week1Assignment;

public class FibonacciSeries {
	   
	public static void main(String[] args) {
		
		int num = 5, term1=0, term2=1, term3;
		System.out.println("list out the "+num+" fibonaccis");
		for (int i = 0; i <= num; i++) {
			System.out.println(term1);
			term3=term1+term2;
			term1=term2;
			term2=term3;
					
		}
	}

}
