package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.TestBase;

public class Hooks {

	@Before
	public void setup()
	{
		TestBase.setup("firefox");
	}
	
	@After
	public void teardown() {
		TestBase.teardown();
	}
}
