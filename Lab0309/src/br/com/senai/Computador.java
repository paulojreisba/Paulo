package br.com.senai;

public class Computador {
	String memoria;
	String cpu;
	String fabricante;
	public Computador (String memoria, String cpu, String fabricante) {
		this.memoria = memoria;
		this.cpu = cpu;
		this.fabricante = fabricante;
		
	}
	
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

}
