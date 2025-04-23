package br.dev.eduardo.temperatura.model;

public class Temperatura {

	private double celsius;
	
	
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	public double getCelsius() {
		return celsius;
	}
	
	public double converterParaKelvin() {
		double kelvin = celsius + 273.15;
		return kelvin;
	}
	
	public double converterParaFahreinheit() {
		double fahreinheit = (celsius * 1.8) + 32;
		return fahreinheit;
	}
	
	public void mostrarConversão() {
		System.out.println("Fahreinheit = " + converterParaFahreinheit());
		System.out.println("Kelvin = " + converterParaKelvin());
	}
	
	
	
}
