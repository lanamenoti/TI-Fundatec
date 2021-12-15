package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {

    private WebDriver driver;

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getInputName() {
        return this.driver.findElement(
                By.id("user_name")
        );
    }

    public WebElement getInputLastName() {
        return this.driver.findElement(
                By.id("user_lastname")
        );
    }

    public WebElement getInputEmail() {
        return this.driver.findElement(
                By.id("user_email")
        );
    }

    public WebElement getInputAddress() {
        return this.driver.findElement(
                By.id("user_address")
        );
    }

    public WebElement getInputUniversity() {
        return this.driver.findElement(
                By.id("user_university")
        );
    }

    public WebElement getInputProfile() {
        return this.driver.findElement(
                By.id("user_profile")
        );
    }

    public WebElement getInputGender() {
        return this.driver.findElement(
                By.id("user_gender")
        );
    }

    public WebElement getInputAge() {
        return this.driver.findElement(
                By.id("user_age")
        );
    }

    public WebElement getCreateButton() {
        return this.driver.findElement(
                By.xpath("//div[@class='col s9']/div[@class='row']/div[@class='col s8 center']/form[@id='new_user']/div[@class='row']/div[@class='col s12 center']/div/input")
        );
    }
}
