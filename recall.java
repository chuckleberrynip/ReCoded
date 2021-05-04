import java.util.Scanner;
import java.lang.Math;
public class recall { 
	public static void main(String[] args) { 
		String stuff;
		int yr;
		Scanner feta = new Scanner(System.in);

		stuff=feta.next();
		yr=feta.nextInt();

		boolean name1;
		boolean name2;
		boolean yr1;
		boolean yr2;
		boolean yr3;

		name1 = stuff.equals("chevrolet");
		name2 = stuff.equals("oldsmobile");
		yr1 = yr >= 1987;
		yr2 = yr <= 1998;
		yr3 = yr > 2004;
		System.out.println(name1 || name2 ? (yr1 && yr2 || yr3 && yr%2!=0 ? "RECALL" : "NO RECALL") : "NO RECALL" );
	}
}
