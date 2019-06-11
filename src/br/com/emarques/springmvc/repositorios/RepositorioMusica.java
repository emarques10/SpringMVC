package br.com.emarques.springmvc.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.emarques.springmvc.dominios.Musica;

public interface RepositorioMusica extends JpaRepository<Musica, Long> {

}
