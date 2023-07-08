package team.stalwarts.sharon.service;


import team.stalwarts.sharon.model.Payment;

import java.util.List;

public interface PaymentService 
{
    public Payment savePayment(Payment payment);
    public List<Payment> getAllPayments();
}
