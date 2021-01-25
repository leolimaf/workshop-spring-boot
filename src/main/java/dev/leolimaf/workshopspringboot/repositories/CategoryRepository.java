package dev.leolimaf.workshopspringboot.repositories;

import dev.leolimaf.workshopspringboot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {



}
