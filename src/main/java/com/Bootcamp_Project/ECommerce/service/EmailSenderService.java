package com.Bootcamp_Project.ECommerce.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Async
public class EmailSenderService {
   @Autowired
   private JavaMailSender mailSender;

   public void sendSimpleEmail(String toEmail , String body , String subject )
   {
      SimpleMailMessage message = new SimpleMailMessage();
      message.setTo(toEmail);
      message.setSubject(subject);
      message.setText(body);
      mailSender.send(message);
      log.info("Email sent successfully");
   }
}
