package ucb.estudo.email;

import java.util.ArrayList;
import java.util.List;

public class EmailBuilder {
    private String to;
    private String subject;
    private String body;
    private String cc;
    private String bcc;
    private List<String> attachments = new ArrayList<>();

    public EmailBuilder setTo(String to) {
        this.to = to;
        return this;
    }

    public EmailBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public EmailBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public EmailBuilder setCc(String cc) {
        this.cc = cc;
        return this;
    }

    public EmailBuilder setBcc(String bcc) {
        this.bcc = bcc;
        return this;
    }

    public EmailBuilder addAttachment(String attachment) {
        this.attachments.add(attachment);
        return this;
    }

    public Email build(){
        //TODO: Atributos obrigatórios
        if (to == null || subject == null || body == null) {
            throw new IllegalStateException("To, Subject e Body são campos obrigatórios.");
        }
        return new Email(this);
    }

    // Getter's

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
