public class Libro {
    // att
    private String titulo;
    private String autor;
    private String isbn;

    // constructor
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    // getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    public String getIsbn() {
        return isbn;
    }

    // setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
