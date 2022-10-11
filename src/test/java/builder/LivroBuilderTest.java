package builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class LivroBuilderTest {

    @Test
    void deveRetornarExcecaoParaLivroSemCodigo() {
        try {
            LivroBuilder livroBuilder = new LivroBuilder();
            Livro livro = livroBuilder
                    .setNome("Crepusculo")
                    .setCodigoLivro(0)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaLivroSemNome() {
        try {
            LivroBuilder livroBuilder = new LivroBuilder();
            Livro livro = livroBuilder
                    .setCodigoLivro(42069)
                    .setNome("")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarLivroValido() {
        LivroBuilder livroBuilder = new LivroBuilder();
        Livro livro = livroBuilder
                .setCodigoLivro(42069)
                .setNome("Crepusculo")
                .build();
        assertNotNull(livro);
    }

}