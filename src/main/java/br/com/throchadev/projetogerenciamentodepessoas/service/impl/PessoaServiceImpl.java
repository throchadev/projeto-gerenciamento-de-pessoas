package br.com.throchadev.projetogerenciamentodepessoas.service.impl;

import br.com.throchadev.projetogerenciamentodepessoas.dto.PessoaDto;
import br.com.throchadev.projetogerenciamentodepessoas.mapper.PessoaMapper;
import br.com.throchadev.projetogerenciamentodepessoas.repository.PessoaRepository;
import br.com.throchadev.projetogerenciamentodepessoas.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public void salvarPessoa(PessoaDto pessoaDto) {
        var pessoa = PessoaMapper.dtoToEntity(pessoaDto);
        pessoaRepository.save(pessoa);
    }
}
