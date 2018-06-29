package com.storakle.shopify.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class SmartCollectionList {
  @JsonProperty(value = JsonConstants.SMART_COLLECTIONS)
  private List<SmartCollection> smartCollections;
}
