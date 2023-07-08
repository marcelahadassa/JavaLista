package questao02;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class RepositorioReproducaoMidia {
	private ArrayList<ReproducaoMidia> reproducao;

	public void repositorioReproducaoMidia() {
		reproducao = new ArrayList<>();
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
		for(ReproducaoMidia novaReproducao : reproducao) {
			if (LocalDateTime.now().getYear() - novaReproducao.getdataHoraReproducao().getYear() >= inicio.getYear() && LocalDateTime.now().getYear() - novaReproducao.getdataHoraReproducao().getYear() <= fim.getYear()) {
				reproducoesNoPeriodo.add(novaReproducao);
		}
	  }
		return reproducoesNoPeriodo;
	}
	public ArrayList<ReproducaoMidia> listarReproducoesPorUsuario(Consumidor usuario) {
		ArrayList<ReproducaoMidia> reproducoesPorUsuario = new ArrayList<>();
		for (ReproducaoMidia novaReproducao : reproducao) {
			if (novaReproducao.getConsumidor().equals(usuario)) {
				reproducoesPorUsuario.add(novaReproducao);
			}
		}
		return reproducoesPorUsuario;
	}

	public ArrayList<ReproducaoMidia> listarReproducoesPorCategorias(String categorias) {
		ArrayList<ReproducaoMidia> reproducoesPorCategorias = new ArrayList<>();
		for (ReproducaoMidia novaReproducao : reproducao) {
			if (novaReproducao.getMidia().getCategoria().contains(categorias)) {
				reproducoesPorCategorias.add(novaReproducao);
			}
		}
		return reproducoesPorCategorias;
	}
}
