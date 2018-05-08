package com.main.tdd;

public class ControladorUsuario {
	
	private Usuario usuario;
	private Tarjeta tarjeta;
	
	public ControladorUsuario(Usuario usuario, Tarjeta tarjeta){
		this.usuario = usuario;
		this.tarjeta = tarjeta;
	}
	
	public void asociarTarjetaAUsuario(){
		usuario.setTarjeta(tarjeta);
	}

}

