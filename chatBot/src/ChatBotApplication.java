import java.util.Scanner;

public class ChatBotApplication {
	
	public static void main(String[] args) {
		ChatBotApplication application = new ChatBotApplication();
		application.greetUser();
 		application.askUserName();
 		application.guessUserAge();
 		application.countToNumber();
		application.testProgrammingKnowledge();
	}
	
	//1. Greeting the user
	private void greetUser() {
		System.out.println("Hello! Greetings of the day!");
	}
	
	//2. Asking the user to repeat their name
	private void askUserName() {
		Scanner scanObj = new Scanner (System.in);
		System.out.println("What is your name?");
		String name = scanObj.nextLine();  // Read user input
		System.out.println("Can you please repeat one more time?");
		name = scanObj.nextLine();  
		System.out.println("Hello! "+name);
	}
	
	//3. Guessing the user's age 
	private void guessUserAge() {
		Scanner scanObj = new Scanner (System.in);
		System.out.println("In which year are you born?");
		int year = scanObj.nextInt();  // Read user input
		int age = 2022 - year;
		System.out.println("So, you are "+age + "years old ");
	}
	
	//4. Counting to any number that the user wants.
	private void countToNumber() {
		  Scanner in = new Scanner(System.in); 
		  System.out.print("Enter any number to count:");
		  int num = in.nextInt();
		  for (int i=1; i<= num; i++){
		   System.out.println(i);
		   }
	}
	
	//5.Testing the user's "programming knowledge"
	private void testProgrammingKnowledge() {
		  Scanner in = new Scanner(System.in); 
		  int option = 0;
		  System.out.println("In which year was first version of Java released?");
		  System.out.println("Choose number from below options ");
		  System.out.println("1) 1990 ");
		  System.out.println("2) 2000 ");
		  System.out.println("3) 1992 ");
		  System.out.println("4) 1995 ");
		  while (option != 4) {
			  option = in.nextInt();
			  if(option != 4) {
				  System.out.print("Wrong option. Please try again");
			  }
		  }
		  System.out.println("You got it correct. Congradulations...!!!");
	}
}
