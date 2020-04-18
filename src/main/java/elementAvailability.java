import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class elementAvailability {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\nazhivka.by\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://plavnik.by/");
        WebElement el2=driver.findElement(By.xpath("//li[@class='glavli']/a[@href='https://plavnik.by/katushki/bezinercionnie/']"));
        System.out.println(el2.isDisplayed());
        if(el2.isDisplayed()){
            el2.click();
        }
        else{
            driver.findElement(By.xpath("//div[@class='title with-child']/a[@href=\"https://plavnik.by/katushki/\"]")).click();
        }



    }
}
