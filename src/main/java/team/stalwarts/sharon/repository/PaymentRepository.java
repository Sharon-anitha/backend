package team.stalwarts.sharon.repository;



import  team.stalwarts.sharon.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Integer> 
{
}
