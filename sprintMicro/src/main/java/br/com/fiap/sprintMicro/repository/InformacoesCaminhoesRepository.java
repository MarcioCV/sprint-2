package br.com.fiap.sprintMicro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.sprintMicro.model.InformacoesCaminhoes;

@Repository
public interface InformacoesCaminhoesRepository extends JpaRepository<InformacoesCaminhoes,Long>{

}
