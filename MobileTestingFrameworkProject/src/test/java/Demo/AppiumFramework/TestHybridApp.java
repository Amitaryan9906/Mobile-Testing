package Demo.AppiumFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.offset.ElementOption.element;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class TestHybridApp extends Capability{

	AndroidDriver<AndroidElement> driver;
	
	
	@BeforeTest
	public void setup() throws IOException, InterruptedException {
		startAppium().start();
		driver = capability();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	@Test(enabled=true , priority=0)
	public void bookNow() throws InterruptedException
	{
       TouchAction taction = new TouchAction(driver);
      
       AndroidElement bookNow=	driver.findElement(By.xpath("//*[@text='BOOK NOW']"));
       taction.tap(TapOptions.tapOptions().withElement(element(bookNow))).perform();
      
       AndroidElement hireBike	=driver.findElement(By.id("com.forbinary.banjararide:id/llMainLayout"));
       taction.tap(TapOptions.tapOptions().withElement(element(hireBike))).perform();
       AndroidElement cbHornet=	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"CB Hornet 160R\"))"));
       taction.tap(TapOptions.tapOptions().withElement(element(cbHornet))).perform();
       AndroidElement sDays=  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"7 days \"))"));
       taction.tap(TapOptions.tapOptions().withElement(element(sDays))).perform();
       AndroidElement bookNowAgain=driver.findElement(MobileBy.AndroidUIAutomator("text(\"Book Now\")"));
	   taction.tap(TapOptions.tapOptions().withElement(element(bookNowAgain))).perform();
	   AndroidElement date=driver.findElement(By.id("com.forbinary.banjararide:id/llDateContainer"));
	   taction.tap(TapOptions.tapOptions().withElement(element(date))).perform();
	   driver.findElementByAccessibilityId("30 May 2023").click();
	   driver.findElement(By.xpath("//*[@text='OK']")).click();
	   Thread.sleep(3000);
	   driver.pressKey(new KeyEvent(AndroidKey.BACK));
	   Thread.sleep(3000);
	   driver.pressKey(new KeyEvent(AndroidKey.BACK));
	   Thread.sleep(3000);
	  driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
  @Test(enabled=true , priority=1)
  public void menuBar_bookings() throws InterruptedException {
	  AndroidElement menuBar=  driver.findElementByAccessibilityId("Open");
	  TouchAction taction = new TouchAction(driver);
	taction.tap(TapOptions.tapOptions().withElement(element(menuBar))).perform();
	  AndroidElement booking=driver.findElement(MobileBy.AndroidUIAutomator("text(\"Bookings\")"));
	  taction.tap(TapOptions.tapOptions().withElement(element(booking))).perform();
	  driver.findElement(By.id("com.forbinary.banjararide:id/search_button")).click();
	  driver.findElementById("com.forbinary.banjararide:id/search_src_text").sendKeys("activa");
		Thread.sleep(3000);
	  AndroidElement Clear =	driver.findElementById("com.forbinary.banjararide:id/search_close_btn");
       taction.tap(TapOptions.tapOptions().withElement(element(Clear))).perform();
   	Thread.sleep(3000);
       driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
  }
  @Test(enabled=true , priority=6)
  public void callUs() {
	  TouchAction taction = new TouchAction(driver);
	  taction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Call Us\"))"))))).perform();
		driver.activateApp("com.forbinary.banjararide");
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		driver.findElement(By.id("com.android.systemui:id/button")).click();
  }
 @Test(enabled=true , priority=2)
