package com.github.genevajug.foo.bar.qix.features;

import com.github.genevajug.foo.bar.qix.converter.NumberConverter;
import cucumber.annotation.Before;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.fest.assertions.Assertions;
import org.junit.Assert;

import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.assertEquals;


public class Steps {

    private NumberConverter numberConverter;
    private String result;

    @Before
    public void before() {
        result = null;
        numberConverter = new NumberConverter();
    }

    @When("^I have a division by (\\d+)$")
    public void iHaveADivisionBy(int divisionBy) {
        result = numberConverter.convert(divisionBy);
    }

    @Then("^the result should contain (.+)$")
    public void theResultShouldContain(String resultShouldContain) {
        assertThat(result).contains(resultShouldContain);
    }

    @When("^the number contains (\\d+)$")
    public void theNumberContains(int number) {
        result = numberConverter.convert(number);
    }

    @When("^the number is (\\d+)$")
    public void theNumberIs(int number) {
        result = numberConverter.convert(number);
    }

    @Then("^the result should be (.+)$")
    public void theResultShouldBe(String expected) {
        assertThat(result).isEqualTo(expected);
    }
}
