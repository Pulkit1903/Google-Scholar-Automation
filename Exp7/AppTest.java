package act6.sui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class AppTest {
	@Test
	public static void test() {
		System.getProperty("webdriver.chrome.driver","C:\\Users\\pulki\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver obj=new ChromeDriver();
		obj.manage().window().maximize();
		obj.get("http://127.0.0.1:5500/src/main/java/act6/sui/home.html");
		//find by ID
		WebElement num1Input = obj.findElement(By.id("num1"));
        WebElement num2Input = obj.findElement(By.id("num2"));
        num1Input.sendKeys("10"); // Enter value t1
        num2Input.sendKeys("5");  // Enter value t2

        // Click on the "Add" button
        obj.findElement(By.xpath("//button[text()='Add']")).click();

        // Get the result
        WebElement resultElement = obj.findElement(By.id("result"));
        String result = resultElement.getText();

        // Verify the result
        if (result.contains("Sum: 15")) {
            System.out.println("Addition Test Passed");
        } else {
            System.out.println("Addition Test Failed");
        }    
    }
	@Test
	public static void test2() {
		System.getProperty("webdriver.chrome.driver","C:\\Users\\pulki\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver obj=new ChromeDriver();
		obj.manage().window().maximize();
		obj.get("http://127.0.0.1:5500/src/main/java/act6/sui/home.html");

		WebElement num1Input = obj.findElement(By.id("num1"));
        WebElement num2Input = obj.findElement(By.id("num2"));
        num1Input.sendKeys("10"); // Enter value t1
        num2Input.sendKeys("5");  // Enter value t2

        // Click on the "Add" button
        obj.findElement(By.xpath("//button[text()='Subtract']")).click();

        // Get the result
        WebElement resultElement = obj.findElement(By.id("result"));
        String result = resultElement.getText();

        // Verify the result
        if (result.contains("Difference: 5")) {
            System.out.println("Addition Test Passed");
        } else {
            System.out.println("Addition Test Failed");
        }    

	}
	@Test
	public static void test3() {
		System.getProperty("webdriver.chrome.driver","C:\\Users\\pulki\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver obj=new ChromeDriver();
		obj.manage().window().maximize();
		obj.get("http://127.0.0.1:5500/src/main/java/act6/sui/home.html");

		WebElement num1Input = obj.findElement(By.id("num1"));
        WebElement num2Input = obj.findElement(By.id("num2"));
        num1Input.sendKeys("10"); // Enter value t1
        num2Input.sendKeys("5");  // Enter value t2

        // Click on the "Add" button
        obj.findElement(By.xpath("//button[text()='Multiply']")).click();

        // Get the result
        WebElement resultElement = obj.findElement(By.id("result"));
        String result = resultElement.getText();

        // Verify the result
        if (result.contains("Multiply: 50")) {
            System.out.println("Addition Test Passed");
        } else {
            System.out.println("Addition Test Failed");
        }    

	}
	@Test
	public static void test4() {
		System.getProperty("webdriver.chrome.driver","C:\\Users\\pulki\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver obj=new ChromeDriver();
		obj.manage().window().maximize();
		obj.get("http://127.0.0.1:5500/src/main/java/act6/sui/home.html");

		WebElement num1Input = obj.findElement(By.id("num1"));
        WebElement num2Input = obj.findElement(By.id("num2"));
        num1Input.sendKeys("10"); // Enter value t1
        num2Input.sendKeys("5");  // Enter value t2

        // Click on the "Add" button
        obj.findElement(By.xpath("//button[text()='Divide']")).click();

        // Get the result
        WebElement resultElement = obj.findElement(By.id("result"));
        String result = resultElement.getText();

        // Verify the result
        if (result.contains("Quotient: 2")) {
            System.out.println("Addition Test Passed");
        } else {
            System.out.println("Addition Test Failed");
        }    

	}
}