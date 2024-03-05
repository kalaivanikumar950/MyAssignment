package week1Assignment;

public class Prime_Numbers {
   public static void main(String[] args) {
	
	int num=11,count=0;
	for (int i = 1; i <=num; i++) {
		if(num%i==0) {
			count++;
		}
	}
	if(count==2) {
		System.out.println("The given number is Primenumber");
	}
	else {
		System.out.println("the given number is not Primenumber");
	}
}
}  
