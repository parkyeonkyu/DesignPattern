package factory;

public class Demo {
	private static Dialog dialog;
	
	public static void main(String[] args) {
		configure();
		runBusinessLogic();
		//Thread
	}
	
	static void configure() {
		if(System.getProperty("os.name").equals("Windows 101")) {
			dialog = new WindowsDialog();
		}else {
			dialog = new HtmlDialog();
		}
	}
	
	static void runBusinessLogic() {
		dialog.renderWindow();
	}
}
