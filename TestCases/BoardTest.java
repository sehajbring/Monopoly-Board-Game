package TestCases;

/**
 * Tests the board class
 * @authors  Kai  (Jack) Yang, Oghale (Miro) Enwa
 */

import static org.junit.Assert.*;

import org.junit.Test;

import Logic.Board;
import Logic.Player;

public class BoardTest {

	@Test
	public void test_buy(){
		Player p1 = new Player();
		p1.setName("Abc");
		Board b1 = new Board();
		b1.buy(1,p1); 
		assertEquals("money should have value 2940.", 2940, p1.getMoney());
		assertEquals("Name should be Abc", "Abc", b1.getPlayer(1).getName());
	}
	@Test
	public void test_setPoint(){
		Board b1 = new Board();
		b1.setPoint(100,100); 
		assertEquals("Point x should be 850", 920, b1.getPoint(0).getXCoord());
		assertEquals("Point y should be 900", 620, b1.getPoint(0).getYCoord());
	}

}
