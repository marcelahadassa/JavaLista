package questao02;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class RepositorioReproducaoMidia implements IRepositorioReproducaoMidia {
	private ArrayList<ReproducaoMidia> listaReproducao = new ArrayList<>();

	@Override
	public void repositorioReproducaoMidia() {
	}


	@Override
	public void cadastrarReproducaoMidia(ReproducaoMidia rm) {
		if (rm != null) {
			listaReproducao.add(rm);
			System.out.println("Reproducao de midia foi cadastrada.");
		} else {
			System.out.println("O cadastro nao pode ser nulo.");
		}
	}

	@Override
	public ArrayList<ReproducaoMidia> listarReproducoesNoPeriodo(LocalDateTime inicio, LocalDateTime fim) {
		ArrayList<ReproducaoMidia> reproducoesNoPeriodo = new ArrayList<>();
		for(ReproducaoMidia listaPeriodo : listaReproducao) {
			if (listaPeriodo.getdataHoraReproducao().isAfter(inicio) && listaPeriodo.getdataHoraReproducao().isBefore(fim)) {
				reproducoesNoPeriodo.add(listaPeriodo);
		}
	  }
		return reproducoesNoPeriodo;
	}
	
	

	@Override
	public ArrayList<ReproducaoMidia> listarReproducoesPorUsuario(Consumidor usuario) {
		ArrayList<ReproducaoMidia> reproducoesPorUsuario = new ArrayList<>();
		for (ReproducaoMidia listaUsuario : listaReproducao) {
			if (listaUsuario.getConsumidor().getnomeCompleto().equals(usuario.getnomeCompleto())) {
				reproducoesPorUsuario.add(listaUsuario);
			}
		}
		return reproducoesPorUsuario;
	}

	@Override
	public ArrayList<ReproducaoMidia> listarReproducoesPorCategorias(String categorias) {
		ArrayList<ReproducaoMidia> reproducoesPorCategorias = new ArrayList<>();
		for (ReproducaoMidia listaPorCategoria : listaReproducao) {
			if (listaPorCategoria.getMidia().getCategoria() == categorias) {
				reproducoesPorCategorias.add(listaPorCategoria);
			}
		}
		return reproducoesPorCategorias;
	}

	
	@Override
	public String toString() {
		return "RepositorioReproducaoMidia [reproducao = " + listaReproducao + "]";
	}


	protected ArrayList<ReproducaoMidia> getReproducao() {
		return listaReproducao;
	}


	protected void setReproducao(ArrayList<ReproducaoMidia> reproducao) {
		this.listaReproducao = reproducao;
	}
	
	
	
}
