package brokenLinks;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckLinks {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Set<String> brokenlinks = new HashSet<String>();
		
		driver.get("https://www.hyrtutorials.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		for(WebElement link : links)
		{
			String linkURL = link.getAttribute("href");
			URL url = new URL(linkURL);
			url.openConnection();
			URLConnection urlconnection = url.openConnection(); 
			HttpURLConnection httpconnection = (HttpURLConnection) urlconnection;

			httpconnection.setConnectTimeout(5000);
			httpconnection.connect();

			if(httpconnection.getResponseCode()==200)
			{
				System.out.println(linkURL+"-"+httpconnection.getResponseMessage());
			}
			else
			{
				System.err.println(linkURL+"-"+httpconnection.getResponseCode());
			}
			
			
			/** if you want to print only broken links then-------------------------*/
			/** for example 200 resopnse is ok and baki sub response broken hai*/
			
			
//			if(httpconnection.getResponseCode()!=200)
//			{
//				brokenlinks.add(linkURL);
//			}
			
			httpconnection.disconnect();
		}	

		driver.quit();
		
		// for print broken links only------------------------
		
//		for(String broken : brokenlinks)
//		{
//			System.out.println(broken);
//		}

		/**linkURL = save all links address in a Webpage.

		 * URL = is a class in java is used to handle URL operations.

		 * url.openConnection() = method in Java is used to create a 
		 * connection to the specified resource (e.g., a web page or a file).*/



	}

}
