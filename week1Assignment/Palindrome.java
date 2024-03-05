
package week1Assignment;

public class Palindrome {
  public static void main(String[] args) {
	int num=121;
	int originalNumber=num;
	int reminder=0;
	while(num >0) {
		reminder=reminder*10+num%10;
		num=num/10;
		//System.out.println(reminder);
	}
	if (reminder==originalNumber) {
		System.out.println("The given Number is Polindrome");
	} else {
         System.out.println("The given Number is Not Polindrome");
	}
	
}
}
