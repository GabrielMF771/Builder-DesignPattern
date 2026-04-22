package ucb.estudo;

import ucb.estudo.email.Email;
import ucb.estudo.email.EmailBuilder;

public class Main {
    public static void main(String[] args) {
        EmailBuilder builder = new EmailBuilder();
        Email email = builder
                .setTo("contato@gabriel.com")
                .setSubject("Atualizações sobre o projeto")
                .setBody("Olá Gabriel, .....")
                //.setCc("contato@joao.com")
                //.setBcc("contato@maria.com")
                //.addAttachment("relatorio.pdf")
                .build();

        // O e-mail é imutável, pois não possui setters e os seus atributos são privados.

        System.out.println("EMAIL");
        System.out.println(" ");
        System.out.println("To: " + email.getTo());
        System.out.println("Subject: " + email.getSubject());
        System.out.println("Body: " + email.getBody());
        System.out.println("Cc: " + email.getCc());
        System.out.println("Bcc: " + email.getBcc());
        System.out.println("Attachments: " + email.getAttachments());


    }
}