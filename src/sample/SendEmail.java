package sample;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
public class SendEmail implements Runnable{
  String user_email;
  String user_name;
  Thread t;
  public SendEmail(String email, String user_name){
    this.user_email = email;
    this.user_name = user_name;
    t = new Thread(this, "Email Thread");
    t.start();
  }
  @Override
  public void run() {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    final String username = "";
    final String password = "";
    Properties props = new Properties();
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");
    Session session = Session.getInstance(props, new javax.mail.Authenticator() {
      protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("esspro.invoice@gmail.com", "Asdf123$"); }});
    try {
      Message message = new MimeMessage(session);
      message.setFrom(new InternetAddress(user_email));
      message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(user_email));
      message.setSubject("Order Confirmation");
      message.setText("Thank You For Ordering from EssPro! Your order will be delivered in 2-3 working days.");
      Transport.send(message);
    } catch (MessagingException e) {
        throw new RuntimeException(e);
    }
  }
}
