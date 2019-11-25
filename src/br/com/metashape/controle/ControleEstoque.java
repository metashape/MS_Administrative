package br.com.metashape.controle;
import br.com.metashape.funcionarios.CadastroFuncionarios;
import br.com.metashape.funcionarios.DiretorioFuncionarios;
import br.com.metashape.funcionarios.DiretorioFuncionariosArr;
import br.com.metashape.funcionarios.Funcionario;
import br.com.metashape.funcionarios.FuncionarioJaCadastradoException;
import br.com.metashape.funcionarios.FuncionarioNaoEncontradoException;
import br.com.metashape.lojas.DiretorioLoja;
import br.com.metashape.lojas.Loja;
import br.com.metashape.lojas.LojaJaCadastradaException;
import br.com.metashape.lojas.LojaNaoEncontradaException;
import br.com.metashape.produtos.CadastroProdutos;
import br.com.metashape.produtos.Produto;
import br.com.metashape.produtos.ProdutoJaCadastradoException;
import br.com.metashape.produtos.ProdutoNaoEncontradoException;
import br.com.metashape.produtos.InterfaceProduto;
import br.com.metashape.utils.DiretorioException;
import br.com.metashape.produtos.DiretorioProdutosLista;
import br.com.metashape.view.CadastroLoja;

/**
 *
 * @author pedrobertolini
 */
public class ControleEstoque {

    private CadastroProdutos produtos;
    private CadastroFuncionarios funcionarios;
    private CadastroLoja lojas;

    public ControleEstoque() {
        initCadastros();
    }

    public void initCadastros() {

        DiretorioFuncionarios repositorioFuncionarios = new DiretorioFuncionariosArr();
        DiretorioLoja repositorioLojas = new DiretorioLoja();
        InterfaceProduto repositorioProdutos = new DiretorioProdutosLista();
        produtos = new CadastroProdutos(repositorioProdutos);
        funcionarios = new CadastroFuncionarios(repositorioFuncionarios);
        lojas = new CadastroLoja(repositorioLojas);

    }

    //Metodos Produto
    public void cadastrar(Produto produto) throws ProdutoNaoEncontradoException, ProdutoJaCadastradoException, DiretorioException {
        produtos.cadastrar(produto);
    }

    public void removerProduto(String nome) throws ProdutoNaoEncontradoException, DiretorioException {
        produtos.remover(nome);
    }

    public void atualizar(Produto produto) throws ProdutoNaoEncontradoException, DiretorioException {
        produtos.atualizar(produto);
    }

    public Produto procurarProduto(String nome) throws ProdutoNaoEncontradoException {
        return produtos.procurar(nome);
    }

    //Metodos Funcionario
    public void cadastrar(Funcionario funcionario) throws FuncionarioJaCadastradoException, DiretorioException {
        funcionarios.cadastrar(funcionario);
    }

    public void removerFuncionario(String matricula) throws FuncionarioNaoEncontradoException, DiretorioException {
        funcionarios.remover(matricula);
    }

    public Funcionario procurarFuncionario(String matricula) throws FuncionarioNaoEncontradoException, DiretorioException {
        return funcionarios.procurar(matricula);
    }

    public Funcionario procurarFuncionarioPorNome(String nome) throws FuncionarioNaoEncontradoException, DiretorioException {
        return funcionarios.procurarPorNome(nome);
    }

    public DiretorioFuncionarios getFuncionarios() throws DiretorioException {
        return funcionarios.getFuncionarios();
    }

    public void atualizar(Funcionario funcionario) throws FuncionarioNaoEncontradoException, DiretorioException {
        funcionarios.atualizar(funcionario);
    }

    //Metodos Loja
    public void cadastrar(Loja loja) throws LojaJaCadastradaException, DiretorioException {
        lojas.cadastrar(loja);
    }

    public void atualizar(Loja loja) throws LojaJaCadastradaException, DiretorioException, LojaNaoEncontradaException {
        lojas.atualizar(loja);
    }

    public void removerLoja(String descricao) throws LojaJaCadastradaException, DiretorioException, LojaNaoEncontradaException {
        lojas.remover(descricao);
    }

    public boolean existeLoja(String descricao) throws DiretorioException {
        return lojas.existe(descricao);
    }

    public Loja procurarLoja(String descricao) throws LojaJaCadastradaException, DiretorioException, LojaNaoEncontradaException {
        return lojas.procurar(descricao);
    }

    public Loja[] listarTudoLojas() throws DiretorioException {
        return lojas.listarTudo();
    }

    public Funcionario[] listarTudoFuncionarios() throws DiretorioException {
        return funcionarios.listarTudo();
    }

}
