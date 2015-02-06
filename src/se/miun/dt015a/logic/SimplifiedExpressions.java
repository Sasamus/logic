package se.miun.dt015a.logic;

import java.util.Random; // You should remove this.

/**
 * This class implements LogicExpressions using simplified expressions. The
 * methods should return exactly the same values as those in
 * NaivLogicExpressions. So the expressions should be equivalent but simplified.
 *
 * Each method currently returns a random value. This code is obviously only a
 * placeholder so that it compiles and runs, and the methods should look similar
 * to NaivLogicExpressions when you are done.
 *
 * @author Christoffer Fink
 */
public class SimplifiedExpressions implements LogicExpressions {
	// Do not add any instance variables or constructors.

	// ========== You should remove this. ==========
	private final Random rng = new Random();

	private boolean thisShouldBeRemoved() {
		return rng.nextBoolean();
	}

	// ========== You should remove this. ==========

	@Override
	public boolean expression1(boolean a) {
		return true;
	}

	@Override
	public boolean expression2(boolean a, boolean b) {
		return a | b;
	}

	@Override
	public boolean expression3(boolean a, boolean b) {
		return (!a & true) & (b & true);
	}

	@Override
	public boolean expression4(boolean a, boolean b) {
		return a ^ b;
	}

	@Override
	public boolean expression5(boolean a, boolean b, boolean c) {
		return a & c;
	}

	@Override
	public boolean expression6(boolean a, boolean b, boolean c) {
		return (c | a) & (b | c) & (a | b);
	}

	@Override
	public boolean expression7(boolean a, boolean b, boolean c) {
		return (c | a) & (!b | c);
	}

	@Override
	public boolean expression8(boolean a, boolean b, boolean c, boolean d) {
		return (d | a) & (d | ((b | false) | (!c | false)));
	}

	@Override
	public boolean expression9(boolean a, boolean b, boolean c, boolean d) {
		return true;
	}

	@Override
	public boolean expression10(boolean a, boolean b, boolean c, boolean d) {
		return c & ((a & (b | d)) | (b & d));
	}
}
