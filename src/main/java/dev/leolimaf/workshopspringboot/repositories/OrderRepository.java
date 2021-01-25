package dev.leolimaf.workshopspringboot.repositories;

import dev.leolimaf.workshopspringboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
