package br.com.metashape.controle;
import br.com.metashape.funcionarios.CadastroFuncionarios;
import br.com.metashape.funcionarios.DiretorioFuncionarios;
import br.com.metashape.funcionarios.DiretorioFuncionariosArray;
import br.com.metashape.funcionarios.Funcionario;
import br.com.metashape.funcionarios.FuncionarioJaCadastradoException;
import br.com.metashape.funcionarios.FuncionarioNaoEncontradoException;
import br.com.metashape.funcionarios.InterfaceFuncionario;
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
import br.com.metashape.lojas.CadastrarLoja;
import br.com.metashape.lojas.InterfaceLoja;

/**
 *
 * @author pedrobertolini
 */
public class ControleEstoque {

    private InterfaceProduto produtos;
    private DiretorioFuncionarios funcionarios;
    private InterfaceLoja lojas;

    public ControleEstoque() {
        initCadastros();
    }

    public void initCadastros() {
        this.produtos = new DiretorioProdutosLista();
        this.funcionarios = new DiretorioFuncionariosArray();
        this.lojas = new DiretorioLoja();

    }

    //Metodos Produto
    public void cadastrar(Produto produto) throws ProdutoNaoEncontradoException, ProdutoJaCadastradoException, DiretorioException {
        this.produtos.inserir(produto);
    }

    public void removerProduto(String nome) throws ProdutoNaoEncontradoException, DiretorioException {
        this.produtos.remover(nome);
    }

    public void atualizar(Produto produto) throws ProdutoNaoEncontradoException, DiretorioException {
        this.produtos.atualizar(produto);
    }

    public Produto procurarProduto(String nome) throws ProdutoNaoEncontradoException, DiretorioException {
        return this.produtos.procurar(nome);
    }

    //Metodos Funcionario
    public void cadastrar(Funcionario funcionario) throws FuncionarioJaCadastradoException, DiretorioException {
        this.funcionarios.inserir(funcionario);
    }

    public void removerFuncionario(String matricula) throws FuncionarioNaoEncontradoException, DiretorioException {
        this.funcionarios.remover(matricula);
    }

    public Funcionario procurarFuncionario(String matricula) throws FuncionarioNaoEncontradoException, DiretorioException {
        return this.funcionarios.procurar(matricula);
    }

    public Funcionario procurarFuncionarioPorNome(String nome) throws FuncionarioNaoEncontradoException, DiretorioException {
        return this.funcionarios.procurarPorNome(nome);
    }

    public DiretorioFuncionarios getFuncionarios() throws DiretorioException {
        return this.funcionarios.getFuncionarios();
    }

    public void atualizar(Funcionario funcionario) throws FuncionarioNaoEncontradoException, DiretorioException {
        this.funcionarios.atualizar(funcionario);
    }

    //Metodos Loja
    public void cadastrar(Loja loja) throws LojaJaCadastradaException, DiretorioException {
        this.lojas.inserir(loja);
    }

    public void atualizar(Loja loja) throws LojaJaCadastradaException, DiretorioException, LojaNaoEncontradaException {
        this.lojas.atualizar(loja);
    }

    public void removerLoja(String descricao) throws LojaJaCadastradaException, DiretorioException, LojaNaoEncontradaException {
        this.lojas.remover(descricao);
    }

    public boolean existeLoja(String descricao) throws DiretorioException {
        return this.lojas.existe(descricao);
    }

    public Loja procurarLoja() throws LojaJaCadastradaException, DiretorioException, LojaNaoEncontradaException {
        return this.lojas.procurarTodos();
    }

    public Loja[] listarTudoLojas() throws DiretorioException {
        return this.lojas.listarTudo();
    }

    public Funcionario[] listarTudoFuncionarios() throws DiretorioException {
        return this.funcionarios.getFuncionariosCadastrados();
    }

}
