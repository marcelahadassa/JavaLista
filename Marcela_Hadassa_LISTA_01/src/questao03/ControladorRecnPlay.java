package questao03;

import java.util.ArrayList;

public class ControladorRecnPlay {
	private IRepositorioPessoa repositorioPessoa;
	private IRepositorioPalestra repositorioPalestra;

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

	public void controladorMidia(IRepositorioPessoa repositorioPessoa, IRepositorioPalestra repositorioPalestra) {
		this.repositorioPessoa = repositorioPessoa;
		this.repositorioPalestra = repositorioPalestra;
	}

	protected IRepositorioPessoa getRepositorioPessoa() {
		return repositorioPessoa;
	}

	protected IRepositorioPalestra getRepositorioPalestra() {
		return repositorioPalestra;
	}

	public void realizarInscricao(Participante p) {
		if (p != null) {
			if (p instanceof Participante) {
				Participante trilha = (Participante) p;
				if (trilha.getTrilhaDeInteresse() != null && !trilha.getTrilhaDeInteresse().isBlank()) {
					if (p.getTrilhaDeInteresse().equals("Tecnologias")
							|| p.getTrilhaDeInteresse().equals("Economia_Criativa")
							|| p.getTrilhaDeInteresse().equals("Cidades")) {
						repositorioPessoa.inserirPessoa(p);
					}

				}
			}

		}
	}

	public void cadastrarPalestra (Palestra palestra) {
		if(palestra != null && palestra.getDataHora() != null && !palestra.getDescricao().isBlank() && palestra.getId() != 0  && !palestra.getLocal().isBlank() && palestra.getPalestrante() != null && !palestra.getTitulo().isBlank() && !palestra.getTrilha().isBlank()) {
		
				if(palestra.getPalestrante().getEmpresa() != null) {
					repositorioPessoa.inserirPessoa(palestra.getPalestrante());
				}
			
			boolean testeTitulo = false;
			for (Palestra cadPalestra: this.getRepositorioPalestra().getListaPalestra()) {
				if (palestra.getTitulo().equals(cadPalestra.getTitulo())) {
					testeTitulo = true;
				}
			}
			
				if(testeTitulo == false) {
				repositorioPalestra.inserirPalestra(palestra);
			}
			
		}
			boolean testeDataHora = false;
			for(Palestra dataHora : this.getRepositorioPalestra().getListaPalestra())
				if(palestra.getDataHora() == dataHora.getDataHora()){
					testeDataHora = true;
				}
			if(testeDataHora == false) {
				repositorioPalestra.inserirPalestra(palestra);
			}
			
			boolean testeLocal = false;
			for(Palestra local : this.getRepositorioPalestra().getListaPalestra())
				if(palestra.getLocal().equals(local.getLocal())) {
					repositorioPalestra.inserirPalestra(palestra);
				}
				
	}

	public void avaliarPalestra(Avaliacao aval) {
		if (!(aval.getAvaliador() != null) && !(aval.getPalestra() != null)) {
			System.out.println("Avaliador e palestra nao constam no sistema.");
		}

		if (aval.getNota() < 0 || aval.getNota() > 5) {
			System.out.println("A nota deve estar entre 0 e 5.");
		}
	}
	
	public ArrayList<Palestra> listarPalestrasMaisBemAvaliadas() {
		
		double maiorMedia = 0;
		ArrayList<Palestra> palestrasAvaliadas = new ArrayList<>();
		for (Palestra palestra : this.getRepositorioPalestra().listarPalestras()) {
																	
			double media = palestra.calcularMediaAvaliacoes();
			if (media > maiorMedia) {
				maiorMedia = media;
			
			} 
			if (media == maiorMedia) {
				palestrasAvaliadas.add(palestra);
			}
		
		}
		return palestrasAvaliadas;
	}

	public int listarTotalPalestrasComMediaAvaliacaoMaiorQue (int nota) {
		ArrayList<Palestra> avaliacaoMaior = new ArrayList<>();
		for(Palestra listarPalestra : this.getRepositorioPalestra().getListaPalestra()) {
			if(listarPalestra.calcularMediaAvaliacoes() > nota) {
				avaliacaoMaior.add(listarPalestra);
			}
		}
		return avaliacaoMaior.size();
	}

	public ArrayList<Palestrante> listarPalestrantesDaEmpresa(String empresa) {
		return repositorioPessoa.listarPalestrantesDaEmpresa(empresa);
	}

	public ArrayList<Participante> listarParticipantesComInteresseEm(String trilha) {
		return repositorioPessoa.listarParticipantesComInteresseEm(trilha);
	}

	public ArrayList<Participante> listarParticipantesComIdadeMaiorQue(int idade) {
		return repositorioPessoa.listarParticipantesComIdadeMaiorQue(idade);
	}

	public ArrayList<Palestra> listarPalestras() {
		return repositorioPalestra.listarPalestras();
	}

	public ArrayList<Palestra> listarPalestrasComMediaAvaliacaoIgualOuMaiorQue(int nota) {
		return repositorioPalestra.listarPalestrasComMediaAvaliacaoIgualOuMaiorQue(nota);
	}

	public ArrayList<Avaliacao> listarTodasAvaliacoes() {
		return repositorioPalestra.listarTodasAvaliacoes();
	}
	
	
	
	
	
	
	
	
	
}
