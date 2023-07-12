package questao03;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;



public class MainTeste {
	public static void main(String [] args) {
		
		ControladorRecnPlay eventoRecnPlay = ControladorRecnPlay.getInstance();
		
		Palestrante palesUm = new Palestrante("Empresa X", 0001L, "gustavofranco@gmail.com", "Gustavo Franco", LocalDate.parse("1999-09-04"), "Recife" );
		Palestra palestraUm = new Palestra(0010L, "A inovacao financeira e o sistema financeiro do futuro", , "Palestra sobre como as inovações tecnológicas financeiras podem influenciar o sistema financeiro", LocalDateTime.parse("2023-10-02T10:00"), "Teatro Apolo", "Tecnologia");
		Participante partiUm = new Participante("Tecnologia", 0100L, "lucasaurelio@gmail.com", "Lucas Aurelio", LocalDate.parse("2003-05-23"), "Recife");
		Avaliacao avaliaUm = new Avaliacao(palestraUm, 5, "Otima!", partiUm);
		
		
//		Palestrante palesDois = new Palestrante("Accenture", 0002L, "simonezelaquett@gmail.com", "Simone Zelaquett", LocalDate.parse("1996-08-02"), "Paulista");
//		Palestra palestraDois = new Palestra(0020L, "Apresentação do Humanóide NAO", ,"Nessa atividade os participantes assistirão a performance do NAO- humanóide programado por estudantes da rede municipal do Recife, as apresentações de Yoga e Dança que serão contagiantes e motivarão a interação dos presentes.", LocalDateTime.parse("2023-10-02"), "Accenture Innovation Center", "Tecnologia");
//		Participante partiDois = new Participante("Tecnologia", 0200L, "arthurfillipe@gmail.com", "Arthur Fillipe", LocalDate.parse("2004-01-19"), "Gravata");
//		Avaliacao avaliaDois = new Avaliacao(palestraDois, 4, "Muito boa.", partiDois);
//		
//		Palestrante palesTres = new Palestrante("Prefeitura do Recife", 0003L, "andreapinho@gmail.com", "Andrea Pinho", LocalDate.parse("1989-05-23"), "Sao Paulo"); 
//		Palestra palestraTres = new Palestra(0030L, "Imprensa Mirim", , "Durante o evento os palestrantes serão entrevistados como pauta da Cobertura jornalística das acoes do RecnPlay, realizadas por estudantes da Prefeitura de Recife. Muitos participantes poderão compor com os palestrantes as entrevistas prestando depoimentos sobre oevento e suas impressões e novas aprendizagens.", LocalDateTime.parse("2023-10-02"), "Teatro Apolo", "Economia criativa");
//		Participante partiTres = new Participante("Economia criativa", 0300L, "nicholassilva@gmail.com", "Nicholas Silva", LocalDate.parse("1971-05-21"), "Jaboatao dos guararapes");
//		Avaliacao avaliaTres = new Avaliacao(palestraTres, 3, "Boa.", partiTres);
//		
//
//		Palestrante palesQuatro = new Palestrante("")
//	}
}