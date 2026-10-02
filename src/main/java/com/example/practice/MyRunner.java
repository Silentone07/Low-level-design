package com.example.practice;

import com.example.practice.designpattern.FactoryDesignPattern;
import com.example.practice.designpattern.NotificationFactory;
import com.example.practice.designpattern.Vehicle;
import com.example.practice.solidprinciple.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

   private EmailNotification emailNotification;

    Human human;

    @Autowired
    public void setHuman(Human human) {
        this.human = human;
    }
    PaymentMethod paymentMethod;

    FactoryDesignPattern factoryDesignPattern;

//    NotificationService notificationService;
//
//    @Autowired
//    public void setNotificationService(NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }
    NotificationFactory notificationFactory;

    @Autowired
    public void setNotificationFactory(NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    @Autowired
    public void setFactoryDesignPattern(FactoryDesignPattern factoryDesignPattern) {
        this.factoryDesignPattern = factoryDesignPattern;
    }

    //    @Autowired
//    public void setPaymentMethod(PaymentMethod paymentMethod) {
//        this.paymentMethod = paymentMethod;
//    }
//    PaymentService paymentService;
//
//    @Autowired
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    @Autowired
    public void setEmailNotification(EmailNotification emailNotification) {
        this.emailNotification = emailNotification;
    }

    @Override
    public void run(String... args) throws Exception {
        emailNotification.send();
        human.eat();
        human.work();
        PaymentService paymentService1=new PaymentService(new CardPayment());
        paymentService1.payAmount();

        Vehicle obj=factoryDesignPattern.getVehicle("car");

        obj.drive();

        NotificationService obj1=notificationFactory.getNotification("Email");
        obj1.send();




    }
}
