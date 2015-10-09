//2441625 Liu Lei
package org.univoulu.tol.sqatlab.sudoku;
import java.util.Scanner;
public class SudokuVerifier{
		public static void main(String[] args){
			Scanner scanner= new Scanner(System.in);
			String line=scanner.nextLine();
			if(LengthVerifier(line)){
				if(NumVerifier(line)){
					int m[]=StrIntoArray(line);
					int i= -Verifier(m);
					switch (i){
					case 0: System.out.println("Yes,it's Sudoku!"); break;
					case 2: System.out.println("No,itn't Sudoku! it is violating Rule #2");break;
					case 3: System.out.println("No,itn't Sudoku! it is violating Rule #3");break;
					case 4: System.out.println("No,itn't Sudoku! it is violating Rule #4");break;
					default:
						}
				}
				else{
					System.out.println("No,itn't Sudoku! it is violating Rule #1");
				}
				
				}

			}		
		public static boolean LengthVerifier(String candidateSolution){
			if(candidateSolution.length()!=81){
				System.out.println("Lenth doesn't equal to 81 characters!");
				return false;
			}
			return true;
		}
		public static boolean NumVerifier(String s){
		 for(int i=0;i<s.length();i++){
			 int n=s.charAt(i);
			 if(n<49||n>57){
				 return false;
			 }
		 }
		 return true;
		}
		public static  int Verifier(int m[] ) {
			 //TODO Verifier whole string

			if(!RowVerifier(m)){
				return -3;
			}
			if(!ColumnVerifier(m)){
				return -4;
			}
			if(!SmallSudokuVerifier(m)){
				return -2;
			}
			return 0;
		}
		public static int[] StrIntoArray(String s) { 
			// TODO String transfer into array
			int m[]=new int [81];
			for(int i=0;i<81;i++){
				int n=s.charAt(i);
				m[i]=n-48;
			}
			return m;
		}
		public static boolean RowVerifier(int m []){
			//TODO RowVerifier
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
		public static boolean ColumnVerifier(int m[]){
			//TODO ColumnVerifier
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
		public static boolean SmallSudokuVerifier(int m [] ) {
			// TODO 
			int [][]n={
				    { m[0], m[1], m[2], m[9], m[10], m[11], m[18], m[19], m[20] },
				    { m[3], m[4], m[5], m[12], m[13], m[14], m[21], m[22], m[23] },
				    { m[6], m[7], m[8], m[15], m[16], m[17], m[24], m[25], m[26] },
				    { m[27], m[28], m[29], m[36], m[37], m[38], m[45], m[46], m[47] },
				    { m[30], m[31], m[32], m[39], m[40], m[41], m[48], m[49], m[50] },
				    { m[33], m[34], m[35], m[42], m[43], m[44], m[51], m[52], m[53] },
				    { m[54], m[55], m[56], m[63], m[64], m[65], m[72], m[73], m[74] },
				    { m[57], m[58], m[59], m[66], m[67], m[68], m[75], m[76], m[77] },
				    { m[60], m[61], m[62], m[69], m[70], m[71], m[78], m[79], m[80] } 
				    };
			for(int i=0;i<9;i++){
				if(!ArrayVerifier(n[i])){
					return false;
				}
			}
			return true;
		}
		public static boolean ArrayVerifier(int m[]) {
			// TODO digits appear only once in a sub-grid
			int sum= m[0]+m[1]+m[2]+m[3]+m[4]+m[5]+m[6]+m[7]+m[8];
			if(sum !=45){
				return false;
			}
			m=Bubble(m);
			for (int i=0;i<m.length;i++){
				if (m[i] !=i+1){
					return false;
				}
			}
			return true;
		}
		public static int[] Bubble(int m[] ) {
			int i,j,temp;
			for (i=m.length-1;0<i;i--){
				for (j=0;j<i;j++){
					if(m[j]>m[j+1]){
						temp=m[j];
						m[j]=m[j+1];
						m[j+1]=temp;
					}
				}
			}
			return m;
		}
}