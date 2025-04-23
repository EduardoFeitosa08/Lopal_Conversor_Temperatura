package br.dev.eduardo.temperatura;

import br.dev.eduardo.temperatura.gui.TelaConversor;
import br.dev.eduardo.temperatura.model.Temperatura;

public class TemperaturaApp {

	public static void main(String[] args) {
	
		Temperatura t1 = new Temperatura();
		t1.setCelsius(10);
		t1.mostrarConversão();
		
		TelaConversor tela = new TelaConversor();
		tela.criarTelaConversor();

	}

}
