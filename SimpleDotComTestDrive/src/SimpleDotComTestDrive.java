import java.util.Scanner;


public class SimpleDotComTestDrive {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DECLARE an int variable to hold the number of user guesses
		int numOfGuesses =0;
		String result ="failed";
		boolean isAlive = true;
		
//		COMPUTE a random number between 0 and 4
		int renNum = (int)(Math.random()*10);
		
//		create new object called dot
		SimpleDotCom dot = new SimpleDotCom();
		
//		set the location of DotCom
		int [] locations ={renNum,renNum+1,renNum+2};
		
//		invoke the setter method on the dot com
		dot.setLocationCell(locations);
		
		while(isAlive){
			 // Create a Scanner object
			 Scanner myObj = new Scanner(System.in); 
			 System.out.println("Guess Your Number");

			 String userGuess = myObj.nextLine(); 

			 numOfGuesses++;
//		invoke checkYourself on the dot
			result = dot.checkYourself(userGuess);
			if(result.equals("Kill"))
				isAlive=false;
		
		}
		System.out.println("You took "+numOfGuesses+ " guesses");
	}

}
