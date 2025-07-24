package com.deliverytech.delivery_api.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(description = "DTO para requisição de criação ou atualização de cliente",
        title = "Cliente Request DTO")
public class ClienteRequestDTO {

    @Schema(description = "Nome do cliente", example = "João da Silva", required = true)
    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @Schema(description = "Email do cliente", example = "email@email.com", required = true)
    @NotBlank(message = "O email é obrigatório")
    @Email(message = "O email deve ser válido")
    private String email;

    @Schema(description = "Telefone do cliente", example = "+5511999999999", required = true)
    @Pattern(regexp = "^\\+?[0-9]{10,15}$", message = "O telefone deve ser um número válido com 10 a 15 dígitos, podendo iniciar com '+'")
    private String telefone;

    @Schema(description = "Endereço do cliente", example = "Rua das Flores, 123", required = true)
    @NotBlank(message = "O endereço é obrigatório")
    private String endereco;
    
}