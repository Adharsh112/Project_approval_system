/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Maindata;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class ss {
 public static void mail(String email,String key,String subject) {


 
 String to=email; 
  Properties props = new Properties();
  props.put("mail.smtp.host", "smtp.gmail.com");
  props.put("mail.smtp.socketFactory.port", "465");
  props.put("mail.smtp.socketFactory.class",
            "javax.net.ssl.SSLSocketFactory");
  props.put("mail.smtp.auth", "true");
  props.put("mail.smtp.port", "465");

  Session session = Session.getDefaultInstance(props,
   new javax.mail.Authenticator() {
   protected PasswordAuthentication getPasswordAuthentication() {    
   return new PasswordAuthentication("sudhatestmail@gmail.com","nhbjssyxvxbendzz");   
   }
  });
 
 try {
   MimeMessage message = new MimeMessage(session);
   message.setFrom(new InternetAddress("sudhatestmail@gmail.com")); 
   message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
   message.setSubject(subject);
   message.setText(key);
   Transport.send(message);
   System.out.println("message sent successfully");

  } catch (MessagingException e) {throw new RuntimeException(e);}

 }
 public static void main(String args[])
 {
     mail("sudha.kota23@gmail.com","Testing....","Testing....");
 }
 
}  