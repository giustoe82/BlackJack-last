import java.util.Scanner;

public class ConsoleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		String name=scanner.next();
		System.out.println(name);
		String surname=scanner.next();
		System.out.println("my name is "+name +" " +surname);
		scanner.close();

	}

}
