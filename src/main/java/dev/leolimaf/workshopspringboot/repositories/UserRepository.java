package dev.leolimaf.workshopspringboot.repositories;

import dev.leolimaf.workshopspringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
