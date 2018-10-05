import java.util.Scanner;

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
