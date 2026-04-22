# Builder de E-mail (Java)

Este projeto demonstra, de forma simples, o uso do **padrão de projeto Builder** para criar objetos de e-mail com campos obrigatórios e opcionais.

## Objetivo

Evitar construtores com muitas combinações de parâmetros e tornar a criação de objetos mais legível, encadeando métodos (`setTo`, `setSubject`, `setBody`, etc.).

## Tecnologias

- Java 17
- Maven

## Estrutura do projeto

- `src/main/java/ucb/estudo/Main.java`
  - Classe de execução com exemplo de criação de e-mail e impressão no console.
- `src/main/java/ucb/estudo/email/Email.java`
  - Classe do objeto final (imutável por não expor setters).
- `src/main/java/ucb/estudo/email/EmailBuilder.java`
  - Responsável por montar o objeto `Email` com método encadeado e validação dos campos obrigatórios.

## Como funciona o Builder neste projeto

1. Você cria uma instância de `EmailBuilder`.
2. Define os campos necessários e opcionais com encadeamento.
3. Chama `build()` para gerar um `Email`.

No método `build()`, os campos obrigatórios são validados:

- `to`
- `subject`
- `body`

Se algum deles estiver ausente, é lançada `IllegalStateException`.

## Exemplo de uso

```java
Email email = new EmailBuilder()
        .setTo("contato@gabriel.com")
        .setSubject("Atualizações sobre o projeto")
        .setBody("Olá Gabriel, .....")
        //.setCc("contato@joao.com")
        //.setBcc("contato@maria.com")
        //.addAttachment("relatorio.pdf")
        .build();
```

## Saída esperada (exemplo)

```text
EMAIL

To: contato@gabriel.com
Subject: Atualizações sobre o projeto
Body: Olá Gabriel, .....
Cc: null
Bcc: null
Attachments: []
```

## Observação didática

Sem o Builder, seria comum criar muitos construtores para cobrir combinações de campos opcionais. Com o padrão Builder, o código fica mais organizado, legível e fácil de manter.

