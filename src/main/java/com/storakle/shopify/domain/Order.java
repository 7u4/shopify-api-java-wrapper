package com.storakle.shopify.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.storakle.shopify.jackson.FlexDateDeserializer;
import com.storakle.shopify.jackson.FlexDateSerializer;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import lombok.Data;

@Data
public class Order {
  @JsonProperty(value = JsonConstants.ID)
  private long id;

  @JsonProperty(value = JsonConstants.NAME)
  private String name;

  @JsonProperty(value = JsonConstants.NUMBER)
  private long number;

  @JsonProperty(value = JsonConstants.ORDER_NUMBER)
  private long orderNumber;

  @JsonProperty(value = JsonConstants.FINANCIAL_STATUS)
  private FinancialStatus financialStatus;

  @JsonProperty(value = JsonConstants.FULLFILLMENT_STATUS)
  private FullfillmentStatus fullfillmentStatus;

  @JsonProperty(value = JsonConstants.SHIPPING_ADDRESS)
  private Address shippingAddress;

  @JsonProperty(value = JsonConstants.CREATED_AT)
  @JsonDeserialize(using = FlexDateDeserializer.class)
  @JsonSerialize(using = FlexDateSerializer.class)
  private Date createdAt;

  @JsonProperty(value = JsonConstants.PROCESSED_AT)
  @JsonDeserialize(using = FlexDateDeserializer.class)
  @JsonSerialize(using = FlexDateSerializer.class)
  private Date processedAt;
}
