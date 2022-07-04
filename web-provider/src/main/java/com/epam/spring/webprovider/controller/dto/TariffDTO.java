package com.epam.spring.webprovider.controller.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class TariffDTO {

    private Integer id;

    private String name;

    private String description;

    private String imageLink;

    private BigDecimal price;

    private CategoryDTO categoryDTO;
}
