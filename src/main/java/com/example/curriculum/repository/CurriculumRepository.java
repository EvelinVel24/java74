package src.main.java.com.example.curriculum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.curriculum.model.Curriculum;

public interface CurriculumRepository extends JpaRepository<Curriculum, Long> {
}
