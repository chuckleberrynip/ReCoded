/********************************************************************
 * Objective: If a car with a model name of chevrolet or oldsmobile
 * with a model year that is in between 1986 and 1999,exclusive, or 
 * is a year after 2004 where the year is odd should be recalled, 
 * otherwise output a no recall.
 * *****************************************************************/
import java.util.Scanner;
import java.lang.Math;
public class newrecall { 
	public static void main(String[] args) {
		//Inputting the relevant car information
		Scanner inputCar = new Scanner(System.in);
		String modelName = inputCar.next();
		int year = inputCar.nextInt();

		//Assigning the problem characteristics
		boolean isChevrolet = modelName.equals("chevrolet");
		boolean isOldsmobile = modelName.equals("oldsmobile");

		boolean after1986 = year > 1986;
		boolean before1999 = year < 1999;
		boolean after2004 = year > 2004;
		boolean isOddYear = year % 2 != 0;

		//Making compound statements;
		boolean recallYears = after1986 && before1999 || after2004 && isOddYear;
		boolean recallModelName = isChevrolet || isOldsmobile;

		//Making output statement;
		System.out.println((recallYears && recallModelName) ? "RECALL" : "NO RECALL");
	}
}
