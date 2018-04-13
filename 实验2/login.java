package lab2;

import java.io.IOException;
import java.nio.charset.Charset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.csvreader.CsvReader;

public class login {
	public static void main(String[] args) throws IOException {
    CsvReader r = new CsvReader("D:/study/�������2018/input.csv", ',',Charset.forName("GBK"));
    r.readHeaders();
    while (r.readRecord()) {                        
    	r.readRecord();             
    	String number_csv = r.get("ѧ��");              
    	//String name_csv = r.get("����");
    	String address_csv = r.get("github��ַ");
    	String pwd_csv = number_csv.substring(number_csv.length()-6,number_csv.length());
    	System.setProperty("webdriver.firefox.bin", "D:/study/�������2018/Firefox Setup 40.0.exe"); 
    	WebDriver driver = new FirefoxDriver();
    	driver.get("\"https://psych.liebes.top/st\"");               
    	driver.manage().window().maximize();
    	WebElement username = driver.findElement(By.id("name"));
    	username.clear();
    	username.sendKeys(number_csv);
    	WebElement password = driver.findElement(By.id("pwd"));
    	password.clear();
    	password.sendKeys(pwd_csv);
    	WebElement btn = driver.findElement(By.id("submit"));
    	btn.click();
        String info_web = driver.findElement(By.xpath("//tbody[@id='table-main']")).getText();
       // String name_web = info_web.substring(info_web.indexOf("��") + 2, info_web.indexOf("ѧ") - 1);
        String number_web = info_web.substring(info_web.indexOf("��") + 2, info_web.indexOf("G") - 1);
        String address_web = info_web.substring(info_web.indexOf("ַ") + 2);         

        if(number_csv.equals(number_web)&&address_csv.equals(address_web)){
        	System.out.println(number_web+"��Ϣһ��.");
        }
        else{
                System.out.println(number_web+"����Ϣ��һ��.");
        }
        driver.close();
        
    }
         r.close();            
         }
}
