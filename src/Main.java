import java.io.File;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) 
	{
		String path = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Podaj sciezke do pliku wejsciowego");
		path = scanner.next();
		Task task = new Task(path);
		System.out.println(task.readFile());
	}

}
