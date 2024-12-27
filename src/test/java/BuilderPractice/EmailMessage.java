package BuilderPractice;

import java.util.ArrayList;
import java.util.List;

public class EmailMessage {

    private String priority;
    private List<String> To;
    private List<String> CC;
    private String Body;
    private String Subject;
    private String Attachments;
    //private String Priority;


//        private EmailMessage()
//        {
//            System.out.println("This is a default constructor");
//            //Activities before launching the app
//            //setup code which is only private to this class
//           // password="Password123";
//        }

    public EmailMessage() {

    }

    public EmailMessage(List<String> To, List<String> CC, String Body, String Subject, String Attachments, String priority) {
        this.To=To;
        this.CC=CC;
        this.Body=Body;
        this.Subject= Subject;
        this.Attachments=Attachments;
        this.priority=priority;
    }

    public void printEmailMessage() {
        System.out.println("To Emailid: "+To);
        System.out.println("CC Emailid: "+CC);
        System.out.println("Subject: "+Subject);
        System.out.println("Body: "+Body);
        System.out.println("Priority: "+priority);
    }

    public void addTo(List<String> emailaddress) {
        this.To = emailaddress;
    }

    public void addCC(List<String> emailaddress) {
        this.CC = emailaddress;
    }

    public void setSubject(String sub) {
        this.Subject = sub;
    }

    public void setBody(String body) {
        this.Body = body;
    }

    public void addAttachment(String attachment) {
        this.Attachments = attachment;
    }

    public void setpriority(String priority) {
        this.priority = priority;
    }



    }

