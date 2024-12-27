package BuilderPractice;

import java.util.ArrayList;
import java.util.List;

public class BuilderPraticeExercise {
    public static void main(String[] args) {

        //Abstraction --> Revealing the functionality and hiding the implementation

        EmailMessage message1 = new EmailMessage();

        List<String> toEmails = new ArrayList<String>();
        toEmails.add("vijaya@gmail.com");
        toEmails.add("rajendra@gmail.com");
        message1.addTo(toEmails);

        List<String> ccEails = new ArrayList<String>();
        ccEails.add("ritesh@gmail.com");
        ccEails.add("reyansh@gmail.com");
        message1.addCC(ccEails);

        String subject = "This is my first email";
        message1.setSubject(subject);

        String body = "Hello World Programming";
        message1.setBody(body);
        message1.addAttachment("MyFile");
        message1.setpriority("High");

        message1.printEmailMessage();
        //System.out.println(message);

        EmailMessage message2 = new EmailMessage(toEmails, ccEails, body, subject, "attchment", "High");
        message2.printEmailMessage();







    }

}