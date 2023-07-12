package questao03;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface IRepositorioPalestra {

	void inserirPalestra(Palestra p);

	Palestra buscarPalestraPorId(int id);

	ArrayList<Palestra> listarPalestras();

	Palestra buscarPalestraPorLocalEHorario(String local, LocalDateTime horario);

	ArrayList<Palestra> listarPalestrasComMediaAvaliacaoIgualOuMaiorQue(int nota);

	ArrayList<Avaliacao> listarTodasAvaliacoes();

	ArrayList<Palestra> getListaPalestra();

}