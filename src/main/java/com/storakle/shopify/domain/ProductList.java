package com.storakle.shopify.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class ProductList {
  @JsonProperty(value = JsonConstants.PRODUCTS)
  private List<Product> products;
}
