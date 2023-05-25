package org.adactin.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\AdactinFeatureFile\\AadactinLoginOutline.feature",glue="org.adactin.steps2")
public class TestRunner {
	

}
