package abstractFactory;

import java.awt.Checkbox;

public class WindowsFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public CheckBox createCheckbox() {
		return new WindowsCheckBox();
	}
	
}
