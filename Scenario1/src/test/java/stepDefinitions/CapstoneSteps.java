package stepDefinitions;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.*;

import java.time.Duration;

public class CapstoneSteps extends BaseTest {

    @After
    public void close(){
        driver.close();
        driver.quit();
    }

    @Given("I open the homepage")
    public void initializeDriver() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/");
    }

    @Then("I verify the page title is {string}")
    public void verifyTitle(String expectedTitle) {
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

    @When("I click on {string} link")
    public void clickLink(String abc) {
        driver.findElement(By.linkText(abc)).click();
    }

    @Then("I verify the text on the page as {string}")
    public void verifyText(String expectedText) {
        String actualText = driver.findElement(By.tagName("h3")).getText();
        System.out.println("---------------"+actualText + " " + expectedText);
        System.out.println();
        System.out.println();
        Assert.assertEquals(actualText, expectedText);
    }

    @And("I navigate back to Home Page")
    public void navigateBack() {
        driver.navigate().back();
    }
    
    @When("I click on {string} text")
    public void checkDropdownLink(String abc) {
    	driver.findElement(By.linkText(abc)).click();
    }

    @Then("I select {string} from dropdown")
    public void selectOption(String option) {
        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        dropdown.selectByVisibleText(option);
    }

    @Then("I verify {string} is selected")
    public void verifySelectedOption(String expectedOption) {
        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        String selectedOption = dropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOption, expectedOption);
    }

    @Then("I verify {string} link is present")
    public void verifyLinkPresence(String linkText) {
        Assert.assertTrue(driver.findElement(By.linkText(linkText)).isDisplayed());
    }

}
