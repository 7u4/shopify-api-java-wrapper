package com.storakle.shopify.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class ProductVariant {
  @JsonProperty(value = JsonConstants.ID)
  private long id;

  @JsonProperty(value = JsonConstants.TITLE)
  private String title;

  @JsonProperty(value = JsonConstants.PRICE)
  private BigDecimal price;

  @JsonProperty(value = JsonConstants.COMPARE_AT_PRICE)
  private BigDecimal compareAtPrice;
}
