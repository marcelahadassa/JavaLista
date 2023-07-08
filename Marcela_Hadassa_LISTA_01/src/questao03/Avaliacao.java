package questao03;

public class Avaliacao {
	public Palestra palestra;
	public int nota;
	public String comentario;
	public Participante avaliador;

	protected Avaliacao(Palestra palestra, int nota, String comentario, Participante avaliador) {
		this.palestra = palestra;
		this.nota = nota;
		this.comentario = comentario;
		this.avaliador = avaliador;
	}

	protected Palestra getPalestra() {
		return palestra;
	}

	protected void setPalestra(Palestra palestra) {
		this.palestra = palestra;
	}

	protected int getNota() {
		return nota;
	}

	protected void setNota(int nota) {
		this.nota = nota;
	}

	protected String getComentario() {
		return comentario;
	}

	protected void setComentario(String comentario) {
		this.comentario = comentario;
	}

	protected Participante getAvaliador() {
		return avaliador;
	}

	protected void setAvaliador(Participante avaliador) {
		this.avaliador = avaliador;
	}
	
	
}
