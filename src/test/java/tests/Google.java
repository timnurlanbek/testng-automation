package tests;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.Driver;
import utilities.Flow;

public class Google {
    @Test
    public void google(){
        Faker faker = new Faker();
        Driver.getDriver().get("https://google.com");
        Flow.pause(3000);
        String data = faker.lorem().sentence();
        Driver.getDriver().findElement(By.name("q")).sendKeys(data + Keys.ENTER);
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue("Title does not contain", title.contains(data));
        Driver.quit();
    }

    @Test
    public void googleImage(){
        Driver.getDriver().get("https://google.com");
        System.out.println("Checking some images");
        Driver.quit();

    }
}
