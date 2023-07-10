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

	
	// fazer o delegate dps

	public RepositorioPessoa getRepositorioPessoa() {
		return repositorioPessoa;
	}

	public RepositorioPalestra getRepositorioPalestra() {
		return repositorioPalestra;
	}

	public void realizarInscricao(Participante p) {
		if (p != null) {
			if (p instanceof Participante) {
				Participante trilha = (Participante) p;
				if (trilha.getTrilhaDeInteresse() != null && !trilha.getTrilhaDeInteresse().isEmpty()) {
					if (p.getTrilhaDeInteresse().equals("Tecnologias")
							|| p.getTrilhaDeInteresse().equals("Economia_Criativa")
							|| p.getTrilhaDeInteresse().equals("Cidades")) {
						repositorioPessoa.inserirPessoa(p);
					}

				}
			}

		}
	}
	
	//is blank
	
	public void cadastrarPalestra (Palestra p) {
		if(p != null && p.getDataHora() != null && !p.getDescricao().isEmpty() && p.getId() != 0  && !p.getLocal().isEmpty() && p.getPalestrante() != null && !p.getTitulo().isEmpty() && !p.getTrilha().isEmpty()) {
			boolean testeTitulo = false;
			for (Palestra palestra: this.getRepositorioPalestra().getListaPalestra()) {
				if (p.getTitulo().equals(palestra.getTitulo())) {
					testeTitulo=true;
				}
						
			}
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
