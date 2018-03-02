package triangulo.teste;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;




public class AndroidSetup {
	
		protected AndroidDriver driver;

	    protected void prepareAndroidForAppium() throws MalformedURLException {
	    	File diretorioAplicacao = new File("/Users/m.siqueira.viana/Documents/TesteAppium/rubyAppiumAndroid/build/apk/");
			File arquivoAplicacao = new File(diretorioAplicacao, "TrianguloApp.apk");
			
			DesiredCapabilities capacidade = new DesiredCapabilities();
			capacidade.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
			capacidade.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API 27");
			capacidade.setCapability(MobileCapabilityType.APP, arquivoAplicacao.getAbsolutePath());
			
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidade);
	        
	        
		/*
		 * 
		 * 	protected void driver() throws MalformedURLException {
		
		*/
		
	}

}
