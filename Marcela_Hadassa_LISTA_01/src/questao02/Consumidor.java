package questao02;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class Consumidor extends Usuario {
	private List<String> categoriasInteresse;
	
	public Consumidor(String nomeCompleto, LocalDate dataNascimento, String email, ArrayList <String> categoriasInteresse) {
		super(nomeCompleto, dataNascimento, email);
		categoriasInteresse = new ArrayList<>();
	}
	
	public List<String> getcategoriasIntersse() {
		return this.categoriasInteresse;
	}
	
	public void setcategoriasInteresse(List<String> categoriasInteresses) {
		this.categoriasInteresse = categoriasInteresses;
	}
 }
