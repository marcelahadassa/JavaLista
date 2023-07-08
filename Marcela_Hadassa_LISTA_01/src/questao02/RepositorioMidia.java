package questao02;
import java.util.ArrayList;

public class RepositorioMidia {
	private ArrayList<Midia> midia;
	
	public void RepositororioMidia() {
		 midia = new ArrayList<>();
	 }
	
	public void cadastrarMidia(Midia m) {
		boolean testeMidia = false;
		for (Midia novamidia : midia) {
			if (novamidia.getArquivo() == m.getArquivo()) {
				testeMidia = true;
			}
		}
		if (testeMidia == false) {
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
		for (Midia novamidia : midia) {
			if (novamidia.getfaixaEtariaMinima() >= faixaEtaria) {
				midiaPorFaixaEtaria.add(novamidia);
			}
		}
		
		return midiaPorFaixaEtaria;
	}
	
	public ArrayList<Midia> listarMidiasPorCategoria(String categoria) {
		ArrayList<Midia> midiaPorCategoria = new ArrayList<>();
		for (Midia novaMidia : midia) {
			if (novaMidia.getCategoria() == categoria) {
				midiaPorCategoria.add(novaMidia);
			}
		}
		return midiaPorCategoria;
	}
	
}


























