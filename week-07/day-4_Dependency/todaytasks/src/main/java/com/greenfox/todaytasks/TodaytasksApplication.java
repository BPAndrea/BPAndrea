package com.greenfox.todaytasks;

import com.greenfox.todaytasks.Service.MyColor;
import com.greenfox.todaytasks.Service.Printer;
import com.greenfox.todaytasks.Service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodaytasksApplication implements CommandLineRunner {


  private Printer printer;
  private MyColor myColor;


  @Autowired
  public TodaytasksApplication (Printer printer, MyColor myColor) {
    this.printer = printer;
    this.myColor = myColor;
  }

  /*
  Autowired 3 formája:
  1.) változó +field - NEM AJÁNLOTT
  @Autowired
  private Printer printer;

  2.) konstruktor
  @Autowired - EZT HASZNÁLJUK, HA KÖTELEZŐ, MINDEN ALKALOMMAL SZÜKSÉG VAN RÁ
   public TodaytasksApplication (Printer printer) {
    this.printer=printer;
  }
  3.) setteren keresztül
  @Autowired- EZT AKKOR PRAKTIKUS, HA NEM MINDEN ALKALOMMAL VAN RÁ SZÜKSÉG
  public void setPrinter(Printer printer) {
    this.printer=printer;
  }

   */
  public static void main(String[] args) {
    SpringApplication.run(TodaytasksApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    printer.log(myColor.printColor());
  }
}

