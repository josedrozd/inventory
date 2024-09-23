package com.drozd.inventory.model.dtos;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemDTO {

    @Valid @NotBlank(message = "Name can not be blank.")
    private String name;
    @Valid @NotNull @Min(value = 0, message = "Quantity can not be negative.")
    private Long quantity;

}
