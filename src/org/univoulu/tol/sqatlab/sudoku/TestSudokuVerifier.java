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
		
		assertEquals(-1,sudo.Verifier(sudo.StrIntoArray("123456789456789123789123456234567891567891234891234567345678912678912345912345678")));
		
	}	
	
	@Test
	public void testGird() {
		SudokuVerifier sudo = new SudokuVerifier();
		assertEquals(-2,sudo.Verifier(sudo.StrIntoArray("123456789456789123789123456234567891567891234891234567345678912678912345912345678")));
		
		
	}	
	
	@Test
	public void testColum() {
		SudokuVerifier sudo = new SudokuVerifier();
			
		assertEquals(-3,sudo.Verifier(sudo.StrIntoArray("417369825432158947958724316825437169791586432346912758289643571573291684164875293")));

				
	}	
	
	@Test
	public void testRow() {
		SudokuVerifier sudo = new SudokuVerifier();
	
		assertEquals(0,sudo.Verifier(sudo.StrIntoArray("417369825632158947958724316825437169791586432346912758289643571573291684164875293")));		
	}
}