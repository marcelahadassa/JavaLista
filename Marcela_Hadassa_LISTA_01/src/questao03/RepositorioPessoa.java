package questao03;

import java.util.ArrayList;
import java.time.LocalDate;

public class RepositorioPessoa implements IRepositorioPessoa {
	private ArrayList<Pessoa> listaPessoa = new ArrayList<>();

	public RepositorioPessoa() {
	}

	@Override
	public void inserirPessoa(Pessoa p) {
		boolean testePessoa = false;
		for (Pessoa pessoa : listaPessoa) {
			if (pessoa.getEmail() == pessoa.getEmail()) {
				testePessoa = true;
			}
		}
		if (testePessoa == false) {
			listaPessoa.add(p);
		} else {
			System.out.println("Nao e possivel cadastrar, pois esse email ja esta sendo utilizado por outra pessoa.");
		}
	}

	@Override
	public void removerPessoa(Pessoa p) {
		listaPessoa.remove(p);
	}

	@Override
	public Pessoa buscaPessoaPorEmail(String email) {
		for (Pessoa pessoa : listaPessoa) {
			if (pessoa.getEmail().equals(email)) {
				return pessoa;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Palestrante> listarPalestrantesDaEmpresa(String empresa) {
		ArrayList<Palestrante> palestrantesDaEmpresa = new ArrayList<>();
		for (Pessoa pessoa : listaPessoa) {
			if (pessoa instanceof Palestrante) {
				if (((Palestrante) pessoa).getEmpresa() == empresa) {
					palestrantesDaEmpresa.add((Palestrante) pessoa);
				}
			}
		}
		return palestrantesDaEmpresa;
	}


	@Override
	public ArrayList<Participante> listarParticipantesComInteresseEm(String trilha) {
		 ArrayList<Participante> participantesComInteresse = new ArrayList<>();
		 for (Pessoa pessoaUm : listaPessoa) {
			if(pessoaUm instanceof Participante) {
				if(((Participante) pessoaUm).getTrilhaDeInteresse() == trilha) {
					participantesComInteresse.add((Participante) pessoaUm);
				}
			}
		 }
		 return participantesComInteresse;
	}
	 
	
	@Override
	public ArrayList<Participante> listarParticipantesComIdadeMaiorQue(int idade) {
		ArrayList<Participante> participantesComIdadeMaiorQue = new ArrayList<>();
		for (Pessoa pessoaDois : listaPessoa) {
			if(pessoaDois instanceof Participante) {
				if (LocalDate.now().getYear() - ((Participante) pessoaDois).getDataNascimento().getYear() >= idade) {
						participantesComIdadeMaiorQue.add((Participante) pessoaDois);
					}
				}
			}
		return participantesComIdadeMaiorQue;
	}

	protected ArrayList<Pessoa> getListaPessoa() {
		return listaPessoa;
	}

	protected void setListaPessoa(ArrayList<Pessoa> listaPessoa) {
		this.listaPessoa = listaPessoa;
	}

	@Override
	public String toString() {
		return "RepositorioPessoa [listaPessoa =" + listaPessoa + "]";
	}	
	
	
	
}
