import java.io.*;
public class FizzBuzz {
	public static BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws
	NumberFormatException , IOException {
		do {System.out.println("   JAVA FIZZBUZZ PROGRAM");
		int Fizz = getValidInt("Enter Fizz number: "); 
		while (Fizz < 0) {
			System.out.print("ERROR: Negative numbers are not allowed! Try again: ");
			Fizz = Integer.parseInt(cin.readLine ());
		}
		int Buzz = getValidInt("Enter Buzz number: ");
		while (Buzz < 0) {
			System.out.print("ERROR: Negative numbers are not allowed! Try again: ");
			Buzz = Integer.parseInt(cin.readLine ());
		}
		int startnum = getValidInt("Enter starting number: ");
		int endnum = getValidInt("Enter ending number: ");
		while (endnum < startnum) {
			System.out.print("ERROR: Ending number cannot be less than starting number! Try again: ");
			endnum = Integer.parseInt(cin.readLine ());
		}
		System.out.print("\n");
		int i = 0;
		for (i = startnum; i <= endnum; i++) {	
			if (i % Fizz == 0 && i % Buzz == 0) {
				System.out.println(i + ". " + "FizzBuzz");}
			else if (i % Fizz == 0) {
				System.out.println(i + ". " + "Fizz");}
			else if (i % Buzz == 0) {
				System.out.println(i + ". " + "Buzz");}
			else {System.out.println(i + ". " + i);}
		}System.out.print("\n");		
		}while (true);
	}

//need to check non-decimal value from user
	public static int getValidInt(String prompt) { 
		int x = 0;
		boolean valid;
		do {
			valid = true; 
			System.out.print(prompt);
			try {
				x = Integer.parseInt(cin.readLine());
			}
			catch (NumberFormatException e) {
				System.out.println("ERROR: Number format exception!\n");
				valid = false; 
			}
			catch (IOException e) { 
				System.out.println("ERROR: IO exception!\n"); 
				valid = false;
			}
			if (valid && x == 0) {
				System.out.println("\n" + "The end.");
				System.exit(1);
			}
		} while (!valid);
		return x;  
	} // end of getValidInt()
} // end of class
