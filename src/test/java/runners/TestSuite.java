package runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AutenticateRunner.class,
        ProductRunner.class,
        CheckRunner.class
})
public class TestSuite {


}


