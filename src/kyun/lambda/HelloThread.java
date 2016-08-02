package kyun.lambda;

public class HelloThread {
	
	public static void main(String[] args) {
		new Thread(() -> {
			System.out.println("Hello World");
		}).start();
	}
}
