package es.iesquevedo.service;

import es.iesquevedo.modelo.Cliente;
import es.iesquevedo.dao.ClienteRepository;

import java.util.List;
import java.util.Optional;

public class ClienteService {
    private final ClienteRepository repositorio;

    public ClienteService() {
        this.repositorio = new ClienteRepository();
    }

    public List<Cliente> obtenerTodos() {
        return repositorio.obtenerTodos();
    }

    public Optional<Cliente> buscarPorCodigo(String codigo) {
        return repositorio.buscarPorCodigo(codigo);
    }

    public boolean registrarCliente(Cliente cliente) {
        if (cliente.getCodigo() == null || cliente.getCodigo().isBlank()) {
            return false;
        }
        if (cliente.getNombreCompleto() == null || cliente.getNombreCompleto().isBlank()) {
            return false;
        }
        if (cliente.getEmail() == null || cliente.getEmail().isBlank()) {
            return false;
        }
        return repositorio.insertar(cliente);
    }

    public boolean eliminarCliente(String codigo) {
        return repositorio.eliminarPorCodigo(codigo);
    }
}
