package com.deliverytech.delivery_api.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

import jakarta.validation.constraints.NotNull;

@Data
@Schema(description = "DTO para requisição de pedidos",
        title = "Pedido Request DTO")
public class PedidoRequestDTO {

    @Schema(description = "Número do pedido", example = "12345", required = true)
    @NotNull(message = "O número do pedido é obrigatório")
    private String numeroPedido;

    @Schema(description = "Data do pedido", example = "2023-10-01", required = true)
    @NotNull(message = "A data do pedido é obrigatória")
    private String dataPedido;

    @Schema(description = "Valor total do pedido", example = "99.99", required = true)
    @NotNull(message = "O valor do pedido é obrigatório")
    private BigDecimal valorTotal;

    @Schema(description = "Observações do pedido", example = "Não colocar cebola")
    private String observacoes;

    @Schema(description = "Status do pedido", example = "PENDENTE", required = true)
    @NotNull(message = "O status do pedido é obrigatório")
    private Long clienteId;

    @Schema(description = "ID do restaurante", example = "1", required = true)
    @NotNull(message = "O restaurante é obrigatório")
    private Long restauranteId;

    @Schema(description = "Endereço de entrega do pedido", example = "Rua das Flores, 123")
    private String enderecoEntrega;

    @Schema(description = "Lista de itens do pedido", required = true)
    @NotNull(message = "Os itens são obrigatórios")
    private List<ItemPedidoRequestDTO> itens;

}