package br.com.fiap.sprintMicro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.sprintMicro.model.ComponentesCaminhoes;

@Repository
public interface ComponentesCaminhoesRepository extends JpaRepository<ComponentesCaminhoes,Long>{

}
