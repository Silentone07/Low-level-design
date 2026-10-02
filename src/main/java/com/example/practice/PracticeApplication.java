package com.example.practice;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.practice.bookmyshow.*;
import com.example.practice.builder.Computer;
import com.example.practice.decorator.*;
import com.example.practice.loggingsystem.*;
import com.example.practice.lrucache.LRUCacheService;
import com.example.practice.notificationservice.Notification;
import com.example.practice.notificationservice.NotificationFactory;
import com.example.practice.notificationservice.NotificationType;
import com.example.practice.observerpattern.*;
import com.example.practice.observerpattern.Observer;
import com.example.practice.splitwiseapp.*;
import com.example.practice.splitwiseapp.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.*;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {

        SpringApplication.run(PracticeApplication.class, args);
        // System.out.println("HELLO AMIT");

//        User user1=new User(1,"Amit");
//        User user2=new User(2,"Satpreet");
//        User user3=new User(3,"Ronit");
//
//        List<User> users= Arrays.asList(user1,user2,user3);
//
//        Group group=new Group(1,"College-Expense",users,new ArrayList<>());
//
//        SplitStrategy splitStrategy=new EqualSplitStrategy();
//
//        Expense expense=new Expense(
//                1200.0,user1,users,splitStrategy);
//
//         SplitwiseService splitwiseService=new SplitwiseService();
//          splitwiseService.addExpense(group,expense);
//          List<Balance>balances=splitwiseService.showBalance(group);
//
//          for(Balance balance:balances) {
//                System.out.println(balance.getFrom() + "ows" + balance.getAmount() + balance.getTo());
//          }
       /* Movie movie=new Movie();
        movie.setMovieName("Avenger");
        movie.setMovieId(123);
        movie.setDuration("2.5h");

        Seat seat=new Seat();
        seat.setSeatId(123);
        seat.setSeatNo("A1");
        Seat seat1=new Seat();
        seat1.setSeatId(234);
        seat1.setSeatNo("B1");
        List<Seat>seats=Arrays.asList(seat,seat1);
        Screen screen=new Screen();
        screen.setScreenId(12l);
        screen.setSeats(seats);
        List<Screen>screenList=Arrays.asList(screen);

        User user=new User(1,"Amit");
         Map<Integer,SeatStatus> seatStatusMap=new HashMap<>();
         seatStatusMap.put(1,SeatStatus.AVAILABLE);
         seatStatusMap.put(2,SeatStatus.AVAILABLE);
         seatStatusMap.put(3,SeatStatus.AVAILABLE);
        Show show=new Show();
        show.setShowId(11);
        show.setMovie(movie);
        show.setScreen(screen);
        show.setStartTime(LocalDateTime.now());
        show.setEndTime(LocalDateTime.now().plusHours(2));
        show.setSeatStatus(seatStatusMap);

        Theatre theatre=new Theatre();
        theatre.setTheatreId(12l);
        theatre.setAddress("mumbai");
        theatre.setTheatreName("PVR");
        theatre.setScreens(screenList);


         BookingService bookingService=new BookingService();
          bookingService.createBooking(user.getUserId(),show.getShowId(),seats);
          System.out.println("booked ticket information" + bookingService);*/

        NotificationFactory notificationFactory = new NotificationFactory();

        Notification notification = notificationFactory.getNotification(NotificationType.EMAIL);
        notification.sendMessage("Amit", "Hello Amit, how you doing?");

         List<LogAppender>logAppenderList=Arrays.asList(new ConsoleLog(),new FileLog());
       //  LoggerService logger=new LoggerService(LogLevel.INFO,logAppenderList);
       //  logger.info("Please print this log");

        LRUCacheService lruCache = new LRUCacheService(3);
        lruCache.put("A", 123);
        lruCache.put("B", 234);
        lruCache.put("C", 567);
        lruCache.get("A");


        Order order = new Order();
        Observer email = new EmailNotification();
        Observer sms = new SmsNotification();
        StockObserver user1 = new StockUser1();
        StockObserver user2 = new StockUser2();

        Stock stock = new Stock();

        Coffee coffee = new BasicCoffee();
        coffee = new Milk(coffee);
        coffee=new Sugar(coffee);

        System.out.println(coffee.getCost());

        Burger burger=new BasicBurger();
        burger=new Cheese(burger);
        burger=new Sauce(burger);

        System.out.println(burger.getPrice());

    }

    Computer computer= new Computer.Builder("Lenovo","intel core-i5",16,256).
            graphicsCard("NVIDIA GFORCE").bluetooth(true).build();



}
