package questao02;
import java.util.ArrayList;

public class RepositorioMidia {
	private ArrayList<Midia> midia = new ArrayList<>();
	
	public void RepositororioMidia() {
	 }
	
	
	protected ArrayList<Midia> getMidia() {
		return midia;
	}


	protected void setMidia(ArrayList<Midia> midia) {
		this.midia = midia;
	}


	public void cadastrarMidia(Midia m) {
		boolean testeMidia = false;
		for (Midia cadastroMidia : midia) {
			if (cadastroMidia.getArquivo() == m.getArquivo()) {
				testeMidia = true;
			}
		}
		if (testeMidia != true) {
			midia.add(m);
		}
		else {
			System.out.println("nao e possivel criar, pois o nome ja esta sendo utilizado por outro arquivo.");
		}
	}
	
	public void removerMidia(Midia m) {
		midia.remove(m);
	}
	
	public ArrayList<Midia> listarMidiaPorFaixaEtaria(int faixaEtaria) {
		ArrayList<Midia> midiaPorFaixaEtaria  = new ArrayList<>();
		for (Midia listarMidia : midia) {
			if (listarMidia.getfaixaEtariaMinima() >= faixaEtaria) {
				midiaPorFaixaEtaria.add(listarMidia);
			}
		}
		
		return midiaPorFaixaEtaria;
	}
	
	public ArrayList<Midia> listarMidiasPorCategoria(String categoria) {
		ArrayList<Midia> midiaPorCategoria = new ArrayList<>();
		for (Midia listarCategoria : midia) {
			if (listarCategoria.getCategoria() == categoria) {
				midiaPorCategoria.add(listarCategoria);
			}
		}
		return midiaPorCategoria;
	}
	
}


























