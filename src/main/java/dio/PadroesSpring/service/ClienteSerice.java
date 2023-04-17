package dio.PadroesSpring.service;

import dio.PadroesSpring.model.Cliente;

public interface ClienteSerice {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
