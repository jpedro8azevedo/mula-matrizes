import java.util.Scanner;

public class Nomes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
            		int i = 0;
			String nome = sc.nextLine().strip();
            		System.out.println(i++ + ". " + nome);
        	}
	}
}
