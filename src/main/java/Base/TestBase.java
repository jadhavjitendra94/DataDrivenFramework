package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public String ReadExcelFile(int row,int coll) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\DataDrivenFramework\\TestData\\Logindetails.xlsx");
	    Sheet Data = WorkbookFactory.create(file).getSheet("Sheet1");
	    String value = Data.getRow(row).getCell(coll).getStringCellValue();
	    return value;
		
		
	}
	public String ReadconfigProperty(String value) throws IOException
	{
		FileInputStream file =new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\DataDrivenFramework\\src\\main\\java\\Config\\Config.property");
		Properties prop=new Properties();
		prop.load(file);
		return prop.getProperty(value);
		
	}
	public void initilization() throws IOException
	{
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		driver.get(ReadconfigProperty("url"));
		
		
		
		
	}

}
