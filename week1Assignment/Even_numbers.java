package week1Assignment;

public class Even_numbers {

	 public static void main(String[] args) {
			
			int num=10;
			System.out.println("Even numbers between 1 to "+num);
			for (int i = 1; i <= num; i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}

}
}
