package questao03;
import java.time.LocalDate;

public class Palestrante extends Pessoa {
	private String empresa;
	
	
	protected Palestrante (String empresa, Long codigo, String email, String nome, LocalDate dataNascimento, String cidade) {
		super(codigo, email, nome, dataNascimento, cidade);
		this.empresa = empresa;
	}
	
	protected String getEmpresa() {
		return this.empresa;
	}
	
	protected void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
}
