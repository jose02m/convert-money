package com.example.clase;

public class Money {
	private double pesos;
	private double dolar;

	public Money(double pesos, double dolar) {
		this.pesos = pesos;
		this.dolar = dolar;
	}

	public double getPesos() {
		return pesos;
	}

	public void setPesos(double pesos) {
		this.pesos = pesos;
	}

	public double getDolar() {
		return dolar;
	}

	public void setDolar(double dolar) {
		this.dolar = dolar;
	}

}
