package br.com.metashape.lojas;

import br.com.metashape.utils.DiretorioException;

/**
 *
 * @author pedrobertolini
 */
public class CadastrarLoja {
    private DiretorioLoja lojas;

	// private RepositorioLojasLista lojas;

	public CadastrarLoja(DiretorioLoja lojas) {
		this.lojas = lojas;
		// lojas = new RepositorioLojasLista();
	}

	public void cadastrar(Loja loja) throws LojaJaCadastradaException,
			DiretorioException {
		if (loja != null) {
			if (lojas.existe(loja.getDescricao())) {
				// throw new
				// RuntimeException("Loja j� cadastrada, escolha outra descri��o para a loja.");
				throw new LojaJaCadastradaException(loja.getDescricao());
			} else {
				lojas.inserir(loja);
			}
		} else
			throw new IllegalArgumentException();
	}

	public void atualizar(Loja loja) throws LojaJaCadastradaException,
			DiretorioException, LojaNaoEncontradaException {
		lojas.atualizar(loja);
	}

	public void remover(String descricao) throws LojaJaCadastradaException,
			DiretorioException, LojaNaoEncontradaException {
		lojas.remover(descricao);
	}

	public boolean existe(String descricao) throws DiretorioException {
		return lojas.existe(descricao);
	}

	public Loja procurar(String descricao) throws LojaJaCadastradaException,
			DiretorioException, LojaNaoEncontradaException {
		return lojas.procurar(descricao);
	}

	public Loja[] listarTudo() throws DiretorioException {
		return lojas.getLojas();
	}
}
