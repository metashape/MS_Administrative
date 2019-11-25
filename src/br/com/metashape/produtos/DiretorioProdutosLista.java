package br.com.metashape.produtos;
import br.com.metashape.utils.DiretorioException;
import br.com.metashape.produtos.ProdutoJaCadastradoException;
import br.com.metashape.produtos.ProdutoNaoEncontradoException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author pedrobertolini
 */
public class DiretorioProdutosLista implements InterfaceProduto {

   private Produto produto;
	private DiretorioProdutosLista proximo;

	public DiretorioProdutosLista() {
		super();
		this.produto = null;
		this.proximo = null;
	}

	public void atualizar(Produto produto) throws ProdutoNaoEncontradoException {
		if (this.produto != null) {
			if (this.produto.getDescricao().equals(
					produto.getDescricao())) {
				this.produto = produto;
			} else {
				proximo.atualizar(produto);
			}
		} else {
			throw new ProdutoNaoEncontradoException();
		}
	}

	public boolean existe(String nome) {
		boolean resposta;
		if (this.produto != null) {
			if (this.produto.getDescricao().equals(nome)) {
				resposta = true;
			} else {
				resposta = proximo.existe(nome);
			}
		} else {
			resposta = false;
		}
		return resposta;
	}

    /**
     *
     * @param produto
     * @throws ProdutoNaoEncontradoException
     * @throws ProdutoJaCadastradoException
     */
    
   @Override
	public void inserir(Produto produto) throws ProdutoNaoEncontradoException,
			ProdutoJaCadastradoException {
		boolean resultado = existe(produto.getDescricao());
		if (resultado == false) {
			if (this.produto != null) {
				proximo.inserir(produto);
			} else {
				this.produto = produto;
				this.proximo = new DiretorioProdutosLista();
			}
		} else {
			throw new ProdutoJaCadastradoException();
		}

	}

	public Produto procurar(String nome) throws ProdutoNaoEncontradoException {
		Produto resposta = null;
		if (this.produto != null) {
			if (this.produto.getDescricao().equals(nome)) {
				resposta = this.produto;
			} else {
				resposta = proximo.procurar(nome);
			}
		} else {
			throw new ProdutoNaoEncontradoException();
		}
		return resposta;
	}

   @Override
	public void remover(String nome) throws ProdutoNaoEncontradoException {
		boolean resultado = existe(nome);
		if (resultado == true) {
			if (this.produto != null) {
				if (this.produto.getDescricao().equals(nome)) {
					this.produto = proximo.produto;
					this.proximo = proximo.proximo;
				} else {
					proximo.remover(nome);
				}
			} else {
				throw new ProdutoNaoEncontradoException();
			}
		} else {
			throw new ProdutoNaoEncontradoException();
		}
	}

	public DiretorioProdutosLista getProdutos() throws DiretorioException {
		// deveria retornar um clone por seguran�a
		return this;
	}

    @Override
    public Object[] procurarTodos() throws ProdutoNaoEncontradoException, DiretorioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto procurarPorNome(String nome) throws ProdutoNaoEncontradoException, DiretorioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto procurarPorSku(String sku) throws ProdutoNaoEncontradoException, DiretorioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto[] procurarPorCategoria(String categoria) throws ProdutoNaoEncontradoException, DiretorioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
