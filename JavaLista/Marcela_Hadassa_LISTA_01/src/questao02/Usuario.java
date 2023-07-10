package questao02;
import java.time.LocalDate;

	public abstract class Usuario { 
	private String nomeCompleto;
	private LocalDate dataNascimento;
	private String email;
	
	protected Usuario(String nomeCompleto, LocalDate dataNascimento, String email) {
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.email = email;
	}
	
	protected String getnomeCompleto() {
		return this.nomeCompleto;
	}
	
	protected void setnomeCompleto(String nomeCompleto) {
		 this.nomeCompleto = nomeCompleto;
	}
	
	protected LocalDate getdataNascimento() {
		return this.dataNascimento;
	}
	
	protected void setdataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	protected String getEmail() {
		return this.email;
	}
	
	protected void setEmail(String email) {
		this.email = email;
		
	}

	@Override
	public String toString() {
		return "Usuario [nomeCompleto=" + nomeCompleto + ", dataNascimento=" + dataNascimento + ", email=" + email
				+ "]";
	}
	
}
	
