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
		boolean B = false;
		boolean C = false;

		System.out.println(naivLogicExpressions.expression7(A, B, C));
		System.out.println(simplifiedExpressions.expression7(A, B, C));

	}

}
