package questao02;
import java.time.LocalDateTime;

public class ReproducaoMidia {
	private Midia midia;
	private Consumidor consumidor;
	private LocalDateTime dataHoraReproducao;
	
	protected ReproducaoMidia(Midia midia, Consumidor consumidor, LocalDateTime dataHoraReproducao) {
		this.midia = midia;
		this.consumidor = consumidor;
		this.dataHoraReproducao = dataHoraReproducao;
	}
	
	public Midia getMidia() {
		return this.midia;
	}
	
	public void setMidia(Midia midia) {
		this.midia = midia;
	}
	
	public Consumidor getConsumidor() {
		return this.consumidor;
	}
	
	public void setConsumidor(Consumidor consumidor) {
		this.consumidor = consumidor;
	}
	
	public LocalDateTime getdataHoraReproducao() {
		return this.dataHoraReproducao; 
	}
	
	public void setdataHoraReproducao(LocalDateTime dataHoraReproducao) {
		this.dataHoraReproducao = dataHoraReproducao;
	}
}
