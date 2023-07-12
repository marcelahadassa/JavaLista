package questao03;

import java.util.ArrayList;

public interface IRepositorioPessoa {

	void inserirPessoa(Pessoa p);

	void removerPessoa(Pessoa p);

	Pessoa buscaPessoaPorEmail(String email);

	ArrayList<Palestrante> listarPalestrantesDaEmpresa(String empresa);

	ArrayList<Participante> listarParticipantesComInteresseEm(String trilha);

	ArrayList<Participante> listarParticipantesComIdadeMaiorQue(int idade);

}