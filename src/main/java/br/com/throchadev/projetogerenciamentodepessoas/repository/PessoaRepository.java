package br.com.throchadev.projetogerenciamentodepessoas.repository;

import br.com.throchadev.projetogerenciamentodepessoas.model.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
}
