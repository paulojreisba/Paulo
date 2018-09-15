package br.com.inicio;

import br.com.senai.Computador;

public class TestaComputador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computador c = new Computador ("200", "teste", "teste2");
		
		br.com.aula.Computador comp= new br.com.aula.Computador();
		
		System.out.println(comp.retorno());
	}

}
