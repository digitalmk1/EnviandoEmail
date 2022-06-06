package enviando.email;


import org.junit.Test;



public class AppTest {
	
	//private String userName = "marcioprogramadorjava01@gmail.com";
	//private String senha = "nhpisrklvrdkjrfl";
	
	@Test
	public void testeEmail() throws Exception {
		
		ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail("DIGITALMK TECNOLOGIA","marciodmk@gmail.com,val.florentino.vf@gmail.com ,marcioprogramador01@gmail.com",
						"testando email do sistema", "Enviando email teste do sistema que esta sendo desenvolvido");
		
		
		enviaEmail.enviarEmail();
		
		/* Caso  o email esteja demorando de ser enviado colocar o thead.sleep porem
		 * isso só pode ser usado em modo teste.
		 * */
		Thread.sleep(5000);
	}
}
