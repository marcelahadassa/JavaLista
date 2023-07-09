package questao02;
import java.util.ArrayList;
import java.time.LocalDate;


public class RepositorioUsuario {
	 private ArrayList<Usuario> lista;
	 
	 public RepositorioUsuario() {
		 lista = new ArrayList<>();
	 }
	
	protected ArrayList<Usuario> getLista() {
		return lista;
	}

	protected void setLista(ArrayList<Usuario> lista) {
		this.lista = lista;
	}

	public void cadastrarUsuario(Usuario u) {
		boolean testeEmail = false;
		for (Usuario usuario : lista) {
			if(usuario.getEmail() == u.getEmail()) {
				testeEmail = true;
			}
		}
		if (testeEmail == false) {
			lista.add(u);
		}
		else {
			System.out.println("Nao e possivel cadastrar, pois esse email ja esta sendo utilizado por outro usuario.");
		}
	} 
	
	
	public void removerUsuario(Usuario u) {
			lista.remove(u);
		
	}
	public ArrayList<Usuario> listarUsuariosComIdadeAcimaDe(int idade) {
		ArrayList<Usuario> usuariosAcimaDaIdade  = new ArrayList<>();
		for (Usuario usuario : lista) {
			if (LocalDate.now().getYear() - usuario.getdataNascimento().getYear() > idade) {
				usuariosAcimaDaIdade.add(usuario);
			}
		}
		
		return usuariosAcimaDaIdade;
	}
	
	public ArrayList<Usuario> listarUsuariosPorTipo(@SuppressWarnings("rawtypes") Class tipo) {
		ArrayList<Usuario> usuariosPorTipo = new ArrayList<>();
		for (Usuario usuario : lista) {
			if (usuario.getClass() == tipo) {
				usuariosPorTipo.add(usuario);
			}
		}
		return usuariosPorTipo;
	} 
	
	
}
