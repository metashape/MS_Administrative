package br.com.metashape.funcionarios;
import br.com.metashape.utils.DiretorioException;
/**
 *
 * @author pedrobertolini
 */
public class DiretorioFuncionariosArr implements DiretorioFuncionarios {

	private Funcionario[] funcionarios;
	private int indice;
	public static final int TAMANHO_DEFAULT = 100;

	public DiretorioFuncionariosArr() {
		funcionarios = new Funcionario[TAMANHO_DEFAULT];
		indice = 0;
	}

	DiretorioFuncionariosArr(Funcionario[] contas, int indice) {
		this.funcionarios = contas;
		this.indice = indice;
	}

	public void inserir(Funcionario conta) {
		funcionarios[indice] = conta;
		indice = indice + 1;
	}

	public void remover(String matricula) throws FuncionarioNaoEncontradoException {
		int i = getIndice(matricula);
		funcionarios[i] = funcionarios[indice - 1];
		indice = indice - 1;
		funcionarios[indice] = null;
	}

	public Funcionario procurar(String matricula) throws FuncionarioNaoEncontradoException {
		int i = getIndice(matricula);
		return funcionarios[i];
	}

	public void atualizar(Funcionario conta) throws FuncionarioNaoEncontradoException {
		int i = getIndice(conta.getMatricula());
		funcionarios[i] = conta;
	}

	public boolean existe(String matricula) {
		boolean resposta;
		try {
			getIndice(matricula);
			resposta = true;
		} catch (FuncionarioNaoEncontradoException ex) {
			resposta = false;
		}
		return resposta;
	}

	public DiretorioFuncionarios getFuncionarios() {
		// deveria retornar um clone por seguran�a
		return this;
	}

	public IteratorFuncionarios getIterator() {
		IteratorFuncionarios iterator = new IteratorFuncionariosArray(
				funcionarios);
		return iterator;
	}

	public Funcionario[] getTodosFuncionarios() {
		return this.funcionarios;
	}
	
	public int getIndice() {
		return this.indice;
	}
	
	private int getIndice(String matricula) throws FuncionarioNaoEncontradoException {
		int resposta = -1;
		boolean achou = false;
		for (int i = 0; !achou && (i < indice); i = i + 1) {
			if (funcionarios[i].getMatricula().equals(matricula)) {
				resposta = i;
				achou = true;
			}
		}
		if (!achou)
			throw new FuncionarioNaoEncontradoException(matricula);
		return resposta;
	}
	
	private int getIndicePorNome(String nome) throws FuncionarioNaoEncontradoException {
		int resposta = -1;
		boolean achou = false;
		for (int i = 0; !achou && (i < indice); i = i + 1) {
			if (funcionarios[i].getNome().equals(nome)) {
				resposta = i;
				achou = true;
			}
		}
		if (!achou)
			throw new FuncionarioNaoEncontradoException(nome);
		return resposta;
	}

	@Override
	public Funcionario[] getFuncionariosCadastrados()
	  throws DiretorioException {
		if (getIndice() == 0)
			System.out.println("N�o existem funcion�rios cadastrados no momento!");

		return getTodosFuncionarios();
	}

	@Override
	public Funcionario procurarPorNome(String nome) throws FuncionarioNaoEncontradoException, DiretorioException {
		int i = getIndicePorNome(nome);
		return funcionarios[i];
	}
}
