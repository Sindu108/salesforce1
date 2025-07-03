import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sf1 {

    @Test
    public void launchSite(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://orgfarm-d4886ca863-dev-ed.develop.my.salesforce.com/");
    }

    @Test
    public void someMethod(){
        System.out.println("Hellooooo");
    }

}
