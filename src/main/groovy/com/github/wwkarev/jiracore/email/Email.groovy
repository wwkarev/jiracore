//package com.github.wwkarev.jiracore.email
//
//import com.atlassian.jira.component.ComponentAccessor
//import com.atlassian.jira.mail.builder.EmailBuilder
//import com.atlassian.mail.server.SMTPMailServer
//import javax.mail.BodyPart
//import javax.mail.internet.MimeBodyPart
//
//import com.atlassian.jira.mail.Email as JiraEmail
//
///**
// * Class for sending emails
// * @author wwkarev
// */
//class Email {
//    private String address
//    private String subject
//    private String body
//    private List<String> attachmentList = []
//
//    void send() {
//        this.validate()
//
//        JiraEmail email = new JiraEmail(address);
//        EmailBuilder emailBuilder = new EmailBuilder(email, "text/html", Locale.US)
//        emailBuilder
//                .withSubject(subject)
//                .withBody(body)
//        attachmentList.each{ fileName ->
//            BodyPart bodyPart = new MimeBodyPart()
//            bodyPart.attachFile(fileName)
//            emailBuilder.addAttachment(bodyPart)
//        }
//        email = emailBuilder.renderNow()
//
//        SMTPMailServer mailServer = ComponentAccessor.getMailServerManager().getDefaultSMTPMailServer()
//        mailServer.send(email)
//    }
//
//    private validate() {
//        if (address == null) {
//            throw new IllegalArgumentException('Email address is required')
//        }
//        if (subject == null) {
//            throw new IllegalArgumentException('Subject is required')
//        }
//    }
//
//    String getAddress() {
//        return address
//    }
//
//    Email setAddress(String address) {
//        this.address = address
//        return this
//    }
//
//    String getSubject() {
//        return subject
//    }
//
//    Email setSubject(String subject) {
//        this.subject = subject
//        return this
//    }
//
//    String getBody() {
//        return body
//    }
//
//    Email setBody(String body) {
//        this.body = body
//        return this
//    }
//
//    List<String> getAttachments() {
//        return attachmentList
//    }
//
//    Email addAttachment(String fileName) {
//        this.attachmentList.add(fileName)
//        return this
//    }
//}
