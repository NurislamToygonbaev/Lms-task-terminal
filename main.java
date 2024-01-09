import java.util.Scanner;

public class main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scanForStr = new Scanner(System.in);

		String str = "Hello World";
		System.out.println(str + ": Hello world");


		// second
		
		System.out.println("enter first number");
		int firstNumber = scanner.nextInt();

		System.out.println("enter second number");
		int secondNumber = scanner.nextInt();

		System.out.println("enter action (+ | - | * | /)");
		String action = scanForStr.nextLine();

		if ( action.equalsIgnoreCase("+"){
			System.out.println(firstNumber + secondNumber);
		} else if ( action.equalsIgnoreCase("-"){
			System.out.println(firstNumber - secondNumber);
		} else if ( action.equalsIgnoreCase("*"){
                        System.out.println(firstNumber * secondNumber);
                } else if ( action.equalsIgnoreCase("/"){
                        System.out.println(firstNumber / secondNumber);
                } else System.out.println("Incorrect type!!!");



		// thrid


		int[] array = {21, 3, 64, 17, 8, 14);

		int maxElement = array[0];	
		for (i = 0; i < array.lenght; i++){
			if (maxElement > array[i]){
				maxElement = array[i];
			}
		}	

		System.out.println("max element " + maxElement);


		// four


		int num = 0;

		if (num > 0){
			System.out.println("Он сан");
		} else if (num == 0){
			System.out.println("нолго барабар");
		} else System.out.println("терс сан");


		// five


		for (i = 1; i <= 10 ; i++){
			System.out.println(" "+ i +" ");
		}








	}
}
