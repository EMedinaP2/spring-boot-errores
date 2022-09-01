package com.bolsadeideas.springboot.error.app.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.error.app.models.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private List<Usuario> lista;

	public UsuarioServiceImpl() {
		this.lista = Arrays.asList(new Usuario(1, "Esteban", "Medina"), new Usuario(2, "Roberto", "Rodriguez"),
				new Usuario(3, "Carla", "Arriaga"), new Usuario(4, "Sebastian", "Campos"),
				new Usuario(5, "Juan", "Martinez"), new Usuario(6, "Fatima", "Marquez"));
	}

	@Override
	public List<Usuario> listar() {

		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		Usuario resultado = null;
		for (Usuario u : this.lista) {
			if (u.getId().equals(id)) {
				resultado = u;
				break;
			}
		}
		return resultado;
	}

}
