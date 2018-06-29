package com.storakle.shopify.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class TransactionList {
  @JsonProperty(value = JsonConstants.TRANSACTIONS)
  private List<Transaction> transactions;
}
