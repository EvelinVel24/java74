package src.test.java.com.example.curriculum;

import com.example.curriculum.model.Curriculum;
import com.example.curriculum.service.CurriculumService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CurriculumApplicationTests {

    @Autowired
    private CurriculumService curriculumService;

    @Test
    void contextLoads() {
        // Verifica que el contexto de Spring cargue correctamente
        assertThat(curriculumService).isNotNull();
    }

    @Test
    void testSaveCurriculum() {
        // Crea un objeto Curriculum
        Curriculum curriculum = new Curriculum();
        curriculum.setNombre("Juan");
        curriculum.setApellido("Pérez");
        curriculum.setFecha("1990-01-01");
        curriculum.setEdad(34);
        curriculum.setEmail("juan.perez@example.com");
        curriculum.setNumero("123456789");

        // Guarda el Curriculum
        Curriculum savedCurriculum = curriculumService.save(curriculum);

        // Verifica que se haya guardado correctamente
        assertThat(savedCurriculum).isNotNull();
        assertThat(savedCurriculum.getId()).isNotNull();
        assertThat(savedCurriculum.getNombre()).isEqualTo("Juan");
    }

    @Test
    void testFindAllCurriculums() {
        // Busca todos los curriculums
        List<Curriculum> curriculums = curriculumService.findAll();

        // Verifica que la lista no esté vacía
        assertThat(curriculums).isNotEmpty();
    }
}
