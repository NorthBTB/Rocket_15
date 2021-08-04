package entity;

public class MyMath<N extends Number> {

	// tinh tong
	@SuppressWarnings("unchecked")
	public N sum(N... ns) {
		Double n = 0d;
		for (N num : ns) {
			n += num.doubleValue();
		}
		return (N) n;
	}

	// tinh hieu
	@SuppressWarnings("unchecked")
	public N sub(N a, N b) {
		Double s = a.doubleValue() - b.doubleValue();
		return (N) s;
	}

	// tinh so mu

	@SuppressWarnings("unchecked")
	public N mu(N a, int b) {
		Double s = 1d;
		for (int i = 0; i < b; i++) {
			s = s * a.doubleValue();
		}
		return (N) s;
	}
}
