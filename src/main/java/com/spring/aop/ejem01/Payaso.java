package com.spring.aop.ejem01;

public class Payaso implements Representable{

	
	private String nombre;
	private boolean tieneNariz;
	
	@Override
	public void actuar() throws ActuacionException {
		System.out.println("Hago reir.....");
	}

	public void caerse() {
		
	}

}
