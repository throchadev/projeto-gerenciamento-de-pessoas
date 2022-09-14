package br.com.throchadev.projetogerenciamentodepessoas.dto;

import br.com.throchadev.projetogerenciamentodepessoas.validation.PessoaGroupSequenceProvider;
import br.com.throchadev.projetogerenciamentodepessoas.validation.PessoaFisica;
import br.com.throchadev.projetogerenciamentodepessoas.validation.PessoaJuridica;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;
import org.hibernate.validator.group.GroupSequenceProvider;

import javax.validation.constraints.NotBlank;

@Data
@GroupSequenceProvider(value = PessoaGroupSequenceProvider.class)
public class PessoaDto {

    @NotBlank(message = "Nome é obrigatório")
    @ApiModelProperty(position = 1)
    private String nome;

    @NotBlank(message = "CPF/CNPJ é obrigatório")
    @CPF(groups = PessoaFisica.class)
    @CNPJ(groups = PessoaJuridica.class)
    @ApiModelProperty(position = 2)
    private String identificador;

    @NotBlank(message = "Favor informar o tipo de documento")
    @ApiModelProperty(position = 3)
    private String tipoIdentificador;
}
