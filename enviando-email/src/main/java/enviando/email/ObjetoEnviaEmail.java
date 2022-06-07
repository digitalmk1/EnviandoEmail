package enviando.email;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ObjetoEnviaEmail {

	private String userName = "marcioprogramadorjava01@gmail.com";
	private String senha = "nhpisrklvrdkjrfl";

	private String listaDestinatarios = "";
	private String nomeRemetente = "";
	private String assuntoEmail = "";
	private String textoEmail = "";
	

	public ObjetoEnviaEmail(String listaDestinatario, String nomeRemetente, String assuntoEmail, String textoEmail ) {
		
	this.listaDestinatarios = listaDestinatario;
	this.nomeRemetente = nomeRemetente;
	this.assuntoEmail = assuntoEmail;
	this.textoEmail = textoEmail;
	
	}
	
	public void enviarEmail(boolean enviarHtml) throws Exception {

		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");/* Autorização */
		properties.put("mail.smtp.starttls", "true"); /* Autenticação */
		properties.put("mail.smtp.host", "smtp.gmail.com"); /* Sercidor gmail Google */
		properties.put("mail.smtp.port", "465");/* Porta do servidor */
		properties.put("mail.smtp.socketFactory.port", "465");/* Expecifica a porta a ser conectada pelo socket */
		properties.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");/* Classe socket de conexão ao SMTP */

		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, senha);
			}
		});

		Address[] toUser = InternetAddress
		.parse("marcio@digitalmk.com.br, marcioprogramadorjava01@gmail.com,marciodmk@gmail.com");

		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(userName, nomeRemetente)); /* Quem está enviano exemplo digitalmk.com.br */
		message.setRecipients(Message.RecipientType.TO, toUser);/* Email de destino */
		message.setSubject(assuntoEmail);/* Assunto do e-mail */
		message.setText(textoEmail);
		
		if(enviarHtml) {
			message.setContent(textoEmail, "text/html; charset= utf-8");
	
		} else {
			
			message.setText(textoEmail);
		}

		Transport.send(message);
		System.out.println("Email enviado com sucesso!!");
       //enviar com a pagina teste.
	}
}