package ae.logic.testing;

import se.miun.dt015a.logic.LogicExpressions;
import se.miun.dt015a.logic.NaivLogicExpressions;
import se.miun.dt015a.logic.SimplifiedExpressions;

/**
 * A class with a main method for testing
 * 
 * @author Albin Engström
 */
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LogicExpressions naivLogicExpressions = new NaivLogicExpressions();

		LogicExpressions simplifiedExpressions = new SimplifiedExpressions();

		boolean A =	false;
		boolean B = true;
		boolean C = false;
		boolean D = false;

		System.out.println(naivLogicExpressions.expression8(A, B, C, D));
		System.out.println(simplifiedExpressions.expression8(A, B, C, D));

	}

}
