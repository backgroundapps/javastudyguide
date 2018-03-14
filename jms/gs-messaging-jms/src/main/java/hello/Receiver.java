package hello;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
  
  @JmsListener(destination = "mailbox", containerFactory = "myFactory")
  public void receiverMessage(Email email) {
    System.out.println("Receiver <" + email + ">");
  }
}
