package br.com.emarques.springmvc.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.emarques.springmvc.dominios.Album;

public interface RepositorioAlbum extends JpaRepository<Album, Long>{

}
