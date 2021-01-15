package br.com.demo.forum.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.demo.forum.modelo.Curso;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@ActiveProfiles("test")
public class CursoRepositoryTests {

    private static final String CURSO_EXISTENTE = "HTML 5";
    private static final String CURSO_INEXISTENTE = "VISUAL BASIC";
    @Autowired
    private CursoRepository _repository;

    @Test
    public void dadoNomeDeUmCursoExistente_DeveBuscarDoBancoDeDados() {
        Curso curso = _repository.findByNome(CURSO_EXISTENTE);
        Assert.assertNotNull(curso);
        Assert.assertEquals(CURSO_EXISTENTE, curso.getNome());
    }

    @Test
    public void dadoNomeDeUmCursoInexistente_DeveRetornarNulo() {
        Curso curso = _repository.findByNome(CURSO_INEXISTENTE);
        Assert.assertNull(curso);
    }

}
