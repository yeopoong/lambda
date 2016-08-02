package kyun.lambda;

public class FuncMain {
	
	public static void main(String[] args) {
		Func add = (int a, int b) -> a + b;
		Func sub = (int a, int b) -> { return a - b; };

		int result = add.calc(1, 2);
		System.out.println(result);

		result = sub.calc(1, 2);
		System.out.println(result);
	}

}
