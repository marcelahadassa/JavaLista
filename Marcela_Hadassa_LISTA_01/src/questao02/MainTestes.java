package questao02;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class MainTestes {
	public static void main(String [] args) {
		
		ControladorMidia videoTube = ControladorMidia.getInstance();
		ArrayList<String> conteudo = new ArrayList<>();
		
		conteudo.add("Geral");
	
		Produtor produtorUm = new Produtor("Taylor Swift", LocalDate.parse("1989-12-13"), "taylorswift@gmail.com", "Cowboy like Taylor", conteudo);
		Produtor produtorDois = new Produtor("Louis Tomlinson", LocalDate.parse("1991-12-24"), "lt91@gmail.com", "Louis Tomlinson", conteudo);
		Produtor produtorTres = new Produtor("Thomas Muller", LocalDate.parse("1989-09-13"), "thomasmuller@gmail.com", "Embaixadinhas do Muller", conteudo);
		
		videoTube.cadastrarUsuario(produtorUm);
		videoTube.cadastrarUsuario(produtorDois);
		videoTube.cadastrarUsuario(produtorTres);
		
		
		ArrayList<String> interesses = new ArrayList<>();
		
		interesses.add("Musica");
		interesses.add("Jogos");
		interesses.add("Programacao");
		interesses.add("Historia");
		interesses.add("Futebol");
		interesses.add("Academia");
	
		
		Consumidor consumidorUm = new Consumidor("Gabriel Cisneiros Silva de Oliveira", LocalDate.parse("2004-02-20"), "gabrielcisneiros@gmail.com", interesses);
		Consumidor consumidorDois = new Consumidor("Nicholas Camargo Silva", LocalDate.parse("2002-08-21"), "nicocamargo@gmail.com", interesses);
		Consumidor consumidorTres = new Consumidor("Arthur Fillipe", LocalDate.parse("2004-03-10"), "arthurfillipe@gmail.com", interesses);
		Consumidor consumidorQuatro = new Consumidor("Marcio Antônio", LocalDate.parse("2004-08-26"), "marcioantonio@gmail.com", interesses);
		Consumidor consumidorCinco = new Consumidor("Lucas Aurelio Vieira Santos", LocalDate.parse("2004-04-01"), "lucasaurelio@gmail.com", interesses);
		Consumidor consumidorSeis = new Consumidor("Gabriel Ricardo", LocalDate.parse("2008-11-18"), "gabricardo@gmail.com", interesses);
		Consumidor consumidorSete = new Consumidor("Suani Batista de Oliveira", LocalDate.parse("1963-02-26"), "suanioliveira@gmail.com", interesses);
		
		
		videoTube.cadastrarUsuario(consumidorUm);
		videoTube.cadastrarUsuario(consumidorDois);
		videoTube.cadastrarUsuario(consumidorTres);
		videoTube.cadastrarUsuario(consumidorQuatro);
		videoTube.cadastrarUsuario(consumidorCinco);
		videoTube.cadastrarUsuario(consumidorSeis);
		videoTube.cadastrarUsuario(consumidorSete);
		
		
		videoTube.removerUsuario(consumidorSete);
		
		ArrayList<Usuario> primeiraListagem = videoTube.listarUsuariosComIdadeAcimaDe(16);
		System.out.println("Listagem de Usuarios - Acima de 16 anos: ");
		for (Usuario usuario : primeiraListagem) {
			System.out.println(usuario.getnomeCompleto());
		}
		
		ArrayList<Usuario> segundaListagem = videoTube.listarUsuariosPorTipo(consumidorUm.getClass());
		System.out.println("Listagem de Usuarios - Consumidores: ");
		for (Usuario usuario : segundaListagem) {
			System.out.println(usuario.getnomeCompleto());
		}
		
		Midia midiaUm = new Midia(LocalDateTime.now().minusDays(1283), "Final Champions League 2020!", 18, "Futebol", produtorDois);
		Midia midiaDois = new Midia(LocalDateTime.now().minusDays(07), "Aplicativos para programar pelo celular", 12, "Programacao", produtorUm);
		Midia midiaTres = new Midia(LocalDateTime.now().minusDays(100), "Jogo oficial do Bayern de Munique", 16, "Jogos", produtorTres);
		Midia midiaQuatro = new Midia(LocalDateTime.now().minusDays(100), "Only the brave", 14, "Musica", produtorDois);
		Midia midiaCinco = new Midia(LocalDateTime.now().minusDays(290), "Aprendendo a programar com os Beatles!", 12, "Programacao", produtorUm);
		Midia midiaSeis = new Midia(LocalDateTime.now().minusDays(60), "Treino rapido em casa", 16, "Academia", produtorTres);
		Midia midiaSete = new Midia(LocalDateTime.now().minusDays(30), "Como estudar sobre o Comunismo?", 16, "Historia", produtorUm);
		Midia midiaOito = new Midia(LocalDateTime.now().minusDays(7000), "Cantando com ex amigos", 16, "Musica", produtorDois);
		
		
		videoTube.cadastrarMidia(midiaUm);
		videoTube.cadastrarMidia(midiaDois);
		videoTube.cadastrarMidia(midiaTres);
		videoTube.cadastrarMidia(midiaQuatro);
		videoTube.cadastrarMidia(midiaCinco);
		videoTube.cadastrarMidia(midiaSeis);
		videoTube.cadastrarMidia(midiaSete);
		
		
		videoTube.removerMidia(midiaOito);
		
		

		
		ArrayList<Midia> terceiraListagem = videoTube.listarMidiaPorFaixaEtaria(14);
		System.out.println("Listagem de Midias - Faixas acima de 14 anos: ");
		for (Midia midia : terceiraListagem) {
			System.out.println(midia.getArquivo());
		}
		
		ArrayList<Midia> quartaListagem = videoTube.listarMidiasPorCategoria("Programacao");
		System.out.println("Listagem de Midias - Categoria Programacao");
		for (Midia midia : quartaListagem) {
			System.out.println(midia.getCategoria());
		
		}
		
		
		videoTube.reproduzirMidia(consumidorUm, midiaCinco);
		videoTube.reproduzirMidia(consumidorQuatro, midiaSete);
		videoTube.reproduzirMidia(consumidorDois, midiaTres);
		videoTube.reproduzirMidia(consumidorTres, midiaSeis);
		videoTube.reproduzirMidia(consumidorCinco, midiaQuatro);
		videoTube.reproduzirMidia(consumidorSeis, midiaDois);
		videoTube.reproduzirMidia(consumidorTres, midiaUm);
		videoTube.reproduzirMidia(consumidorQuatro, midiaCinco);
		videoTube.reproduzirMidia(consumidorDois, midiaSeis);
		videoTube.reproduzirMidia(consumidorSete, midiaOito);
		videoTube.reproduzirMidia(consumidorUm, midiaUm);
		videoTube.reproduzirMidia(consumidorCinco, midiaQuatro);
		videoTube.reproduzirMidia(consumidorQuatro, midiaDois);
		videoTube.reproduzirMidia(consumidorTres, midiaTres);
		videoTube.reproduzirMidia(consumidorSeis, midiaUm);
		videoTube.reproduzirMidia(consumidorDois, midiaCinco);
		videoTube.reproduzirMidia(consumidorCinco, midiaTres);
		videoTube.reproduzirMidia(consumidorUm, midiaOito);
		videoTube.reproduzirMidia(consumidorQuatro, midiaSete);
		videoTube.reproduzirMidia(consumidorDois, midiaUm);
		
		
		//ArrayList<ReproducaoMidia> quintaListagem = videoTube.listarReproducoesNoPeriodo());
		//System.out.println("Listagem de Reproducoes em determinados periodos: ");
		//for (ReproducaoMidia repMidia : quintaListagem) {
			//System.out.println(quintaListagem);
		//}

	}
	
	
}
