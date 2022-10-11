package builder;

import java.util.Date;

public class LivroBuilder {
    private Livro livro;

    public LivroBuilder() {
        livro = new Livro();
    }

    public Livro build() {
        if (livro.getCodigoLivro() <= 0) {
            throw new IllegalArgumentException("Código inválido");
        }
        if (livro.getNomeLivro().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return livro;
    }

    public LivroBuilder setCodigoLivro(int codigo) {
        livro.setCodigoLivro(codigo);
        return this;
    }

    public LivroBuilder setNome(String nome) {
        livro.setNomeLivro(nome);
        return this;
    }

    public LivroBuilder setdataPublicacao(Date dataPublicacao) {
        livro.setDataPublicacao(dataPublicacao);
        return this;
    }


    public LivroBuilder setPreco(float preco) {
        livro.setPreco(preco);
        return this;
    }

    public LivroBuilder setDescricao(String descricao) {
        livro.setDescricao(descricao);
        return this;
    }

    public LivroBuilder setGenero(String genero) {
        livro.setGenero(genero);
        return this;
    }

    public LivroBuilder setAutor(String autor) {
        livro.setAutor(autor);
        return this;
    }

    public LivroBuilder setIdioma(String idioma) {
        livro.setIdioma(idioma);
        return this;
    }

    public LivroBuilder setEditora(String editora) {
        livro.setEditora(editora);
        return this;
    }

    public LivroBuilder setFormato(String formato) {
        livro.setFormato(formato);
        return this;
    }

    public LivroBuilder setPaginas(int  paginas) {
        livro.setPaginas(paginas);
        return this;
    }
}
