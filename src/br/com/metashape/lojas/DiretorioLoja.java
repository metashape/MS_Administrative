package br.com.metashape.lojas;

import br.com.metashape.funcionarios.Funcionario;
import br.com.metashape.funcionarios.FuncionarioNaoEncontradoException;
import br.com.metashape.utils.DiretorioException;

/**
 *
 * @author pedrobertolini
 */
public class DiretorioLoja implements InterfaceLoja{

    private Loja loja;
    private DiretorioLoja proximo;

    public DiretorioLoja() {
        this.loja = null;
        this.proximo = null;
    }

    @Override
    public void inserir(Loja loja) {
        if (this.loja != null) {
            this.proximo.inserir(loja);
        } else {
            this.loja = loja;
            this.proximo = new DiretorioLoja();
        }
    }

    @Override
    public void atualizar(Loja loja) {
        if (this.loja != null) {
            if (this.loja.getDescricao().equals(loja.getDescricao())) {
                this.loja = loja;
            } else {
                this.proximo.atualizar(loja);
            }
        } else {
            throw new RuntimeException("Loja n�o encontrada");
        }
    }

    @Override
    public void remover(String loja) {
        if (this.loja != null) {
            if (this.loja.getDescricao().equals(loja)) {
                this.loja = this.proximo.loja;
                this.proximo = this.proximo.proximo;
            } else {
                this.proximo.remover(loja);
            }
        } else {
            throw new RuntimeException("Loja n�o encontrada");
        }
    }

    public Loja procurar(String descricao) {
        Loja resposta;
        if (this.loja != null) {
            if (this.loja.getDescricao().equals(descricao)) {
                resposta = this.loja;
            } else {
                resposta = this.proximo.procurar(descricao);
            }
        } else {
            resposta = null;
        }
        return resposta;
    }

    @Override
    public boolean existe(String descricao) {
        boolean resposta;
        if (this.loja != null) {
            if (this.loja.getDescricao().equals(descricao)) {
                resposta = true;
            } else {
                resposta = this.proximo.existe(descricao);
            }
        } else {
            resposta = false;
        }
        return resposta;
    }

    public Loja getLoja() {
        return this.loja;
    }

    public DiretorioLoja getProximo() {
        return this.proximo;
    }

    public int size() {
        int size = 0;
        if (this.loja != null) {
            size++;
            DiretorioLoja proximo = this.proximo;
            while (proximo != null) {
                if (proximo.getLoja() != null) {
                    size++;
                    proximo = proximo.getProximo();
                } else {
                    break;
                }
            }

            return size;
        } else {
            return size;
        }
    }

    @Override
    public Loja[] getLojas() throws DiretorioException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public IteratorLojas getIterator() throws DiretorioException {
        // TODO Auto-generated method stub
        return null;
    }

    public Loja[] listarTudo() throws DiretorioException {
        // TODO Auto-generated method stub
        return null;
    }

    /*@Override
    public void inserir(Loja loja) throws DiretorioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Loja procurarTodos() throws LojaNaoEncontradoException, DiretorioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Loja procurarPorNome(String nome) throws LojaNaoEncontradoException, DiretorioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Loja procurarPorMatricula(String matricula) throws LojaNaoEncontradoException, DiretorioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Loja procurarPorEmail(String email) throws LojaNaoEncontradoException, DiretorioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Loja funcionario) throws LojaNaoEncontradoException, DiretorioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public InterfaceLoja getLojas() throws DiretorioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Loja[] getLojasCadastrados() throws DiretorioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public Loja procurarTodos() throws LojaNaoEncontradaException, DiretorioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Loja procurarPorNome(String nome) throws LojaNaoEncontradaException, DiretorioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Loja procurarPorMatricula(String matricula) throws LojaNaoEncontradaException, DiretorioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Loja procurarPorEmail(String email) throws LojaNaoEncontradaException, DiretorioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Loja[] getLojasCadastrados() throws DiretorioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
