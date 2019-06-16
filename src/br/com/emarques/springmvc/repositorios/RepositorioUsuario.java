package br.com.emarques.springmvc.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.emarques.springmvc.dominios.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long>{
	
	Usuario findByUsername(String username);

}
