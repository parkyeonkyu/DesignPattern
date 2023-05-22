package abstractFactory;

import java.awt.Checkbox;

public interface GUIFactory {
	Button createButton();
	CheckBox createCheckbox();
}
