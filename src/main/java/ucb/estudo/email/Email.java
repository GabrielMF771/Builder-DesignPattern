package ucb.estudo.email;

import java.util.List;

public class Email {
    private String to;
    private String subject;
    private String body;
    private String cc;
    private String bcc;
    private List<String> attachments;

    // Se fosse fazer um construtor para cada combinação, precisaria de 64 construtores (2^6)

    Email(EmailBuilder builder){
        this.to = builder.getTo();
        this.subject = builder.getSubject();
        this.body = builder.getBody();
        this.cc = builder.getCc();
        this.bcc = builder.getBcc();
        this.attachments = builder.getAttachments();
    }


    //Getter's

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public String getCc() {
        return cc;
    }

    public String getBcc() {
        return bcc;
    }

    public List<String> getAttachments() {
        return attachments;
    }
}