public void aboutUs() throws InterruptedException {
		
	 TouchAction taction = new TouchAction(driver);
		AndroidElement about=driver.findElement(MobileBy.AndroidUIAutomator("text(\"About Us\")"));
		
		taction.tap(TapOptions.tapOptions().withElement(element(about))).perform();
		
		AndroidElement abo_us=driver.findElement(MobileBy.AndroidUIAutomator("text(\"About Company!\")"));
		taction.tap(TapOptions.tapOptions().withElement(element(abo_us))).perform();
		
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		AndroidElement Address=driver.findElement(MobileBy.AndroidUIAutomator("text(\"Address And Contact Number.\")"));
		taction.tap(TapOptions.tapOptions().withElement(element(Address))).perform();
		Thread.sleep(3000);
	    driver.pressKey(new KeyEvent(AndroidKey.BACK));
	    Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
	}
 @Test(enabled=true , priority=3)
	public void informationCenter() throws IOException, InterruptedException{
	 TouchAction taction = new TouchAction(driver);
		AndroidElement menu=driver.findElementByAccessibilityId("Open");
		
		taction.tap(TapOptions.tapOptions().withElement(element(menu))).perform();
		
		
		AndroidElement bookings=driver.findElement(MobileBy.AndroidUIAutomator("text(\"Information Center\")"));
		taction.tap(TapOptions.tapOptions().withElement(element(bookings))).perform();
		
		AndroidElement term=driver.findElement(MobileBy.AndroidUIAutomator("text(\"Terms & Conditions\")"));
		taction.tap(TapOptions.tapOptions().withElement(element(term))).perform();
		
		AndroidElement term1=driver.findElement(MobileBy.AndroidUIAutomator("text(\"Terms & Condition\")"));
		taction.tap(TapOptions.tapOptions().withElement(element(term1))).perform();
		
		AndroidElement pdf=driver.findElement(By.id("com.forbinary.banjararide:id/llFileLinearLayout"));
		taction.tap(TapOptions.tapOptions().withElement(element(pdf))).perform();
		
		driver.findElement(By.xpath("//*[@text='OK']")).click();
		
		Thread.sleep(5000);
	    driver.pressKey(new KeyEvent(AndroidKey.BACK));
	    Thread.sleep(6000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(6000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(6000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
 @Test(enabled=true , priority=4)
	public void Profile() throws InterruptedException{
	 TouchAction taction = new TouchAction(driver);
		
		 AndroidElement Menu =	driver.findElementByAccessibilityId("Open");
		 taction.tap(TapOptions.tapOptions().withElement(element(Menu))).perform();
		
		 AndroidElement TermsAndCondition =	driver.findElement(By.xpath("//*[@text='Profile']"));
	     taction.tap(TapOptions.tapOptions().withElement(element(TermsAndCondition))).perform();
	     
	     driver.findElementById("com.forbinary.banjararide:id/action_edit").click();
	     
	     driver.findElementById("com.forbinary.banjararide:id/edtInputProfile").clear();
	     
	     driver.findElementById("com.forbinary.banjararide:id/edtInputProfile").sendKeys("Amit Kumar");
	     
	     AndroidElement Back =	driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎\"]");
		 taction.tap(TapOptions.tapOptions().withElement(element(Back))).perform();
	     
		 AndroidElement Back1 =	driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎\"]");
		 taction.tap(TapOptions.tapOptions().withElement(element(Back1))).perform();
		
		
	}
	
	@Test(enabled=true , priority=5)
	public void appLanguage() throws InterruptedException{
		 TouchAction taction = new TouchAction(driver);
	
		 AndroidElement Menu =	driver.findElementByAccessibilityId("Open");
		 taction.tap(TapOptions.tapOptions().withElement(element(Menu))).perform();
		
		 AndroidElement Language =	driver.findElement(By.xpath("//*[@text='Change Language']"));
	       taction.tap(TapOptions.tapOptions().withElement(element(Language))).perform();
	     
	       AndroidElement Hindi =	driver.findElement(By.xpath("//*[@text='हिंदी']"));
	       taction.tap(TapOptions.tapOptions().withElement(element(Hindi))).perform();
		
	
			 AndroidElement Menu1 =	driver.findElementByAccessibilityId("Open");
			 taction.tap(TapOptions.tapOptions().withElement(element(Menu1))).perform();
			
			 AndroidElement Language1 =	driver.findElement(By.xpath("//*[@text='भाषा बदलो']"));
		       taction.tap(TapOptions.tapOptions().withElement(element(Language1))).perform();
		     
		       AndroidElement English =	driver.findElement(By.xpath("//*[@text='ENGLISH']"));
		       taction.tap(TapOptions.tapOptions().withElement(element(English))).perform();
	    
		
	}
	
}
