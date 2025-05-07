package br.dev.eduardo.temperatura.model;

public class Temperatura {
	
	private double celsius;
	
	//Funcoes para obter o resultado do celsius inserido pelo usuario
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	public double getCelsius() {
		return celsius;
	}
	
	//Funcoes para o a conversao da temperatura inserida
	public double converterParaKelvin() {
		double kelvin = celsius + 273.15;
		return kelvin;
	}
	
	public double converterParaFahreinheit() {
		double fahreinheit = (celsius * 1.8) + 32;
		return fahreinheit;
	}
	
	//Funcao para testar as formulas no terminal
	public void mostrarConversão() {
		System.out.println("Fahreinheit = " + converterParaFahreinheit());
		System.out.println("Kelvin = " + converterParaKelvin());
	}
	
	
	
}
