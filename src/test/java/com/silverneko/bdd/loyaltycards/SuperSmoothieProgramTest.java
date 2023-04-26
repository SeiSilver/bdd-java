package com.silverneko.bdd.loyaltycards;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "classpath:features/loyalty_cards"
)
public class SuperSmoothieProgramTest {
}
