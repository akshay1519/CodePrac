package rough;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class prac {
    WebDriver driver = null;

    @Parameters("browser")
    @BeforeSuite
    void browserLaunch(String br){
        System.out.println(" Browser "+br);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }


    @Test(priority = 1)
    void test1() throws Exception{

        System.out.println("Test 1");
    }


    @DataProvider(name = "loginData")
    Object [][] loginDatas(){
        Object [][] sData= {{"mercury","mercury"},{"mer","mer"},{"golu","molu"}};
        return sData;
    }

    @Test(dataProvider = "loginData")
    void test2(String uName,String pass){
        System.out.println(uName);
        System.out.println(pass);

        System.out.println(" TEst 2");
    }

    @AfterSuite
    void quitMethod(){
        System.out.println("Comleted"+" \u263A");
        driver.quit();
    }
}




























//        System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
//        driver.get("https://jqueryui.com/tooltip/");
//        Actions actions = new Actions(driver);
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//
//        driver.switchTo().frame(0);
//        WebElement age = driver.findElement(By.cssSelector("#age"));
//        String toolTipText= age.getAttribute("title");
//        System.out.println(toolTipText);
//
//
//
//
//
//
//
//
//
//
//
//
//        Thread.sleep(4000);


//        WebElement dropdown = driver.findElement(By.id("dropdown"));
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//        Select s = new Select(dropdown);
//        List<WebElement> elemList = s.getOptions();
//        ArrayList<String> list = new ArrayList<>();
//        for (WebElement element:elemList){
//            list.add(element.getText());
//        }
//        s.selectByIndex(2);
//        System.out.println(list);
//        WebElement radio=driver.findElement(By.cssSelector("#q26 > table > tbody > tr:nth-child(2) > td > label"));
//        WebElement checkBox = driver.findElement(By.cssSelector("#q15 > table > tbody > tr:nth-child(3) > td > label"));
//        WebElement checkBox1 = driver.findElement(By.cssSelector("#q15 > table > tbody > tr:nth-child(6) > td > label"));
//
//        System.out.println(radio.isSelected());
//        System.out.println("Radio Button");
//        radio.click();
//        System.out.println(radio.isEnabled());
//        System.out.println(radio.isSelected());
//        System.out.println("Checkbox");
//        checkBox.click();
//        System.out.println(checkBox.isEnabled());
//        System.out.println(checkBox.isSelected());
//        checkBox1.click();
//        System.out.println(checkBox1.isEnabled());
//        System.out.println(checkBox1.isSelected());
//        WebElement link= driver.findElement(By.linkText("Software Testing Tutorials"));
//        link.click();
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.getCurrentUrl();
//        WebElement element0 = driver.findElement(By.id("mce_0_ifr"));
//        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element0));
//        driver.switchTo().frame(element0);
//        WebElement element=driver.findElement(By.id("tinymce"));
//        wait.until(ExpectedConditions.visibilityOf(element));
//        element.clear();
//        element.sendKeys("Hellooo How are");

//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        for (WebElement l:links){
//            System.out.println(l.getText());
//        }
//        WebElement element = driver.findElement(By.id("alertbtn"));
//        element.click();
//        Thread.sleep(3000);
////        driver.switchTo().alert().accept();
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        driver.switchTo().defaultContent();
//        String year = "2022";
//        String month = "06";
//        String day = "10";
//        Calendar calendar=Calendar.getInstance();
//        int currDate = calendar.get(Calendar.DATE);
//        int currYear = calendar.get(Calendar.YEAR);
//        int currMnth = calendar.get(Calendar.MONTH)+2;
//        System.out.println(currDate);
//        System.out.println(currYear);
//        System.out.println(currMnth);
//
//        WebElement date = driver.findElement(By.cssSelector(".swa-icon_calendar"));
//        String selectDate = "calendar-66-"+currYear+"-0"+currMnth+"-"+currDate;
//        date.click();
//        WebElement currSDate = driver.findElement(By.id(selectDate));
//        currSDate.click();
//
//        WebElement mouse = driver.findElement(By.id("mousehover"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(mouse).build().perform();
//        WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Top')]"));
//        actions.click(link).build().perform();
//        String url = driver.getCurrentUrl();
//        System.out.println(url);
//        actions.contextClick(mouse).build().perform();
//        actions.sendKeys(Keys.ARROW_DOWN).click().build().perform();

//        WebElement myFrame = driver.findElement(By.cssSelector(".demo-frame"));
//        driver.switchTo().frame(myFrame);
//        WebElement box = driver.findElement(By.xpath("//body/div[@id='resizable']/div[1]"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(box).dragAndDropBy(box,375,320).build().perform();

//         actions.sendKeys(Keys.ENTER).build().perform();
//         WebElement result = driver.findElement(By.id("result"));
//         System.out.println(result.getText());
//         actions.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
//         System.out.println(result.getText());


//    WebElement flag = driver.findElement(By.cssSelector(".footblu"));
//        js.executeScript("arguments[0].scrollIntoView();",flag);
//js.executeScript("window.scrollBy(0,9000)","");

