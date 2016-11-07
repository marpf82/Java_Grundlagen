
public class Berechnung {

	 public static boolean istTeilbardurch(int i, int Divisor) {
		 return i % Divisor == 0; 
	 }
	 
	 public static double divide(int dd, int dr) throws DivisionByZeroException{
		 if (dr == 0){
			 throw new DivisionByZeroException();
		 }
		 return dd/dr;
	 }
	 
	 
	
}
