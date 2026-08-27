import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimentacao {
    private String tipo;
    private LocalDateTime data;
    private String detalhes;

    public Movimentacao(String tipo, String detalhes) {
        this.tipo = tipo;
        this.detalhes = detalhes;
        this.data = LocalDateTime.now();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {

        this.tipo = tipo;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.getTipo() + " | " + this.data.format(formato) + " | " + this.getDetalhes();
    }
}