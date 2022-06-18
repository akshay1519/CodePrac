package practice.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {
    WebDriver driver;

    public Utility(WebDriver driver) {
        this.driver = driver;
    }

    public void sendKeys(WebElement element,String value){
        element.sendKeys(value);
    }
    public void click(WebElement element){
        element.click();
    }
}
