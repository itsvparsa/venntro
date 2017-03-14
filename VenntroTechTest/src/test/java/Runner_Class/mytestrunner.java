package Runner_Class;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Feature_Files"},
                 format = {"json:target/cucumeber.json","html:src/target/cucumber-pretty"},
                 glue = {"Step_definations"},
                 tags = {"@login,@Dynamic,@loading_bar,@Webtable"})
public class mytestrunner {

}
