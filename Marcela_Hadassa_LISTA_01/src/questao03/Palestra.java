package questao03;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Palestra {
	public Long id;
	public String titulo;
	public Palestrante palestrante;
	public String descricao;
	public ArrayList<Avaliacao> avaliacoes = new ArrayList<>();
	public LocalDateTime dataHora;
	public String local;
	public String trilha;
	public double calcularMediaAvaliacoes;
	
	
	protected Palestra(Long id, String titulo, Palestrante palestrante, String descricao,  ArrayList<Avaliacao> avaliacoes, LocalDateTime dataHora, String local, String trilha, double calcularMediaAvaliacoes) {
		this.id = id;
		this.titulo = titulo;
		this.palestrante = palestrante;
		this.descricao = descricao;
		this.dataHora = dataHora;
		this.local = local;
		this.trilha = trilha;
		this.calcularMediaAvaliacoes = calcularMediaAvaliacoes;
	}
	
	@SuppressWarnings("unused")
	private double calcularMediaAvaliacoes(Palestra avaliacaoPalestra) {
	    double notaSoma = 0.0;
	    int finalAvaliacoes = avaliacaoPalestra.getAvaliacoes().size();

	    for (Avaliacao avaliacoes : avaliacaoPalestra.getAvaliacoes()) {
	        notaSoma += avaliacoes.getNota();
	    }

	    if (finalAvaliacoes > 0) {
	        return notaSoma / finalAvaliacoes;
	    } else {
	        return 0.0;
	    }
	}
	 
	
	
	protected double getCalcularMediaAvaliacoes() {
		return calcularMediaAvaliacoes;
	}

	protected void setCalcularMediaAvaliacoes(double calcularMediaAvaliacoes) {
		this.calcularMediaAvaliacoes = calcularMediaAvaliacoes;
	}

	protected Long getId() {
		return id;
	}

	protected void setId(Long id) {
		this.id = id;
	}

	protected String getTitulo() {
		return titulo;
	}

	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	protected Palestrante getPalestrante() {
		return palestrante;
	}

	protected void setPalestrante(Palestrante palestrante) {
		this.palestrante = palestrante;
	}

	protected String getDescricao() {
		return descricao;
	}

	protected void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	protected ArrayList<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	protected void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	protected LocalDateTime getDataHora() {
		return dataHora;
	}

	protected void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	protected String getLocal() {
		return local;
	}

	protected void setLocal(String local) {
		this.local = local;
	}

	protected String getTrilha() {
		return trilha;
	}

	protected void setTrilha(String trilha) {
		this.trilha = trilha;
	}
	
	
	
	
}
