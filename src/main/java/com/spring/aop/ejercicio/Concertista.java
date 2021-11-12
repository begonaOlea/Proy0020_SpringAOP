package com.spring.aop.ejercicio;

public class Concertista  implements  Actuacion{

    private String obra;

    public Concertista() {  }

    public void setObra(String obra) {
        this.obra = obra;
    }
    public void actuar() throws Exception {
        if ( ! obra.equals("desafina")){
             System.out.println("Toco la obra " + obra);
        }else{
            System.out.println("Toca una obra desafinada");
            throw new Exception("El concertista desafina");
        }
    }
}
