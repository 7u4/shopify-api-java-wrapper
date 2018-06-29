package com.storakle.shopify.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class CustomCollectionList {
  @JsonProperty(value = JsonConstants.CUSTOM_COLLECTIONS)
  private List<CustomCollection> customCollections;
}
