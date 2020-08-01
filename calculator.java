import java.util.Scanner;

public class calculator {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter First no.");
		int a = sc.nextInt();
		
		System.out.println("Enter Second no.");
		int b =sc.nextInt();
		
	System.out.println("Enter The operation");
	sc.nextLine();
	
	char opreation = sc.nextLine().charAt(0);
	
 int Result = 0;

	switch(opreation) {
	case '+':
		Result = a+b;
		break;
		
	case'-':
		Result = a-b;
		break;
		
	case '*':
		Result = a*b;
		break;
		
	case '/':
		Result = a/b;
		break;
		
		default:
			System.out.println("invalid operation");
	}
	System.out.println("the result is "+Result);
	}

}
