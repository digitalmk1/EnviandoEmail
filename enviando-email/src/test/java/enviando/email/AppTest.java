package enviando.email;


import org.junit.Test;



public class AppTest {
	
	//private String userName = "marcioprogramadorjava01@gmail.com";
	//private String senha = "nhpisrklvrdkjrfl";
	
	@Test
	public void testeEmail() throws Exception {

		
		StringBuilder stringBuildertextoEmail = new StringBuilder();
		stringBuildertextoEmail.append(" Olá, <br/><br/>");
		stringBuildertextoEmail.append("  Vamos lá programador java Estamos evoluindo<br/><br/> ");
		stringBuildertextoEmail.append("Para ter acesso ao nosso sistema clique no botão a baixo ");
		stringBuildertextoEmail.append("<b> Login:</b>marcio@digitalmk.com.br <br/>");
		stringBuildertextoEmail.append("<b> Senha: </b> sdsdsd <b/><br/><br/>");
		stringBuildertextoEmail.append("<a target=\"_blank\"href=\"https://hiper.com.br/experimente-gratis?HCode=DIG01656\" Style=\"color:#ffffff; padding: 10px 20px;  text-align:center; text-decoration: none; display:inline-block; border-radius:15px; font-size:20px;font-family:courier;border :2px solid green;background-color:#99da39; \">Cadastre-se.</a><br/><br/>");
		
		stringBuildertextoEmail.append("<span>Ass.: Márcio S Oliveira</span>");
		ObjetoEnviaEmail enviaEmail = 
				new ObjetoEnviaEmail(" DIGITALMK TECNOLOGIA ,marciodmk@gmail.com, marcioprogramador01@gmail.com ",
						" MARCIO OLIVEIRA  - DIGITALMK - Treinamento ",
						" Testando envio de email com java ",
						stringBuildertextoEmail.toString());
                    
		enviaEmail.enviarEmail(true);
		
		/* Caso  o email esteja demorando de ser enviado colocar o thead.sleep porem
		 * isso só pode ser usado em modo teste.
		 * */
		//Thread.sleep(5000);
	}
}
