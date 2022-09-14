package br.com.throchadev.projetogerenciamentodepessoas.mapper;

import br.com.throchadev.projetogerenciamentodepessoas.dto.PessoaDto;
import br.com.throchadev.projetogerenciamentodepessoas.model.Pessoa;
import org.springframework.beans.BeanUtils;

public class PessoaMapper {

    public static Pessoa dtoToEntity(PessoaDto pessoaDto) {
        Pessoa pessoa = new Pessoa();
        BeanUtils.copyProperties(pessoaDto, pessoa);
        return pessoa;
    }
}
