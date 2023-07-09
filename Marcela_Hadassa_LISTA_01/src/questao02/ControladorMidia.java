package questao02;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class ControladorMidia {
	private RepositorioUsuario repositorioUsuario;
	private RepositorioMidia repositorioMidia;
	private RepositorioReproducaoMidia repositorioReproducaoMidia;
	
	private static ControladorMidia instance;
	
	private ControladorMidia() {
	    this.repositorioUsuario = new RepositorioUsuario();
	    this.repositorioMidia = new RepositorioMidia();
	    this.repositorioReproducaoMidia = new RepositorioReproducaoMidia();
	}
	
	public static ControladorMidia getInstance() {
		if (instance == null) {
			instance = new ControladorMidia();
		}
		return instance;
	}

	public void controladorMidia(RepositorioUsuario repositorioUsuario, RepositorioMidia repositorioMidia, RepositorioReproducaoMidia repositorioReproducaoMidia) {
		this.repositorioUsuario = repositorioUsuario;
		this.repositorioMidia = repositorioMidia;
		this.repositorioReproducaoMidia = repositorioReproducaoMidia;
	}
	
	protected void cadastrarUsuario(Usuario u) {
		if (u != null) {
			if (u instanceof Produtor) {
			   Produtor produtor = (Produtor) u;
			    if (produtor.getCategorias() != null) {
			    	repositorioUsuario.getLista().add(u);
			    }
	    }
			else {
				repositorioUsuario.getLista().add(u);
			}
		}
		
	}

	protected void removerUsuario(Usuario u) {
		if (u != null) {
			repositorioUsuario.getLista().remove(u);
		}
		else {
			System.out.println("Nao e possivel remover um usuario nulo.");
		}
	}
	
	//protected void cadastrarMidia(Midia m) {
	    //if (m != null && m.getProdutor() != null && !m.getProdutor().getCategorias().isEmpty()) {
	       // if (m.getProdutor().getCategorias().contains(m.getCategoria())) {
	            //repositorioMidia.cadastrarMidia(m);
	        //}
	    //}
	//}

	
	protected void cadastrarMidia(Midia m) {
		if (m != null) {
				if (m.getProdutor().getCategorias().contains(m.getCategoria())) {
					repositorioMidia.getMidia().add(m);
				}
			}
		}
	
	protected void removerMidia(Midia m) {
		if (m != null) {
			repositorioMidia.getMidia().remove(m);
		}
	}
	
	protected void reproduzirMidia(Consumidor consumidor, Midia midia) {
		if (consumidor.getEmail() != null && midia.getArquivo() != null) {
			
			if(LocalDate.now().getYear() - consumidor.getdataNascimento().getYear() >= midia.getfaixaEtariaMinima()) {
				ReproducaoMidia reproducao = new ReproducaoMidia(midia, consumidor, LocalDateTime.now());
				repositorioReproducaoMidia.getReproducao().add(reproducao);
			}
		}
		
	}

	public ArrayList<Usuario> listarUsuariosComIdadeAcimaDe(int idade) {
		return repositorioUsuario.listarUsuariosComIdadeAcimaDe(idade);
	}

	public ArrayList<Usuario> listarUsuariosPorTipo(@SuppressWarnings("rawtypes")Class tipo) {
		return repositorioUsuario.listarUsuariosPorTipo(tipo);
	}

	public ArrayList<Midia> listarMidiaPorFaixaEtaria(int faixaEtaria) {
		return repositorioMidia.listarMidiaPorFaixaEtaria(faixaEtaria);
	}

	public ArrayList<Midia> listarMidiasPorCategoria(String categoria) {
		return repositorioMidia.listarMidiasPorCategoria(categoria);
	}

	public ArrayList<ReproducaoMidia> listarReproducoesNoPeriodo(LocalDateTime inicio, LocalDateTime fim) {
		return repositorioReproducaoMidia.listarReproducoesNoPeriodo(inicio, fim);
	}

	public ArrayList<ReproducaoMidia> listarReproducoesPorUsuario(Consumidor usuario) {
		return repositorioReproducaoMidia.listarReproducoesPorUsuario(usuario);
	}

	public ArrayList<ReproducaoMidia> listarReproducoesPorCategorias(String categorias) {
		return repositorioReproducaoMidia.listarReproducoesPorCategorias(categorias);
	}

	protected RepositorioUsuario getRepositorioUsuario() {
		return repositorioUsuario;
	}

	protected void setRepositorioUsuario(RepositorioUsuario repositorioUsuario) {
		this.repositorioUsuario = repositorioUsuario;
	}

	protected RepositorioMidia getRepositorioMidia() {
		return repositorioMidia;
	}

	protected void setRepositorioMidia(RepositorioMidia repositorioMidia) {
		this.repositorioMidia = repositorioMidia;
	}

	protected RepositorioReproducaoMidia getRepositorioReproducaoMidia() {
		return repositorioReproducaoMidia;
	}

	protected void setRepositorioReproducaoMidia(RepositorioReproducaoMidia repositorioReproducaoMidia) {
		this.repositorioReproducaoMidia = repositorioReproducaoMidia;
	}
	
	
	
	
	
}




