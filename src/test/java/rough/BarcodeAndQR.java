package rough;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.codec.binary.Base64;
import org.checkerframework.checker.units.qual.Luminance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.Duration;
import java.util.Arrays;

public class BarcodeAndQR {
    public static void main(String[] args) throws AWTException, IOException, NotFoundException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        String barcodeUrl = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/img[1]")).getAttribute("src");
        System.out.println(barcodeUrl);
        URL url = new URL(barcodeUrl);
        BufferedImage bufferedImage = ImageIO.read(url);
        LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedImage);
        BinaryBitmap binaryBitmap = new BinaryBitmap((new HybridBinarizer(luminanceSource)));
        Result result = new MultiFormatReader().decode(binaryBitmap);
        System.out.println(result.getText());
        driver.quit();
    }
}
