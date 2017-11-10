package fr.unilim.iut.katatennis;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class testnis {

	TennisGame tenisgame;
	String player1 ="titi";
	String player2 ="tutu";
	
	@Before
	public void initialize() {

	 tenisgame = new TennisGame1(player1, player2);
	}

	@Test
	public void test_Love_all() {
		assertEquals(tenisgame.getScore(), "Love-All");

	}
	
	@Test
	public void test_fifteen_all(){
		tenisgame.wonPoint(player1);
	
		assertEquals(tenisgame.getScore(), "Fifteen-All");
	}
	
	/*@Test
	public void test_thirty_all(){

		tenisgame.wonPoint(player1);
		tenisgame.wonPoint(player2);
		tenisgame.wonPoint(player1);
		tenisgame.wonPoint(player2);
		assertEquals(tenisgame.getScore(), "Thirty-All");
	}
	
	@Test
	public void test_deuce(){

		tenisgame.wonPoint(player1);
		tenisgame.wonPoint(player2);
	
		assertEquals(tenisgame.getScore(), "Deuce");
	}*/
}
