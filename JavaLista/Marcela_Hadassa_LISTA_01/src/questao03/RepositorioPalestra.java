package questao03;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class RepositorioPalestra {
	private ArrayList<Palestra> listaPalestra = new ArrayList<>();

	public RepositorioPalestra() {
	}

	public void inserirPalestra(Palestra p) {
		boolean testeId = false;
		for (Palestra palestra : listaPalestra) {
			if (palestra.getId() == p.getId()) {
				testeId = true;
			}
		}
		if (testeId == false) {
			listaPalestra.add(p);
		} else {
			System.out.println("Nao e possivel salvar essa palestra, pois esse id ja esta cadastrado em outra.");
		}
	}

	public IRepositorioPessoa buscarPalestraPorId(int id) {
		for (Palestra palestraId : listaPalestra) {
			if (palestraId.getId() == id) {
				return palestraId;
			}
		}
		return null;
	}

	public ArrayList<Palestra> listarPalestras() {
		return listaPalestra;
	}

	public IRepositorioPessoa buscarPalestraPorLocalEHorario(String local, LocalDateTime horario) {
		for (Palestra palestraLocalEHorario : listaPalestra) {
			if (palestraLocalEHorario.getLocal().equals(local) && palestraLocalEHorario.getDataHora().equals(horario)) {
				return palestraLocalEHorario;
			}
		}
		return null;
	}
	
	
	

	public ArrayList<Palestra> listaPalestrasComMediaAvaliacaoIgualOuMaiorQue(int nota) {
		ArrayList<Palestra> avaliacaoIgualOuMaior = new ArrayList<>();
		for (Palestra p: listaPalestra) {
			if(p.calcularMediaAvaliacoes()>= nota) {
				avaliacaoIgualOuMaior.add(p);
			}
		}
		return avaliacaoIgualOuMaior;
		
	}
	

	public ArrayList<Avaliacao> listarTodasAvaliacoes() {
		ArrayList<Avaliacao> todasAvaliacoes = new ArrayList<>();
			for(Palestra pal : listaPalestra) {
				todasAvaliacoes.addAll(pal.getAvaliacoes());
			}
		return todasAvaliacoes;
	}

	public ArrayList<Palestra> getListaPalestra() {
		return listaPalestra;
	}
	
	
}

