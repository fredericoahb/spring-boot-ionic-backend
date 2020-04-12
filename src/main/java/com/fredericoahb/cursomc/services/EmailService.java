package com.fredericoahb.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.fredericoahb.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
