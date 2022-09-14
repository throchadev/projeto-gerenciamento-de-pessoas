package br.com.throchadev.projetogerenciamentodepessoas.controller;

import br.com.throchadev.projetogerenciamentodepessoas.dto.PessoaDto;
import br.com.throchadev.projetogerenciamentodepessoas.service.PessoaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    @ApiOperation(value = "Salva uma Pessoa")
    @ResponseStatus(HttpStatus.CREATED)
    public void salvarPessoa(@Valid @RequestBody PessoaDto pessoaDto){
        pessoaService.salvarPessoa(pessoaDto);
    }
}
