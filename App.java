package reader;

public class App {
	
	public static void main(String[] args) {
		FileReader fr = new FileReader();
		StringBuilder sb= fr.Read();
		
		System.out.println(sb);
		
	}
}
