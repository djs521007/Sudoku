package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void testValid() {
		SudokuVerifier sudo = new SudokuVerifier();
		assertEquals(0,sudo.Verifier(sudo.StrIntoArray("417369825632158947958724316825437169791586432346912758289643571573291684164875293")));
			
	}
	@Test
	public void testUnique() {
		SudokuVerifier sudo = new SudokuVerifier();
		assertEquals(false,sudo.NumVerifier("41a369825632158947958724316825437169791586432346912758289643571573291684164875293"));
	}	
//	@Test
//	public void testGird() {
//		SudokuVerifier sudo = new SudokuVerifier();
//		assertEquals(-2,sudo.Verifier(sudo.StrIntoArray("I can't find a sutiable sudoku to test this one")));
//	}	
	@Test
	public void testRow() {
		SudokuVerifier sudo = new SudokuVerifier();
	
		assertEquals(-3,sudo.Verifier(sudo.StrIntoArray("447369825632158947958724316825437169791586432346912758289643571573291684164875293")));		
	}
	@Test
	public void testColum() {
		SudokuVerifier sudo = new SudokuVerifier();	
		assertEquals(-4,sudo.Verifier(sudo.StrIntoArray("417369825417369825958724316825437169791586432346912758289643571573291684164875293")));

				
	}	
}