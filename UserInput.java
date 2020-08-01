package userInput;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner (System.in);
		int princple =sc.nextInt();
		float rate =sc.nextFloat();
	
		int time =sc.nextInt();
		float SimpleInterest  = princple * rate * time / 100 ;
		System.out.println("the simple interest is "+SimpleInterest );

}
}