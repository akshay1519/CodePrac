package rough;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesManage {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nopcommerce.com/en");

        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies.size());

        for (Cookie cookie:cookies){
            System.out.println(cookie.getName() + " : " +cookie.getValue());
        }

        Cookie cookieObj= new Cookie("MyCookie123","123456");
        driver.manage().addCookie(cookieObj);

        cookies = driver.manage().getCookies();
        for (Cookie cookie:cookies){
            System.out.println(cookie.getName() + " : " +cookie.getValue());
        }

        driver.manage().deleteCookie(cookieObj);
        driver.quit();
    }
}
