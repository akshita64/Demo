package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\training_d2.03.07\\eclipse-workspace\\Cucumber_Demo1\\My_features\\TagsDemo.feature", glue = "stepdefinations", tags= {"@uat,@smoke"})
public class MyRunner {
}
