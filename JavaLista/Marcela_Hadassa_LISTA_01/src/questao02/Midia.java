package questao02;
import java.time.LocalDateTime;

public class Midia {
	private LocalDateTime dataHoraUpload;
	private String arquivo;
	private int faixaEtariaMinima;
	private String categoria;
	private Produtor produtor;
	
	protected Midia(LocalDateTime dataHoraUpload, String arquivo, int faixaEtariaMinima, String categoria, Produtor produtor) {
		this.dataHoraUpload = dataHoraUpload;
		this.arquivo = arquivo;
		this.faixaEtariaMinima = faixaEtariaMinima;
		this.categoria = categoria;
		this.produtor = produtor;
	}
	
	protected LocalDateTime getDataHoraUpload() {
		return this.dataHoraUpload;
	}
	
	protected void setDataHoraUpload(LocalDateTime dataHoraUpload) {
		 this.dataHoraUpload = dataHoraUpload;
	}
	
	protected String getArquivo() {
		return this.arquivo;
	}
	
	protected void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	
	protected int getfaixaEtariaMinima() {
		return this.faixaEtariaMinima;
	}
	
	protected void setFaixaEtariaMinima(int faixaEtariaMinima) {
		this.faixaEtariaMinima = faixaEtariaMinima;

	}
	
	protected String getCategoria() {
		return this.categoria;
	}
	
	protected void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	protected Produtor getProdutor() {
		return this.produtor;
	}
	
	protected void setProdutor(Produtor produtor) {
		this.produtor = produtor;
	}

	@Override
	public String toString() {
		return "Midia [dataHoraUpload=" + dataHoraUpload + ", arquivo=" + arquivo + ", faixaEtariaMinima="
				+ faixaEtariaMinima + ", categoria=" + categoria + ", produtor=" + produtor + "]";
	}
	

 }














