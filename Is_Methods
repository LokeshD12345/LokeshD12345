import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Methods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.linkedin.com/login");
       boolean b1=driver.findElement(By.xpath("//*[@class='btn__primary--large from__button--floating']")).isDisplayed();
        System.out.println(b1);
        boolean b2=driver.findElement(By.xpath("//*[@class='btn__primary--large from__button--floating']")).isEnabled();
        System.out.println(b2);



    }
}
