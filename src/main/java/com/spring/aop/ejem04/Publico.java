package com.spring.aop.ejem04;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;

@Aspect
public class Publico {
	
    @Before("execution(* *.actuar(..))")
    public void tomarAsiento(){
        System.out.println("El público toma asiento");
    }
    @AfterReturning("execution(* *.actuar(..))")
    public void aplaudir(){
        System.out.println("pla pla pla !! Bravo");
    }
    @AfterThrowing("execution(* *.actuar(..))")
    public void abuchear(){
        System.out.println("Buuuu !! Fuera !!");
    }
} 
