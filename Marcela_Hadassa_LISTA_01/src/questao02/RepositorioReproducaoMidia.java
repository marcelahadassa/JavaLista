package questao02;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class RepositorioReproducaoMidia {
	private ArrayList<ReproducaoMidia> reproducao;

	public void repositorioReproducaoMidia() {
		reproducao = new ArrayList<>();
	}
	

	protected ArrayList<ReproducaoMidia> getReproducao() {
		return reproducao;
	}



	protected void setReproducao(ArrayList<ReproducaoMidia> reproducao) {
		this.reproducao = reproducao;
	}



	public void cadastrarReproducaoMidia(ReproducaoMidia rm) {
		if (rm != null) {
			reproducao.add(rm);
			System.out.println("Reproducao de midia foi cadastrada.");
		} else {
			System.out.println("O cadastro nao pode ser nulo.");
		}
	}

	public ArrayList<ReproducaoMidia> listarReproducoesNoPeriodo(LocalDateTime inicio, LocalDateTime fim) {
		ArrayList<ReproducaoMidia> reproducoesNoPeriodo = new ArrayList<>();
		for(ReproducaoMidia listaPeriodo : reproducao) {
			if (listaPeriodo.getdataHoraReproducao().isAfter(inicio) || listaPeriodo.getdataHoraReproducao().isBefore(fim)) {
				reproducoesNoPeriodo.add(listaPeriodo);
		}
	  }
		return reproducoesNoPeriodo;
	}
	public ArrayList<ReproducaoMidia> listarReproducoesPorUsuario(Consumidor usuario) {
		ArrayList<ReproducaoMidia> reproducoesPorUsuario = new ArrayList<>();
		for (ReproducaoMidia listaUsuario : reproducao) {
			if (listaUsuario.getConsumidor().equals(usuario)) {
				reproducoesPorUsuario.add(listaUsuario);
			}
		}
		return reproducoesPorUsuario;
	}

	public ArrayList<ReproducaoMidia> listarReproducoesPorCategorias(String categorias) {
		ArrayList<ReproducaoMidia> reproducoesPorCategorias = new ArrayList<>();
		for (ReproducaoMidia listaPorCategoria : reproducao) {
			if (listaPorCategoria.getMidia().getCategoria().contains(categorias)) {
				reproducoesPorCategorias.add(listaPorCategoria);
			}
		}
		return reproducoesPorCategorias;
	}


	@Override
	public String toString() {
		return "RepositorioReproducaoMidia [reproducao = " + reproducao + "]";
	}
	
	
}
