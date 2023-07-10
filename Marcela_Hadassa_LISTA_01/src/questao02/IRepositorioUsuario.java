package questao02;

import java.util.ArrayList;

public interface IRepositorioUsuario {

	void cadastrarUsuario(Usuario u);

	void removerUsuario(Usuario u);

	ArrayList<Usuario> listarUsuariosComIdadeAcimaDe(int idade);

	ArrayList<Usuario> listarUsuariosPorTipo(@SuppressWarnings("rawtypes")Class tipo);

}