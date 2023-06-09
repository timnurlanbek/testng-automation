package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class Flow {
    private Flow() {

    }

    static WebDriver driver;

    public static void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.err.println("Interrupted");
        }
    }


    public static void scroll (int y) {
        Actions action = new Actions(Driver.getDriver());
        action.scrollByAmount(0,y).perform();

    }



    public static void switchToSecondWindow() {
        String currentId = Driver.getDriver().getWindowHandle();
        Set<String> handles = Driver.getDriver().getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(currentId)) {
                Driver.getDriver().switchTo().window(handle);
                break;
            }
        }
    }
}
