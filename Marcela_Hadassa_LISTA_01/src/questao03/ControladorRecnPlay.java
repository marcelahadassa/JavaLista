package questao03;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ControladorRecnPlay {
	private RepositorioPessoa repositorioPessoa;
	private RepositorioPalestra repositorioPalestra;
	
private static ControladorRecnPlay instance;
	
	private ControladorRecnPlay() {
	    this.repositorioPessoa = new RepositorioPessoa();
	    this.repositorioPalestra = new RepositorioPalestra();
	}
	
	public static ControladorRecnPlay getInstance() {
		if (instance == null) {
			instance = new ControladorRecnPlay();
		}
		return instance;
	}
	
	public void controladorMidia(RepositorioPessoa repositorioPessoa, RepositorioPalestra repositorioPalestra) {
		this.repositorioPessoa = repositorioPessoa;
		this.repositorioPalestra = repositorioPalestra;
	}
	
	//fazer o delegate dps
	
	public void realizarInscricao(Participante p) {
		if (p != null) {
			if (p instanceof Participante) {
			   Participante trilha = (Participante) p;
			    if (trilha.getTrilhaDeInteresse() != null || trilha.getTrilhaDeInteresse().isEmpty()) {
			    	repositorioPessoa.inserirPessoa(p);
			    }
			}
			else {
				repositorioPessoa.inserirPessoa(p);;
			}
		}
	}
	
	
	
	
	
	
	
	
	
}
