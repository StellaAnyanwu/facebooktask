import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.management.StringValueExp;

public class Facebook_web_signup {
    //import selenuim driver
    private WebDriver driver;

    @BeforeTest
    public void start() {
        //locate where chrome driver is
        System.setProperty("webdriver.chromedriver", "Resources/chromedriver.exe");
        //open chrome browser
        driver = new ChromeDriver();
        //input url
        driver.get("https://en-gb.facebook.com/r.php");
        driver.manage().window().maximize();
        //allow cookies
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[4]/button[2]")).click();
        if(driver.getCurrentUrl().contains("https://en-gb.facebook.com/r.php"))
            System.out.println("current url");
        else
            System.out.println("wrong url");

    }

    @Test(priority = 0)
    public void lessthan3characterssignup() {
        //input firstname
        driver.findElement(By.name("firstname")).sendKeys("s");
        //input last name
        driver.findElement(By.name("lastname")).sendKeys("amara");
        //input emailaddress
        driver.findElement(By.name("reg_email__")).sendKeys("ronke34@yahoo.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ronke34@yahoo.com");
        //input password
        driver.findElement(By.id("password_step_input")).sendKeys("Emmanuel-94@@");
        //select date of birth
        driver.findElement(By.name("birthday_day")).sendKeys("21");
        //select month of birth
        driver.findElement(By.name("birthday_month")).sendKeys("february");
        //select year of birth
        driver.findElement(By.name("birthday_year")).sendKeys("1996");
        //select gender
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).click();
        //create account
        driver.findElement(By.name("websubmit")).click();
        if (driver.getPageSource().contains("reg_error_inner"))
            System.out.println("pagesource");
        else
            System.out.println("correctsource");

    }

    @Test(priority = 1)
    public void invalidemailaddress() {
        //input firstname
        driver.findElement(By.name("firstname")).sendKeys("stella");
        //input last name
        driver.findElement(By.name("lastname")).sendKeys("amara");
        //input emailaddress
        driver.findElement(By.name("reg_email__")).sendKeys("stellaesther94.com");
        //input password
        driver.findElement(By.id("password_step_input")).sendKeys("Emmanuel-94@@");
        //select date of birth
        driver.findElement(By.name("birthday_day")).sendKeys("21");
        //select month of birth
        driver.findElement(By.name("birthday_month")).sendKeys("february");
        //select year of birth
        driver.findElement(By.name("birthday_year")).sendKeys("1996");
        //select gender
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).click();
        //create account
        driver.findElement(By.name("websubmit")).click();
        String expectedxpath =("//*[@id=\"u_0_f_4F\"]/i[1]");
        String actualurl =(driver.getPageSource());
        if (driver.getPageSource().contains("//*[@id=\"u_0_f_4F\"]/i[1]"))
            System.out.println("pagesource");
        else
            System.out.println("correctsource");



    }

    @Test(priority = 2)
    public void passwordlessthan1character() {
        //input firstname
        driver.findElement(By.name("firstname")).sendKeys("stella");
        //input last name
        driver.findElement(By.name("lastname")).sendKeys("amara");
        //input emailaddress
        driver.findElement(By.name("reg_email__")).sendKeys("stellaesther94@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("stellaesther94@gmail.com");
        //input password
        driver.findElement(By.id("password_step_input")).sendKeys("94@@");
        //select date of birth
        driver.findElement(By.name("birthday_day")).sendKeys("21");
        //select month of birth
        driver.findElement(By.name("birthday_month")).sendKeys("february");
        //select year of birth
        driver.findElement(By.name("birthday_year")).sendKeys("1996");
        //select gender
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).click();
        //create account
        driver.findElement(By.name("websubmit")).click();
        String expextedID = ("reg_error_inner");
        String actualID = (driver.getPageSource());
        if (driver.getPageSource().contains("reg_error_inner"))
            System.out.println("pagesource");
        else
            System.out.println("wrongsource");


    }

    @Test(priority = 3)
    public void leavingspaceblank() {
        //input firstname
        driver.findElement(By.name("firstname")).sendKeys("");
        //input last name
        driver.findElement(By.name("lastname")).sendKeys("");
        //input emailaddress
        driver.findElement(By.name("reg_email__")).sendKeys("");
        //input password
        driver.findElement(By.id("password_step_input")).sendKeys("");
        //select date of birth
        driver.findElement(By.name("birthday_day")).sendKeys("");
        //select month of birth
        driver.findElement(By.name("birthday_month")).sendKeys("");
        //select year of birth
        driver.findElement(By.name("birthday_year")).sendKeys("");
        //select gender
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).click();
        //create account
        driver.findElement(By.name("websubmit")).click();
        String expectedUrl = ("https://en-gb.facebook.com/r.php");
        String actualID = (driver.getPageSource());
        if (driver.getCurrentUrl().contains("https://en-gb.facebook.com/r.php"))
            System.out.println("pageurl");
        else
            System.out.println("wrong url");


    }

    @Test(priority = 4)
    public void successfulsignup() {
        //input firstname
        driver.findElement(By.name("firstname")).sendKeys("stella");
        //input last name
        driver.findElement(By.name("lastname")).sendKeys("amara");
        //input emailaddress
        driver.findElement(By.name("reg_email__")).sendKeys("stellaesther94@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("stellaesther94@gmail.com");
        //input password
        driver.findElement(By.id("password_step_input")).sendKeys("Emmanuel-94@@");
        //select date of birth
        driver.findElement(By.name("birthday_day")).sendKeys("21");
        //select month of birth
        driver.findElement(By.name("birthday_month")).sendKeys("february");
        //select year of birth
        driver.findElement(By.name("birthday_year")).sendKeys("1996");
        //select gender
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).click();
        //create account
        driver.findElement(By.name("websubmit")).click();
        String expectedUrl = ("https://www.facebook.com/checkpoint/1501092823525282/?next=https%3A%2F%2Fwww.facebook.com%2F");
        String actualID = (driver.getPageSource());
        if (driver.getCurrentUrl().contains("https://www.facebook.com/checkpoint/1501092823525282/?next=https%3A%2F%2Fwww.facebook.com%2F"))
            System.out.println("pageurl");
        else
            System.out.println("wrong url");


    }
@Test(priority = 5)
    public void login() {
        //alreadyhave an account
    driver.findElement(By.xpath("//*[@id=\"reg_form_box\"]/div[12]/a")).click();
    driver.findElement(By.id("email")).sendKeys("07404748484");
    driver.findElement(By.id("pass")).sendKeys("Emmanuel-94");
    driver.findElement(By.id("loginbutton")).click();
    String expectedUrl = ("https://www.facebook.com/");
    String actualID = (driver.getPageSource());
    if (driver.getCurrentUrl().contains("https://www.facebook.com/"))
        System.out.println("pageurl");
    else
        System.out.println("wrong url");

}
@AfterTest
    public void quitbrowser() {

}
}
