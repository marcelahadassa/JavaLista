package questao03;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;



public class MainTeste {
	public static void main(String [] args) {
		
		ControladorRecnPlay RecnPlay  = ControladorRecnPlay.getInstance();
		ArrayList<Avaliacao> avaliacoes = new ArrayList<>();
		
		
		Palestrante palesUm = new Palestrante("Empresa X", 0001L, "gustavofranco@gmail.com", "Gustavo Franco", LocalDate.parse("1999-09-04"), "Recife" );
		Palestra palestraUm = new Palestra(0010L, "A inovacao financeira e o sistema financeiro do futuro", palesUm, "Palestra sobre como as inovações tecnológicas financeiras podem influenciar o sistema financeiro", LocalDateTime.parse("2023-10-02T10:00"), "Teatro Apolo", "Tecnologia");
		Participante partiUm = new Participante("Tecnologia", 0100L, "lucasaurelio@gmail.com", "Lucas Aurelio", LocalDate.parse("2003-05-23"), "Recife");
		Avaliacao avaliaUm = new Avaliacao(palestraUm, 5, "Otima!", partiUm);
		
		
		Palestrante palesDois = new Palestrante("Accenture", 0002L, "simonezelaquett@gmail.com", "Simone Zelaquett", LocalDate.parse("1996-08-02"), "Paulista");
		Palestra palestraDois = new Palestra(0020L, "Apresentação do Humanóide NAO", palesDois, "Nessa atividade os participantes assistirão a performance do NAO- humanóide programado por estudantes da rede municipal do Recife, as apresentações de Yoga e Dança que serão contagiantes e motivarão a interação dos presentes.", LocalDateTime.parse("2023-10-02"), "Accenture Innovation Center", "Tecnologia");
		Participante partiDois = new Participante("Tecnologia", 0200L, "arthurfillipe@gmail.com", "Arthur Fillipe", LocalDate.parse("2004-01-19"), "Gravata");
		Avaliacao avaliaDois = new Avaliacao(palestraDois, 4, "Muito boa.", partiDois);
		
		Palestrante palesTres = new Palestrante("Prefeitura do Recife", 0003L, "andreapinho@gmail.com", "Andrea Pinho", LocalDate.parse("1989-05-23"), "Sao Paulo"); 
		Palestra palestraTres = new Palestra(0030L, "Imprensa Mirim", palesTres, "Durante o evento os palestrantes serão entrevistados como pauta da Cobertura jornalística das acoes do RecnPlay, realizadas por estudantes da Prefeitura de Recife. Muitos participantes poderão compor com os palestrantes as entrevistas prestando depoimentos sobre oevento e suas impressões e novas aprendizagens.", LocalDateTime.parse("2023-10-02"), "Teatro Apolo", "Economia criativa");
		Participante partiTres = new Participante("Economia criativa", 0300L, "nicholassilva@gmail.com", "Nicholas Silva", LocalDate.parse("1971-05-21"), "Jaboatao dos guararapes");
		Avaliacao avaliaTres = new Avaliacao(palestraTres, 3, "Boa.", partiTres);
		

		Palestrante palesQuatro = new Palestrante("Grupo Moura", 0004L, "marianamoura@gmail.com", "Mariana Moura", LocalDate.parse("2000-10-10"), "Olinda");
		Palestra palestraQuatro = new Palestra(0040L, "Educação experimental para famílias empresárias", palesQuatro, "Uma conversa com os sócios e membros da Escola F para debater um novo modelo educacional voltado para famílias empresárias. Um modelo de negocio colaborativo que valoriza a aprendizagem a partir da troca de experiências, investe na facilitação de grupos para gerar conhecimento e desenvolvimento, por meio da construção de entendimentos e não apenas a partir de conteúdos externos.", LocalDateTime.parse("2023-10-04T10:00"), "CESAR Bom Jesus - Sala Garagem (5º andar)", "Cidades");
		Participante partiQuatro = new Participante("Cidades", 0400L, "joaocarlos@gmail.com", "Joao Carlos", LocalDate.parse("1969-04-21"), "Sergipe"); 
		Avaliacao avaliaQuatro = new Avaliacao(palestraQuatro, 2, "Mediana.", partiQuatro);
		
		Palestrante palesCinco = new Palestrante("UFPE", 0005L, "silviomeira@gmail.com", "Silvio Meira", LocalDate.parse("1989-11-21"), "Petrolina");
		Palestra palestraCinco = new Palestra(0050L, "Como você e a sua empresa irão sobreviver ao apocalipse digital?", palesCinco, "Talk Show com o renomado líder do setor de inovação que conversá sobre o tema de transformação digital.", LocalDateTime.parse("2023-10-05T10:00"), "Cais do Sertão - Auditório", "Cidades");
		Participante partiCinco = new Participante("Cidades", 0500L, "suanibatista@gmail.com", "Suani Batista", LocalDate.parse("1963-02-26"), "Joao Pessoa");
		Avaliacao avaliaCinco = new Avaliacao(palestraCinco, 1, "Ruim.", partiCinco);
		
		Participante partiSeis = new Participante("Tecnologia", 0600L, "lucasaurelio@gmail.com", "Lucas Aurelio", LocalDate.parse("1979-12-24"), "Igarassu");
		Participante partiSete = new Participante("Economia criativa", 0700L, "gabrielcisneiros@gmail.com", "Gabriel Cisneiros", LocalDate.parse("2002-11-09"), "Amaragi");
		Participante partiOito = new Participante("Cidades", 199L, "juliapynes@gmail.com", "Julia Pynes", LocalDate.parse("2008-07-22"), "Rio de Janeiro");
		
		Avaliacao avaliaSeis = new Avaliacao(palestraUm, 3, "Boa.", partiSeis);
		Avaliacao avaliaSete = new Avaliacao(palestraDois, 5, "Otima!", partiSete);
		Avaliacao avaliaOito = new Avaliacao(palestraTres, 4, "Muito boa.", partiOito);
		Avaliacao avaliaNove = new Avaliacao(palestraDois, 1, "Ruim.", partiUm);
		Avaliacao avaliaDez = new Avaliacao(palestraUm, 2, "Mediana.", partiDois);
		Avaliacao avaliaOnze = new Avaliacao(palestraTres, 5, "Otima!", partiTres);
		Avaliacao avaliaDoze = new Avaliacao(palestraQuatro, 3, "Boa.", partiQuatro);
		Avaliacao avaliaTreze = new Avaliacao(palestraCinco, 1, "Ruim.", partiCinco);
		Avaliacao avaliaCatorze = new Avaliacao(palestraQuatro, 4, "Muito boa.", partiSeis);
		Avaliacao avaliaQuinze = new Avaliacao(palestraCinco, 2, "Mediana.", partiSete);
		
		RecnPlay.cadastrarPalestra(palestraUm);
		RecnPlay.cadastrarPalestra(palestraDois);
		RecnPlay.cadastrarPalestra(palestraTres);
		RecnPlay.cadastrarPalestra(palestraQuatro);
		RecnPlay.cadastrarPalestra(palestraCinco);
		
		RecnPlay.realizarInscricao(partiUm);
		RecnPlay.realizarInscricao(partiDois);
		RecnPlay.realizarInscricao(partiTres);
		RecnPlay.realizarInscricao(partiQuatro);
		RecnPlay.realizarInscricao(partiCinco);
		RecnPlay.realizarInscricao(partiSeis);
		RecnPlay.realizarInscricao(partiSete);
		RecnPlay.realizarInscricao(partiOito);
		
		RecnPlay.avaliarPalestra(avaliaUm);
		RecnPlay.avaliarPalestra(avaliaDois);
		RecnPlay.avaliarPalestra(avaliaTres);
		RecnPlay.avaliarPalestra(avaliaQuatro);
		RecnPlay.avaliarPalestra(avaliaCinco);
		RecnPlay.avaliarPalestra(avaliaSeis);
		RecnPlay.avaliarPalestra(avaliaSete);
		RecnPlay.avaliarPalestra(avaliaOito);
		RecnPlay.avaliarPalestra(avaliaNove);
		RecnPlay.avaliarPalestra(avaliaDez);
		RecnPlay.avaliarPalestra(avaliaOnze);
		RecnPlay.avaliarPalestra(avaliaDoze);
		RecnPlay.avaliarPalestra(avaliaTreze);
		RecnPlay.avaliarPalestra(avaliaCatorze);
		RecnPlay.avaliarPalestra(avaliaQuinze);
		
		
		
	}
}