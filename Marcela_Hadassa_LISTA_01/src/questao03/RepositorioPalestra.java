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

	public Palestra buscarPalestraPorId(int id) {
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

	public Palestra buscarPalestraPorLocalEHorario(String local, LocalDateTime horario) {
		for (Palestra palestraLocalEHorario : listaPalestra) {
			if (palestraLocalEHorario.getLocal().equals(local) && palestraLocalEHorario.getDataHora().equals(horario)) {
				return palestraLocalEHorario;
			}
		}
		return null;
	}
	
	
	

//	public ArrayList<Palestra> listaPalestrasComMediaAvaliacaoIgualOuMaiorQue(int nota) {
//		for (Palestra avaliacaoIgualOuMaior : listaPalestra) {
//			if(avaliacaoIgualOuMaior>= nota) {
//				avaliacaoIgualOuMaior.add(avaliacaoIgualOuMaior);
//			}
//		}
//		return avaliacaoIgualOuMaior;
//		
//	}
//	
//	
//	public ArrayList<Palestra> listarTodasAvaliacoes() {
//		return null;
//	}
}

