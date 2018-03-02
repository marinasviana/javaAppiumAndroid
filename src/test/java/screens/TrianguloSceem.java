package screens;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import triangulo.teste.AndroidSetup;

public class TrianguloSceem extends AndroidSetup {
	
    String campo1 = "txtLado1";
    String campo2 = "txtLado2";
    String campo3 = "txtLado3";
    String calculo = "btnCalcular";
    String tipoTriangiloResultado = "txtResultado";

	public void openApp() throws Exception{
    		prepareAndroidForAppium();
		driver.findElement(By.id(calculo));
	}
    
	public void tipoTriangulo() throws Exception {
		
		driver.findElement(By.id(campo1)).sendKeys("1");
		driver.findElement(By.id(campo2)).sendKeys("1");
		driver.findElement(By.id(campo3)).sendKeys("1");
		driver.findElement(By.id(calculo)).click();
	}

	public String resultado() {
		return driver.findElement(By.id(tipoTriangiloResultado)).getText();
	}
}
