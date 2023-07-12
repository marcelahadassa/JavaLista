package questao03;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class RepositorioPalestra implements IRepositorioPalestra {
	private ArrayList<Palestra> listaPalestra = new ArrayList<>();

	public RepositorioPalestra() {
	}

	@Override
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

	@Override
	public Palestra buscarPalestraPorId(int id) {
		for (Palestra palestraId : listaPalestra) {
			if (palestraId.getId() == id) {
				return palestraId;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Palestra> listarPalestras() {
		return listaPalestra;
	}

	@Override
	public Palestra buscarPalestraPorLocalEHorario(String local, LocalDateTime horario) {
		for (Palestra palestraLocalEHorario : listaPalestra) {
			if (palestraLocalEHorario.getLocal().equals(local) && palestraLocalEHorario.getDataHora().equals(horario)) {
				return palestraLocalEHorario;
			}
		}
		return null;
	}
	
	@Override
	public ArrayList<Palestra> listarPalestrasComMediaAvaliacaoIgualOuMaiorQue(int nota) {
		ArrayList<Palestra> avaliacaoIgualOuMaior = new ArrayList<>();
		for (Palestra palestraAvalia: listaPalestra) {
			if(palestraAvalia.calcularMediaAvaliacoes()>= nota) {
				avaliacaoIgualOuMaior.add(palestraAvalia);
			}
		}
		return avaliacaoIgualOuMaior;
		
	}
	

	@Override
	public ArrayList<Avaliacao> listarTodasAvaliacoes() {
		ArrayList<Avaliacao> todasAvaliacoes = new ArrayList<>();
			for(Palestra palestra : listaPalestra) {
				todasAvaliacoes.addAll(palestra.getAvaliacoes());
			}
		return todasAvaliacoes;
	}

	@Override
	public ArrayList<Palestra> getListaPalestra() {
		return listaPalestra;
	}

	protected void setListaPalestra(ArrayList<Palestra> listaPalestra) {
		this.listaPalestra = listaPalestra;
	}

	@Override
	public String toString() {
		return "RepositorioPalestra [listaPalestra =" + listaPalestra + "]";
	}
	
	
	
}

