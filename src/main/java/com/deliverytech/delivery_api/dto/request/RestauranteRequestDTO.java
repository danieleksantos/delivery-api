package com.deliverytech.delivery_api.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Schema(
    description = "Dados necessários para criar ou atualizar um restaurante",
    title = "Restaurante Request DTO")
public class RestauranteRequestDTO {

    @Schema(description = "Nome do restaurante", example = "Pizzaria Express", required = true)
    @NotNull(message = "O nome do restaurante é obrigatório")
    @Size(min = 3, max = 100, message = "O nome do restaurante deve ter entre 3 e 100 caracteres")
    private String nome;

    @Schema(description = "Descrição do restaurante", example = "Melhores pizzas da cidade", required = true)
    @NotNull(message = "A categoria do restaurante é obrigatória")
    private String categoria;

    @Schema(description = "Endereço do restaurante", example = "Rua das Flores, 123", required = true)
    @NotNull(message = "O endereço do restaurante é obrigatório")
    private String endereco;

    @Schema(description = "Telefone do restaurante", example = "+5511999999999", required = true)
    @Pattern(regexp = "^\\+?[0-9]{10,15}$", message = "O telefone deve ser um número válido com 10 a 15 dígitos, podendo iniciar com '+'")
    private String telefone;

    @Schema(description = "Taxa de entrega do restaurante", example = "5.00", required = true)
    @NotNull(message = "A taxa de entrega do restaurante é obrigatória")
    private BigDecimal taxaEntrega;

    @Schema(description = "Avaliação do restaurante", example = "4.5")
    private BigDecimal avaliacao;

    @Schema(description = "Status do restaurante", example = "true", required = true)
    @NotNull(message = "O status do restaurante é obrigatório")
    private Boolean ativo = true;

    public Boolean isAtivo() {
        return ativo != null ? ativo : true; // Retorna true se ativo for null
    }
}