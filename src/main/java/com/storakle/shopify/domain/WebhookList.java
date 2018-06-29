package com.storakle.shopify.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class WebhookList {
  @JsonProperty(value = JsonConstants.WEBHOOKS)
  private List<WebhookContent> webhooks;
}
