package com.example.service;

import com.example.model.Usuario;
import com.example.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class UsuarioService {

private final UsuarioRepository usuarioRepository;

@Autowired
public UsuarioService(UsuarioRepository usuarioRepository) {
	this.usuarioRepository = usuarioRepository;
}

public List <Usuario> listarTodos() {
	return usuarioRepository.findAll();
}
public Optional<Usuario> buscarPorId(Long id) {
    return usuarioRepository.findById(id);
}

public Usuario salvar(Usuario usuario) {
    return usuarioRepository.save(usuario);
}

public void deletar(Long id) {
    usuarioRepository.deleteById(id);
}
}

