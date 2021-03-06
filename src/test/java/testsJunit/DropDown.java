package testsJunit;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Driver;
//I am on the dropdown page
//I varify Option1 and Option2  are selected

public class DropDown extends BaseClass {
    @Test
    public void i_varify_Option1_and_Option2_are_selected() throws InterruptedException {
        Driver.getDriver().get("http://localhost:7080/dropdown");
        Thread.sleep(2000);
        Driver.getDriver().manage().window().maximize();
        WebElement elements = Driver.getDriver().findElement(By.id("dropdown"));
        Select stateList = new Select(elements);
        List<WebElement> elementCount = stateList.getOptions();
        String opitions[] = {"Option 1", "Option 2"};

        for (int i = 1; i < elementCount.size(); i++) {
            Thread.sleep(2000);
            stateList.selectByIndex(i);
            String selected = stateList.getFirstSelectedOption().getText();
            assertEquals(opitions[i - 1], selected);
            System.out.println(selected);
        }
    }
}
