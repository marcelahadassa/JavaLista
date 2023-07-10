package questao02;

import java.util.ArrayList;

public interface IRepositorioMidia {

	void RepositororioMidia();

	void cadastrarMidia(Midia m);

	void removerMidia(Midia m);

	ArrayList<Midia> listarMidiaPorFaixaEtaria(int faixaEtaria);

	ArrayList<Midia> listarMidiasPorCategoria(String categoria);

}