package questao03;
import java.time.LocalDate;

public abstract class Pessoa {
	private Long codigo;
	private String email;
	private String nome;
	private LocalDate dataNascimento;
	private String cidade;
	
	protected Pessoa(Long codigo, String email, String nome, LocalDate dataNascimento, String cidade) {
		this.codigo = codigo;
		this.email= email;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cidade = cidade;
	}

	protected Long getCodigo() {
		return codigo;
	}

	protected void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected LocalDate getDataNascimento() {
		return dataNascimento;
	}

	protected void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	protected String getCidade() {
		return cidade;
	}

	protected void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
}
