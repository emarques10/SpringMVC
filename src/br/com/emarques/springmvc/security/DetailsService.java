package br.com.emarques.springmvc.security;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.com.emarques.springmvc.dominios.Usuario;
import br.com.emarques.springmvc.repositorios.RepositorioUsuario;

public class DetailsService implements UserDetailsService{
	
	@Autowired
	private RepositorioUsuario repositorio;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = repositorio.findByUsername(username);
		if(usuario == null) {
			throw new UsernameNotFoundException("Usu�rio n�o encontrado");
		}
		Set<GrantedAuthority> perfis = new HashSet<GrantedAuthority>();
		perfis.add(new SimpleGrantedAuthority(usuario.getRole()));
		return new User(usuario.getUsername(), usuario.getPassword(), perfis);
	}
	
	

}
