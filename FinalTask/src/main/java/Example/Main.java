package Example;

import WebDriver_1.WebDriverFinal;
import org.openqa.selenium.WebDriver;

public class Main {

    public static WebDriver driver;

    public static Main_Page main_page;

    public static void main(String[] args) throws InterruptedException {
        driver = WebDriverFinal.getWebDriver();

        main_page = new Main_Page(driver);
        main_page.Click_Button();
    }
}
