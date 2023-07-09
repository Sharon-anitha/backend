package team.stalwarts.sharon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import team.stalwarts.sharon.model.TicketSales;

public interface TicketSalesRepository extends JpaRepository<TicketSales,Long>
{

}
