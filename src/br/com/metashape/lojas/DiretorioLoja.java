package br.com.metashape.lojas;

import br.com.metashape.utils.DiretorioException;

/**
 *
 * @author pedrobertolini
 */
public class DiretorioLoja {

    private Loja loja;
    private DiretorioLoja proximo;

    public DiretorioLoja() {
        this.loja = null;
        this.proximo = null;
    }

    public void inserir(Loja loja) {
        if (this.loja != null) {
            this.proximo.inserir(loja);
        } else {
            this.loja = loja;
            this.proximo = new DiretorioLoja();
        }
    }

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

    public Loja[] getLojas() throws DiretorioException {
        // TODO Auto-generated method stub
        return null;
    }

    public IteratorLojas getIterator() throws DiretorioException {
        // TODO Auto-generated method stub
        return null;
    }

    public Loja[] listarTudo() throws DiretorioException {
        // TODO Auto-generated method stub
        return null;
    }
}
