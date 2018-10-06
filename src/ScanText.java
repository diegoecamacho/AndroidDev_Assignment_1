import java.util.Scanner;

/**
 * <p>Scanner Class
 * Manages Player Input to Console
 * </p>
 * @author Diego Camacho 
 */
public class ScanText {
	Scanner scanner;
	
	ScanText(){
		scanner = new Scanner(System.in);
	}
	
	String GetLine() {
		return scanner.nextLine();
	}
	
	void CloseScanner() {
		scanner.close();
	}

}
