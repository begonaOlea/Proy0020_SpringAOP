package com.spring.aop.ejem02;

public class Concertista implements Representable{

    private String obra;


    public Concertista() {
    }

    public void setObra(String obra) {
        this.obra = obra;
    }

  

    public void actuar() throws ActuacionException {
      
     
           System.out.println("Tocando la obra " + obra);
         
     
    }
}
