package Utils;
import static io.restassured.RestAssured.given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.restassured.path.json.JsonPath;
public class Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php");
		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("tanub.0509@gmail.com");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bindu@1614");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		String a2 = url.split("code=")[1];
		String a3 = a2.split("@scope=")[0];
	
		 String a1 = given().urlEncodingEnabled(false)
		.queryParams("code",a3)
		.queryParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.queryParams("client_secret","erZOWM9g3UtwNRj340YYaK_W")
		.queryParams("redirect_uri","https%3A%2F%2Flogin.naukri.com%2FnLogin%2FCallbackController.php")
		.queryParams("grant_type", "authorization_code")
		.when()
		.get("https://www.googleapis.com/oauth/v4/token").asString();
		System.out.println(a1);
		JsonPath js = new JsonPath(a1);
		String access_token = js.get("access_token");
		
		String res = given().queryParam("access_token",access_token)
		.when()
		.get("https://rahulshettyacademy.com/getCourse.php").asString();
		System.out.println(res);
	}
}