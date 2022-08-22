package com.example.clase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
public class ControllerConverter {
	
	@Value("${app.tmr}")
	private double tmr;
	
	@GetMapping("/cop/{dolar}")
	public Money cop(@PathVariable int dolar) {
		return new Money(tmr*dolar, dolar);
	}
	
	@GetMapping("/dolar/{pesos}")
	public Money dolar(@PathVariable int pesos) {
		return new Money(pesos, pesos/tmr);
	}
}
