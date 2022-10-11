package main.dao.produto;

import main.domain.Produto;

import java.util.List;

public interface IProdutoDAO {

    public Integer cadastrar(Produto produto) throws Exception;
    public Integer atualizar(Produto produto) throws Exception;
    public Produto buscar(String codigo) throws Exception;
    public List<Produto> buscarTodos() throws Exception;
    public Integer excluir(Produto produto) throws Exception;
}
