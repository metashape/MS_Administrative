package br.com.metashape.controle;
import br.com.metashape.funcionarios.CadastroFuncionarios;
import br.com.metashape.funcionarios.DiretorioFuncionarios;
import br.com.metashape.funcionarios.DiretorioFuncionariosArray;
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
import br.com.metashape.lojas.CadastrarLoja;

/**
 *
 * @author pedrobertolini
 */
public class ControleEstoque {

    private InterfaceProduto produtos;
    private CadastroFuncionarios funcionarios;
    private CadastrarLoja lojas;

    public ControleEstoque() {
        initCadastros();
    }

    public void initCadastros() {

        DiretorioFuncionarios repositorioFuncionarios = new DiretorioFuncionariosArray();
        DiretorioLoja repositorioLojas = new DiretorioLoja();
        //InterfaceProduto repositorioProdutos = new DiretorioProdutosLista();
        this.produtos = new DiretorioProdutosLista();
        this.funcionarios = new CadastroFuncionarios(repositorioFuncionarios);
        this.lojas = new CadastrarLoja(repositorioLojas);

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
        this.funcionarios.cadastrar(funcionario);
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
        this.lojas.cadastrar(loja);
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

    public Loja procurarLoja(String descricao) throws LojaJaCadastradaException, DiretorioException, LojaNaoEncontradaException {
        return this.lojas.procurar(descricao);
    }

    public Loja[] listarTudoLojas() throws DiretorioException {
        return this.lojas.listarTudo();
    }

    public Funcionario[] listarTudoFuncionarios() throws DiretorioException {
        return this.funcionarios.listarTudo();
    }

}
