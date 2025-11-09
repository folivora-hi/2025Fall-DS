import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeywordList lst = new KeywordList();
		
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()){
			String operation = scanner.next();
			
			switch (operation){
				case "add":
					String name = scanner.next();
					int count = scanner.nextInt();			
					lst.add(new Keyword(name, count));
					break;
				case "sort":
					lst.sort();
					break;
				case "output":
					lst.output();
					break;
				default:
					System.out.println("InvalidOperation");
					break;
			}	
		}
		scanner.close();
	}

}
