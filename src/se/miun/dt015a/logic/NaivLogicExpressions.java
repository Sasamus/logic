package se.miun.dt015a.logic;

public class NaivLogicExpressions implements LogicExpressions {

	@Override
	public boolean expression1(boolean a) {
		return a | (a | !a);
	}

	@Override
	public boolean expression2(boolean a, boolean b) {
		return (a | b) & (b | a);
	}

	@Override
	public boolean expression3(boolean a, boolean b) {
		return !a & (b | a);
	}

	@Override
	public boolean expression4(boolean a, boolean b) {
		return !(a & b) & (a | b);
	}

	@Override
	public boolean expression5(boolean a, boolean b, boolean c) {
		return ((a & b) | (a & !b)) & c;
	}

	@Override
	public boolean expression6(boolean a, boolean b, boolean c) {
		return (c | a) & (b | c) & (a | b) | false;
	}

	@Override
	public boolean expression7(boolean a, boolean b, boolean c) {
		return (c | a) & (!b | c) & ((a | b) | true);
	}

	@Override
	public boolean expression8(boolean a, boolean b, boolean c, boolean d) {
		return a & ((b | !c) | (c | d) & b) | d;
	}

	@Override
	public boolean expression9(boolean a, boolean b, boolean c, boolean d) {
		return c | (a & d & ((b | !c) | (c | d) & b) | d) | !c;
	}

	@Override
	public boolean expression10(boolean a, boolean b, boolean c, boolean d) {
		return (a & b & c) | (b & c & d) | (c & d & a);
	}
}
