package src.main.java.com.example.curriculum.service;

import java.util.List;
import com.example.curriculum.model.Curriculum;

public interface CurriculumService {
    Curriculum save(Curriculum curriculum);
    List<Curriculum> findAll();
}
