/**
*Authours: 
*/

import java.util.*;

public class Board{
	
	//Inialize game board list
	private Player [] gameBoard = new Player [28];

	//Inialize and set arraylists 
	private ArrayList <Integer> rent = new ArrayList<Integer> (Arrays.asList(0, 5, 5, 200, 100, 10, 15, 0, 20, 20, 25, 100, 30, 35, 100, 40, 40, 45, 100, 100, 120, 300, 150, 170, 100, 200, 200, 220));
	private ArrayList <Integer> value = new ArrayList <Integer> (Arrays.asList(0, 60, 70, 200, 200, 100, 150, 0, 170, 170, 190, 200, 210, 220, 0, 240, 240, 260, 200, 280, 300, 300, 320, 340, 200, 0, 350, 400));
	private ArrayList <String> propertyNames = new ArrayList <String> (Arrays.asList("Go" , " Meditranian Ave.", "Baltic Ave.", "INCOME TAX", "Railroad 1", "Oriental Ave.", "Vermont Ave", 
	"Just visiting jail", "St. Charels", "States Ave", "Virginia ave", "Railroad 2", "St. James", "NYC ave", "Free Parking", "Kentucky ave", "Indiana ave", "Illinos ave", "Railroad 3", "Atlantic ave", 
	"Ventnor ave", "Jail", "Pacific ave", "Carolina ave", "Railroad 4", "Luxary Tax", "Park place", "BoardWalk"));
	
	//instance varibales
	private Scanner input = new Scanner(System.in);
	private String userInput = null;
	private boolean userBuyChooice;

	
	/**
	 * It creates the gameboard as a list and sets every element in the list to null.
	 */ 
	public void newGameBoard(){
		for (int x = 0; x < gameBoard.length; x++){
			gameBoard[x] = null;
		}
	}
	
	/**
	 * getRent gets the value of rent of the property landed on.
	 * @param: property: Takes in the current property that the player has landed on.
	 * @return: returns the value of the rent.
	*/
	public int getRent(int property){
		int x = rent.get(property);
		return x;
	}
	
	/**
	 * getPropertyName gets the name of the property that has been landed on
	 * @param: position: Takes in the current position the player is on on the board.
	 * @return: returns the name of the property.
	 */
	public String getPropertyName (int position){
		String name = propertyNames.get(position);
		return name;
	}
	
	/**
	 * getValue gets the value of the property that has been landed on.
	 * @param: position: Takes in the current position the player is on on the board.
	 * @return: returns the value of the property as amount.
	 */
	public int getValue (int position){
		int amount = value.get(position);
		return amount;
	}
	
	/**
	 * newTile checks the property that has been landed on and shows if the property is eligible to be bought or not.
	 * It also gives players an option to buy and lets them know when a property is already owned by another player.
	 * @param: position : Takes in the current position of the player on the board
	 * @param: subject: Of type player. Passes on all the attributes from the player class. 
	 */ 
	public void newTile(int position, Player subject){ 
		
		if (position == 0 || position == 7 ||  position == 14|| position == 21 || position == 3 || position == 25){
			System.out.println("Can't own this tilie");
			if (position == 3 || position == 25 || position == 21 || position == 14){
				speicalTile(position, subject);
			}
		}
		
		else if (gameBoard[position] == null){
			buy(position, subject);
		}
		else{
			subject.takeMoney(rent.get(position));
			gameBoard[position].addMoney(rent.get(position));
			System.out.println("This tilie is owned by another player, You paid rent of: $" +  rent.get(position));
		}
		
		 
	}
	
	/**
	 * specialTile checks if a player lands on free parking and adds the value of rent ($100) to the players account.
	 * It also checks if the player landed on any of INCOME TAX, JAIL or LUXURY TAX and deducts their respective rent value.
	 * @param: position : Takes in the current position of the player on the board
	 * @param: subject: Of type player. Passes on all the attributes from the player class.
	 */ 
	public void speicalTile(int position, Player subject){
		if (position == 14){
			subject.addMoney(rent.get(position));
			System.out.println("You got 100 dollars for landing on 'FreeParking'");
		}
		else{
			subject.takeMoney(rent.get(position));
			System.out.println("You lost $" + rent.get(position));
		}
	}


	/**
	 * Gives the player a choice to either buy a property or forego it when they land on it.
	 * @param: position : Takes in the current position of the player on the board
	 * @param: subject: Of type player. Passes on all the attributes from the player class.
	 */	
	public void buy(int position, Player subject){
		
		userBuyChooice = false;
		
		while (!userBuyChooice){
			System.out.println(propertyNames.get(position) + " costs $" + value.get(position) + " to own.");
			System.out.print("Press 'b' to buy, press 'p' to pass on offer: ");
			userInput = input.nextLine();
			userInput= userInput.toUpperCase();
			
			if(userInput.equals("B")){
				gameBoard[position] = subject;
				subject.takeMoney(value.get(position));
				System.out.println("You now own " + propertyNames.get(position) + " hich you paid: " + value.get(position));
				userBuyChooice = true;
			}
			
			else if (userInput.equals("P")){
				System.out.println("You did not buy the property");
				userBuyChooice = true;
			}
			
			else{
				System.out.println("Please make a valid choice");
			}
		}
		
	}
	

}
