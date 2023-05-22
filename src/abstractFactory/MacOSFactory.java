package abstractFactory;

import java.awt.Checkbox;

public class MacOSFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public CheckBox createCheckbox() {
		return new MacOSCheckBox();
	}
	
}
