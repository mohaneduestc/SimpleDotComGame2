
public class SimpleDotCom {
	
	int[] locationCell;
	int numOfHits = 0;
	
	public void setLocationCell(int[] loc){
		locationCell = loc;
		
	}
	
	public String checkYourself (String stringGuessUser){
		 int guess = Integer.parseInt(stringGuessUser);
		 String result = "miss";
		 for (int cell: locationCell){
			 if(guess == cell){
				 result = "Hit";
				 numOfHits++;
				 break;
			 }
		 }
		 
		 if(numOfHits == locationCell.length){
			 result="Kill";
		 }
		 System.out.println(result);
		 return result;
	}

}
