package questao02;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface IRepositorioReproducaoMidia {

	void repositorioReproducaoMidia();

	void cadastrarReproducaoMidia(ReproducaoMidia rm);

	ArrayList<ReproducaoMidia> listarReproducoesNoPeriodo(LocalDateTime inicio, LocalDateTime fim);

	ArrayList<ReproducaoMidia> listarReproducoesPorUsuario(Consumidor usuario);

	ArrayList<ReproducaoMidia> listarReproducoesPorCategorias(String categorias);
	
}