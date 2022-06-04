package SeleniumFundamentals;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginFunctionalityOfGoFundMe {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.gofundme.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/nav/div[3]/a[2]")).click();
        driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"react-render\"]/div/div[2]/div[1]/div/div/div[2]/form/button")).click();

        String title = driver.getTitle();
        System.out.println("The Title is: " + title);

        driver.close();
        driver.quit();





    }
}
