package com.storakle.shopify.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class CollectList {
  @JsonProperty(value = JsonConstants.COLLECTS)
  private List<Collect> collects;
}
