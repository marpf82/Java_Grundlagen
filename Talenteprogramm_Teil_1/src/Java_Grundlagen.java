public class Java_Grundlagen {
	
	   public static void main (String[] args) 
	   {
//	 int x = 5;
	 
//    System.out.println ("Hallo Welt");
//	  
//    if (x==3)
//		   
//		{
//    	System.out.println ("gefunden");
//    	System.out.println ("auch gefunden");
//		}
//	else
//		{
//		System.out.println ("nicht gefunden");
//		System.out.println ("immer noch nicht gefunden");
//		}
//	
//	 switch(x)
//	 {
//		case 0:
//	 	case 2:	 	
//		case 4: System.out.println ("gerade");
//	 	break;
//		case 1:
//		case 3:
//		case 5: System.out.println ("ungerade");
//		break;
//	 	default: System.out.println ("x größer 6"); 
//	 }
	 
//	 System.out.println(x);			//5
//	 System.out.println(++x);		//6
//	 System.out.println(x);			//6
//	 System.out.println(x++);		//6
//	 System.out.println(x);			//7
//	 System.out.println(x+=10);		//17
//	 System.out.println(x = x + 3); //20
	 
//	 while Schleife 
//	 int i = 0;
//	 while (i <= 3)
//	 {
//		 System.out.println("i ist "+ i); 
//		 i++; 
//	 }
	 
//	 do (while schreiben)
	 
//	 Foor Loop
//	 for(int i=0; i <=5; i++)
//	 {
//		 System.out.println("i ist "+i);
//	 }
	 
// siehe Funktion oben
//	 for (int i=1; i<=100; i++)
//	 	{
//		 if(Funktionen.istTeilbardurch(i,3) && Funktionen.istTeilbardurch(i,5))
//		 {
//			 System.out.println("FizzBuzz");
//		 }
//		 else if (Funktionen.istTeilbardurch(i,3))
//		 {
//			 System.out.println("Fizz");
//		 }
//		 else if (Funktionen.istTeilbardurch(i,5))
//		 {
//			 System.out.println("Buzz");
//		 }
//		 else
//		 { 
//			 System.out.println(i);
//		 }
//		}
//	try {
//		Funktionen.istTeilbardurch(0, 0);
//		}
//	catch (java.lang.ArithmeticException f) 
//		{
//			//System.out.println("Fehler beim Modulorechnen");
//			f.printStackTrace();
//		}
//	finally
//		{
//		System.out.println("Ich mache aber trotzdem weiter");
//		}
	
//	  int dividend = 12;
//	  int divisor = 2;
//
//		try {
//			double e = Berechnung.divide(dividend, divisor);
//		}
//		catch (DivisionByZeroException f) {
//				f.printStackTrace();
//		}
		
		  Hallo_Welt app = new Hallo_TCG();
		   System.out.println(app.g());
  }
}
