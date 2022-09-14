package br.com.throchadev.projetogerenciamentodepessoas.validation;

import br.com.throchadev.projetogerenciamentodepessoas.dto.PessoaDto;
import org.hibernate.validator.spi.group.DefaultGroupSequenceProvider;

import java.util.ArrayList;
import java.util.List;

public class PessoaGroupSequenceProvider implements DefaultGroupSequenceProvider<PessoaDto> {

    @Override
    public List<Class<?>> getValidationGroups(PessoaDto pessoaDto) {
        List<Class<?>> groups = new ArrayList<>();
        groups.add(PessoaDto.class);
        if (pessoaDto != null) {
            if ("CPF".equalsIgnoreCase(pessoaDto.getTipoIdentificador())) {
                groups.add(PessoaFisica.class);
            } else if ("CNPJ".equalsIgnoreCase(pessoaDto.getTipoIdentificador())) {
                groups.add(PessoaJuridica.class);
            }
        }
        return groups;
    }
}
