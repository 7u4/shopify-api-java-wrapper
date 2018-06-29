package com.storakle.shopify.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class CustomerList {
  @JsonProperty(value = JsonConstants.CUSTOMERS)
  private List<Customer> customers;
}
