package com.storakle.shopify.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class OrderList {
  @JsonProperty(value = JsonConstants.ORDERS)
  private List<Order> orders;
}
