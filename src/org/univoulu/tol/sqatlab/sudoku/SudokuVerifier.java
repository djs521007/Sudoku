//2441625 Liu Lei
package org.univoulu.tol.sqatlab.sudoku;
import java.util.Scanner;
public class SudokuVerifier{
		public static void main(String[] args){
			Scanner scanner= new Scanner(System.in);
			String line=scanner.nextLine();
			if(LengthVerifier(line)){
				int m[]=StrIntoArray(line);
				if(Verifier(m)){
					System.out.println("Yes,it's Sudoku!");
				}
				else{
					System.out.println("No,itn't Sudoku!");
				}
				}
			}
		}
		public static Boolean LengthVerifier(String s){
			if(s.length()!=81){
				System.out.println("Lenth doesn't equal to 81 characters!");
				return false;
			}
			return true;
		}
		public static Boolean NumVerifier(String s){
		 for(int i=0;i<s.length();i++){
			 int n=s.charAt(i);
			 if(n<49||n>57){
				 System.out.println("Not all digital(1-9)!");
				 return false;
			 }
		 }
		 return true;
		}
		public static Boolean RowVerifier(int m []){
			int n[][]=new int [9][9];
			for(int i=0;i<9;i++){
				for(int j=0;j<9;j++){
					n[i][j]=m[i*9+j];
				}
				if(!ArrayVerifier(n[i])){
					return false;
				}
			}
			return true;
		}
		public static Boolean ColumnVerifier(int m []){
			int n[][]=new int [9][9];
			for(int i=0;i<9;i++){
				for(int j=0;j<9;j++){
					n[i][j]=m[i+j*9];
				}
				if(!ArrayVerifier(n[i])){
					return false;
				}
			}
			return true;
		}
		
