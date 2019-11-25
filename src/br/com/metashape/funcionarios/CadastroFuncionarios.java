package br.com.metashape.funcionarios;

import br.com.metashape.utils.DiretorioException;
/**
 *
 * @author pedrobertolini
 */
public class CadastroFuncionarios {

	private DiretorioFuncionarios funcionarios;

	public CadastroFuncionarios(DiretorioFuncionarios repositorio) {
		this.funcionarios = repositorio;
	}

	public void cadastrar(Funcionario funcionario)
			throws FuncionarioJaCadastradoException, DiretorioException {
		if (funcionario != null) {
			if (!funcionarios.existe(funcionario.getMatricula())) {
				funcionarios.inserir(funcionario);
			} else {
				throw new FuncionarioJaCadastradoException(funcionario
						.getMatricula());
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void remover(String matricula)
			throws FuncionarioNaoEncontradoException, DiretorioException {
		funcionarios.remover(matricula);
	}

	public boolean existe(String matricula) throws DiretorioException {
		return funcionarios.existe(matricula);
	}

	public DiretorioFuncionarios getFuncionarios()
			throws DiretorioException {
		return funcionarios.getFuncionarios();
	}

	public Funcionario procurar(String matricula)
			throws FuncionarioNaoEncontradoException, DiretorioException {
		return funcionarios.procurar(matricula);
	}
	
	public Funcionario procurarPorNome(String nome) throws FuncionarioNaoEncontradoException, DiretorioException {
	    return funcionarios.procurar(nome);
	  }

	public void atualizar(Funcionario funcionario)
			throws FuncionarioNaoEncontradoException, DiretorioException {
		funcionarios.atualizar(funcionario);
	}
	
	public Funcionario[] listarTudo() throws DiretorioException {
		return funcionarios.getFuncionariosCadastrados();
	}
	
	
}
