package singleton;

public class DemoSingleThread {
	public static void main(String[] args) {
		System.out.println("If you see the same value, then songleton was reused (yay!)" + "\n" +
				"If you see different values, then 2 singleton were created (boooo!!)" + "\n" +
				"RESUT:" + "\n");
		Singleton singleton = Singleton.getInstance("FOO");
		Singleton anotherSingleton = Singleton.getInstance("BAR");
		System.out.println(singleton.value);
		System.out.println(anotherSingleton.value);
	}
}
