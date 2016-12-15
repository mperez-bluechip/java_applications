import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Review {

		public static void main(String[] args) throws IOException {
// 		TODO Auto-generated method stub
//      VARIABLES
			
//		String myName = "Manny";
//		float faveNumber = 5; 
//		System.out.println(myName + "'s favorite number is " + faveNumber);
//		Review.exampleStatic();
		Review myReview = new Review();
//		myReview.exampleMethod()
//		myReview.exampleArgMethod("print this string!");
		
//		Arrays
		
//		String[] breakfast = new String[3];
//		breakfast[0] = "Bacon";
//		breakfast[1] = "Eggs";
//		breakfast[2] = "Toast";
		
//		System.out.println(breakfast[0]);
		
//		Looping
		
//		for(int i = 0; i < breakfast.length; i++){
//			System.out.println(breakfast[i]);
//		}
//		
//		}
//   	FUNCTIONS
		
//      Non-static
//		public void exampleMethod(){
//			System.out.println("exampleMethod");
//		}
		
//		Static
		
//		public static void exampleStatic() {
//			System.out.println("exampleStatic");
//		}
// 		With argument
//		public void exampleArgMethod(String message){
//			System.out.println(message);
//		}
		
//		Conditional Statements
		
//		one value
		
//		if(1 == 0){
//			System.out.println("statement is true");
//		}else{
//			System.out.println("statement is false");
//		}
		

		
//		or operator
		
//		if(1 == 0 || 1 == 1){
//			System.out.println("statement is true");
//		}else{
//			System.out.println("statement is false");
//		}
		
//		and operator
		
//		if(1 == 0 && 1 == 1){
//			System.out.println("statement is true");
//		}else{
//			System.out.println("statement is false");
//		}
		
//		else if statements
		
//		if(1 == 0 && 1 == 1){
//			System.out.println("statement is true");
//		}else if(0 == 0){
//			System.out.println("else if statement is true");
//		}else{
//			System.out.println("statement is false");
//		}
		
//		create instance of 'MyClass'
		
//		MyClass mc = new MyClass();
//		System.out.println(mc.myNum);
//		mc.myMethod();
		
//		create user input interaction
		
//		System.out.println("Enter first number: ");
//		Scanner scan = new Scanner(System.in);
//		int num1 = scan.nextInt();
//		System.out.println("Enter second number: ");
//		int num2 = scan.nextInt();
//		System.out.println("Sum is " + (num1 + num2));
		
//		reading text from a file
		
		FileReader file = new FileReader("hello");
		BufferedReader reader = new BufferedReader(file);
		String data;
		while((data = reader.readLine()) != null){
			System.out.println(data);
		}
		reader.close();
	}
		
}		



