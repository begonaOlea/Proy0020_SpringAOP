package com.spring.aop.ejem03;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Prueba {
    public static void main(String[] args) {
        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/spring/aop/ejem03/concierto.xml");
            Actuacion a = (Actuacion) ctx.getBean("pianista");
            a.actuar();
            Actuacion a2 = (Actuacion) ctx.getBean("violinista");
            a2.actuar();
        } catch (Exception ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
