import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {


    public static void main (String[] parameters) throws Exception {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", "emulator-5554");
            caps.setCapability("platformName", "Android");
            caps.setCapability("app", "C:\\APKTest\\MyVodafonTest.apk");
           // caps.setCapability("appActivity", ".ui.activity.IntroSlideShowActivity");

            Thread.sleep(100);

            AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
            Thread.sleep(100);
            driver.findElementByAndroidUIAutomator("new UiSelector().text(\"OK\")").click();
        }catch (Exception e){
            e.printStackTrace();
        }


        //driver.quit();














    }


}
