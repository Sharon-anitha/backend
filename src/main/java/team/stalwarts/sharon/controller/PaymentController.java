package team.stalwarts.sharon.controller;

import team.stalwarts.sharon.model.Payment;
import team.stalwarts.sharon.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/save")
    public String save(@RequestBody Payment payment){
        paymentService.savePayment(payment);
        return "New Payment is added";
    }

    @GetMapping("/getAll")
    public List<Payment> list(){
        return paymentService.getAllPayments();
    }
}
