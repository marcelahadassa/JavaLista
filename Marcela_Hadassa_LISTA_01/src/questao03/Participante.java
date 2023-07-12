package questao03;
import java.time.LocalDate;

public class Participante extends Pessoa {
	private String trilhaDeInteresse;
	
	protected Participante (String trilhaDeInteresse, Long codigo, String email, String nome, LocalDate dataNascimento, String cidade) {
		super(codigo, email, nome, dataNascimento, cidade);
		this.trilhaDeInteresse = trilhaDeInteresse;
	}

	protected String getTrilhaDeInteresse() {
		return trilhaDeInteresse;
	}

	protected void setTrilhaDeInteresse(String trilhaDeInteresse) {
		this.trilhaDeInteresse = trilhaDeInteresse;
	}

	@Override
	public String toString() {
		return "Participante [trilhaDeInteresse: " + trilhaDeInteresse + "]";
	}
	
	
	
}
