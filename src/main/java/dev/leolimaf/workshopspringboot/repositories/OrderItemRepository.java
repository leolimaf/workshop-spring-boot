package dev.leolimaf.workshopspringboot.repositories;

import dev.leolimaf.workshopspringboot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {



}
