//2441625 Liu Lei
package org.univoulu.tol.sqatlab.sudoku;
import java.util.Scanner;
public class SudokuVerifier{
		public void main(String[] args){
			Scanner sc= new Scanner(System.in);
			String sd="";
			boolean isRight=true;
			while(true)
			{
				try{
					sd=sc.nextLine();
					if(sd.length()!=81){
						System.out.println("Number of Sudoku is wrong, please re-enter new Sudoku");
						isRight=false;
					}
					else {
						for(int i=0;i<sd.length();i++){
							if(!Character.isDigit(sd.charAt(i))){
								System.out.println("Input is illegal, please re-enter new Sudoku");
								isRight=false;
								break;
							}
						}
						if (isRight){
							for(int i=0; i<sd.length();i++){
								for(int j=i+1;j<sd.length();){
									if (sd.charAt(i)!=sd.charAt(j)){
										isRight=false;
									}
									if(j<i+9){
										j++;
									}
									else{
										j=(j/9+1)*9;
									}
								}
								if(isRight){
									System.out.println("Correct,It's a sudoku!");
									break;
								}
								else{
									System.out.println("No, it's not a sudoku! Please re-enter a sudoku!");
								}
							}
						}
					
						catch(Exception e){
						}
					}
				}
			}
		}
	

	public int verify(String candidateSolution) {
		
		// returns 1 if the candidate solution is correct
		return 0;
	}
}
