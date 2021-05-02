package com.codigorupestre.spacenative.usuarios.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codigorupestre.spacenative.usuarios.model.Usuario;
import com.codigorupestre.spacenative.usuarios.repository.UsuarioRepository;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioAPI {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@PostMapping
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@GetMapping
	public List<Usuario> obtenerUsuario(){
		return usuarioRepository.findAll();
	}


}
