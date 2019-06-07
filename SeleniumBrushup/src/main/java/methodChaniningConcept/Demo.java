package methodChaniningConcept;

class Window {
	public Maximize window() {
		System.out.println("Window");
		return new Maximize();
	}
}

class Maximize {
	void maximize() {
		System.out.println("Maximize");
	}

}

public class Demo {

	public Window manage() {
		System.out.println("Manage");
		return new Window();
	}

	public static void main(String[] args) {
		System.out.println("-------Output without method chaining--------");
		Demo driver = new Demo();
		Window manage = driver.manage();
		Maximize window = manage.window();
		window.maximize();

		System.out.println("-------Output with method chaining--------");
		driver.manage().window().maximize(); // Method chaining

	}

}
