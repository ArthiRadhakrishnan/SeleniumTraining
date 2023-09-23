package org.stepdefinition;

import org.base.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
	@Before(order = 1)
	// precondition
	private void precondition5() {
		launchBrowser();
		System.out.println("launch the browser");

	}

	@Before(order = 2)
	private void precondition3() {
		windowMaximize();
		System.out.println("maximize the window");

	}

	@Before(order = 3, value = "@Sanity")
	private void precondition1() {
		System.out.println("Precondition3");

	}

	@After(order = 10, value = "@Sanity")
	// post condition
	private void postcondition3() {
		System.out.println("Take screenshot of scenerios");

	}

	@After(order = 4)
	private void postcondition2() {
		closeEntireBrowser();
		System.out.println("close the browser");

	}

}
