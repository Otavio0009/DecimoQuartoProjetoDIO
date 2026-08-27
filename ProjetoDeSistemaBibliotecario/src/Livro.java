import java.time.LocalDateTime;
import java.util.ArrayList;

public class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private String status;
    private ArrayList<Movimentacao> historico;

    public Livro(int codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.status = "Disponivel";
        this.historico = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public ArrayList<Movimentacao> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<Movimentacao> historico) {
        this.historico = historico;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void emprestar(String cliente) {
        this.setStatus("Emprestado");
        Movimentacao m = new Movimentacao("Emprestado", "Livros: " + this.titulo + " -Usuário: " + cliente);
        this.historico.add(m);
        System.out.println("Livro emprestado em: " + LocalDateTime.now());

    }

    public void devolucao(String cliente) {
        this.setStatus("Disponivel");
        Movimentacao m = new Movimentacao("Devolvido", "Livros: " + this.titulo + " -Usuario: " + cliente);
        this.historico.add(m);
        System.out.println("Livro devolvido em: " + LocalDateTime.now());
    }

    public void reservado(String cliente) {
        this.setStatus("Reservado");
        Movimentacao m = new Movimentacao("Reservado", "Livros: " + this.titulo + " -Usuario: " + cliente);
        this.historico.add(m);
        System.out.println("Livro reservado em: " + LocalDateTime.now());
    }

    public void resumo() {
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Status: " + this.getStatus());

        System.out.println();

        System.out.println("Historico de Movimentação:");

        System.out.println();

        for (Movimentacao registro : this.historico) {
            System.out.println(registro);
        }
    }
}
