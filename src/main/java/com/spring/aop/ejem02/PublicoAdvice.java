
package com.spring.aop.ejem02;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

//ASUNTO (ADVICE) QUE DEFINE COMO  VA HA SER APLICADA
//LA FUNCIONALIDAD DE UN PUBLICO
// PublicoAdvice es una clase que implementa tres tipos de
// diferentes de asunto AOP
public class PublicoAdvice
        implements MethodBeforeAdvice,
        AfterReturningAdvice, ThrowsAdvice {

    //propiedades
    private Publico publico;

    public void setPublico(Publico publico) {
        this.publico = publico;
    }
    
    public PublicoAdvice() {}

    public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
        publico.tomarAsiento();
    }

    public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
       publico.aplaudir();
    }
    public void afterThrowing(Throwable throable){
        publico.solicitarDevolucionEntrada();
    }

}
