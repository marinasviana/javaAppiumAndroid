package triangulo.teste;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import screens.TrianguloSceem;

import static org.junit.Assert.*;				
import org.junit.Test;

public class TrianguloSteps extends TrianguloSceem{
	
	@Dado("^que estou com o app aberto$")
	public void que_estou_com_o_app_aberto() throws Exception  {
		
	    openApp();
	}

	@Quando("^informo o tamnhao  (\\d+) , (\\d+) , (\\d+) dos lados do triângulo$")
	public void informo_o_tamnhao_dos_lados_do_triângulo(int arg1, int arg2, int arg3) throws Exception  {
		tipoTriangulo();
	}

	@Então("^devo ver o texto \"([^\"]*)\"$")
	public void devo_ver_o_texto(String arg1)  {
		 
		 assertEquals(resultado(),arg1);
	}
}
