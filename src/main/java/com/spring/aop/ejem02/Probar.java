package com.spring.aop.ejem02;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// EJEMPLO 2 - AOP - CREAR UN ASUNTO SPRING CLÁSICO

public class Probar {
    public static void main(String[] args) {
        try {
            ApplicationContext ctx;
            ctx = new ClassPathXmlApplicationContext("/com/spring/aop/ejem02/teatro.xml");
            System.out.println("Pianista....");
            Representable r = (Representable) ctx.getBean("pianista");
            System.out.println("Se inicia el concierto....");
            r.actuar();
        } catch (ActuacionException ex) {
            Logger.getLogger(Probar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
