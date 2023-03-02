package com.devsuperior.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.services.PaymentService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {
	
	private static final String PAYMENT_FALLBACK = "paymentFallback";
	
	@Autowired
	private PaymentService service;
	
	@GetMapping(value = "/{workerId}/days/{days}")
	@CircuitBreaker(name = PAYMENT_FALLBACK, fallbackMethod = "getPaymentAlternative") // caso aconteca alguma falha nesse endpoint
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
		Payment payment = service.getPayment(workerId, days);
		return ResponseEntity.ok(payment);
	}
	
	// vai chamar esse metodo
	public ResponseEntity<Payment> getPaymentAlternative(Long workerId, Integer dias, Throwable t) {
		Payment payment = new Payment("Bran", 400.0, dias); // mock data
		return ResponseEntity.ok(payment); // que retornara esse dado mockado
	}

}
