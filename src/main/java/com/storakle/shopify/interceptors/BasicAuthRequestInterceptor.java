package com.storakle.shopify.interceptors;

import static feign.Util.checkNotNull;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import jodd.util.Base64;

public class BasicAuthRequestInterceptor implements RequestInterceptor {
  private final String apiKey;
  private final String password;
  private final String token;

  /**
   * Creates an interceptor that authenticates all requests with the specified accessToken
   *
   * @param apiKey the apiKey to use for authentication
   * @param password the apiKey password to use for authentication
   */
  public BasicAuthRequestInterceptor(String apiKey, String password) {
    checkNotNull(apiKey, "apiKey");
    checkNotNull(password, "password");
    this.apiKey = apiKey;
    this.password = password;
    this.token = Base64.encodeToString(apiKey + ":" + password);
  }

  @Override
  public void apply(RequestTemplate template) {
    template.header("Authorization", "Basic " + this.token);
  }
}
