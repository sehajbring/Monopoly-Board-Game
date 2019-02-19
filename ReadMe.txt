		"Monopoly Game!"
       			 (Version 08.12.17.00)

AUTHORS:	Sehjaveer Bring
					Kai  (Jack) Yang
					Oghale (Miro) Enwa

CREDITS:	All images used in game are drawn by us in Adobe Photoshop and Microsoft Paint

====================
 README  CONTENTS
===================
		0. Steps to Win << SPOILERS >>
		1. System Requirements
		2. Installation
		3. Operation
		4. Files List
		5. Troubleshooting


===================================================================================================
0. STEPS TO WIN									   << SPOILERS >>
===================================================================================================

To win the game a player must achieve over $10,000 at any point in the game


===================================================================================================
1. SYSTEM REQUIREMENTS
===================================================================================================

	a. OS:
			Linux - Fedora 22
			Windows - 10

	b. Resolution:
			(Best) 1920 x 700
			1680 x 1050


===================================================================================================
2. INSTALLATION
===================================================================================================

	a. Compile and Run the graphical project
		All game modules and submodules should be saved in the src folder
		From the src folder, run command line 'javac Logic/ProjectMain.java'
		Run command 'java Logic/ProjectMain'

	b. Saved property names, values and rent for each property
		Any of the value for rent or property value can be manually adjusted.
		If adjusted manually, there must only be a total of 28 values.

	c. To run and compile the text based game
		  All game modules and submodules should be saved in the TextBased folder
 			From the TextBased folder, run command line 'javac *.java'
 			Run command 'java ProjectMain'


===================================================================================================
3. OPERATION
===================================================================================================

	a. GAME PLAY
		The user can use the number of players in the game.
		The player each set their own names.
		The first player to reach $10,000 wins the game


===================================================================================================
4. FILES LIST
===================================================================================================

	a. Package: gui
	-----------------
	      BoardGUI.java
				NameFrameGui.java
				Avatar.java
				Point.java
				PointPosition.java
				Shape.java


	b. Package: Logic
	------------------
	   ProjectMain.java
		 Board.java
		 Player.java


	c. Package: TestCases
	--------------
	   BoardTest.java
		 PlayerTest.java

	d. Package: Images
	----------------
	   EventsLogic.java
	   Location.java
	   MenuLogic.java
	   WorldLogic.java


	e. Package: Images
	-----------------
		Chance.png
		SmallerChance.png

		i. Subpackage: Dice Images
		---------------------------
				Dice1.png
				Dice2.png
				Dice3.png
				Dice4.png
				Dice5.png
				Dice6.png
				DiceBackGround.png

				i. Subpackage: SmallerDie
				---------------------------
						SmallerDie1.png
						SmallerDie2.png
						SmallerDie3.png
						SmallerDie4.png
						SmallerDie5.png
						SmallerDie6.png
						SmallerBlankDie.png


		ii. Subpackage: BoardImages
		----------------------------
				CanadianBoard.png
				RegularBoard.png
				SmallerCanadianBoard.png
				SmallerReg.png


	f. Package: TestFiles
	-------------------------
				 ReadMe.txt (The readMe file)
	       CanadianNames.txt (Property names for the Canadian version)
				 PropertyValues.txt (Buy value for each property)
				 RegularPropertyNames.txt (Property names for the regular version)
				 Rent.txt (Rent value for each property)



	f. Package: TextBased
	-------------------------
			 ProjectMain.java
			 Board.java
			 Player.java
			 Diagram.png


===================================================================================================
5. TROUBLESHOOTING
===================================================================================================

	a. Images Not Loading If images for the game are blank
				Make sure all the image paths and text files direct to Poperty names for the Canadian version) respective paths
				i.e "Images/Chance.png"

	a. Index of Array:
			If the files were adjusted manually, then the values might be less then 28
			Readjust till values are 28
