package hooks;

import io.cucumber.java.Before;
import utilities.TestBase;

public class Hooks {

	@Before
	public void setup()
	{
		TestBase.setup("chrome");
	}
}
