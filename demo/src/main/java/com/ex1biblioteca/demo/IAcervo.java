package com.ex1biblioteca.demo;

/**
 * IAcervo
 */
public interface IAcervo {

    List<Livro> getAll();
    List<String> getTitulos();
    List<String> getAutores();
    List<Livro> getLivrosDoAutor(String autor);
    Livro getLivroTitulo(String titulo);
    boolean cadastraLivroNovo(Livro livro);
    boolean removeLivro(long codigo);

}