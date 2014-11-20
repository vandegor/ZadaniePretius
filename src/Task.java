import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Task {
	String s;
	String line;
	String lineTab[] = null;//new [5];
	String number = null;
	Double doubleNumber= (double) 0 ;
	Double sumAmount = (double) 0;
	
	public Task(String s)
	{
		this.s = s;
		File plik = new File(s);
	}
	
	public Double readFile()
	{
		Scanner scanner = null;
		try 
		{
			scanner = new Scanner(new FileInputStream(s));
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	    try 
	    {
		      while (scanner.hasNextLine())
		      {
		    	  	 line = scanner.nextLine();
			         lineTab = line.split("@");
			         try 
			         {  
			        	  number = lineTab[5].substring(7, lineTab[5].length()-3);
			        	  number = number.replace(",",".");
			        	  doubleNumber = Double.parseDouble(number);
			        	  sumAmount+=doubleNumber; 
			         } catch(ArrayIndexOutOfBoundsException e) 
			         {
			        	 System.out.println("blad odczytu wiersza");
			         }
		      }
	    }
	    finally{
	      scanner.close();
		}
	    return sumAmount;
	}
}
