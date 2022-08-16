package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class FailedTestCase extends TestBase{
	public static void takephoto(String name) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\admin\\eclipse-workspace\\DataDrivenFramework\\Screenshot//"+ name +".jpeg");
		FileHandler.copy(source, dest);
	}}
