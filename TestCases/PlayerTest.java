package TestCases;
import static org.junit.Assert.*;

import org.junit.Test;

import Logic.Player;
/**
 * Tests the player class
 * @author Oghale (Miro) Enwa
 *
 */
public class PlayerTest{			
	
	@Test
	public void testMoveForPositionLessThan28() {
		Player p = new Player();
		p.setName("Sehaj");
		p.move(4);
		assertEquals(4,p.getPosition());
	}

	@Test
	public void testMoveForPositionGreaterOrEqual28() {
		Player p = new Player();
		p.setName("Sehaj");
		p.setPosition(29);
		p.move(3);
		assertEquals(5,p.getPosition());
	}
	
	@Test
	public void test_set_name() {
		Player p = new Player();
		p.setName("Sehaj");
		assertEquals("Sehaj", p.getName());
	}
	
	@Test
	public void test_set_addMoney() {
		Player p = new Player();
		p.setName("Sehaj");
		p.addMoney(200);
		assertEquals(3200,p.getMoney());
	}
	
	@Test
	public void test_set_takeMoney() {
		Player p = new Player();
		p.setName("Sehaj");
		p.takeMoney(200);
		assertEquals(2800,p.getMoney());
	}
}

