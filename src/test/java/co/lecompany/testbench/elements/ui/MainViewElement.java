package co.lecompany.testbench.elements.ui;

import com.vaadin.flow.component.applayout.testbench.AppLayoutElement;
import co.lecompany.testbench.elements.components.AppNavigationElement;

public class MainViewElement extends AppLayoutElement {

	public AppNavigationElement getMenu() {
		return $(AppNavigationElement.class).first();
	}

}
