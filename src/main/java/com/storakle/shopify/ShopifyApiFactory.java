package com.storakle.shopify;

import com.storakle.shopify.interceptors.BasicAuthRequestInterceptor;
import com.storakle.shopify.interceptors.ContentTypeRequestInterceptor;
import feign.Feign;
import feign.RequestInterceptor;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import java.util.ArrayList;

public class ShopifyApiFactory {
  public static ShopifyApiClient of(String apiKey, String password, String myShopifyUrl) {
    ArrayList<RequestInterceptor> requestInterceptors = new ArrayList<>();
    requestInterceptors.add(new BasicAuthRequestInterceptor(apiKey, password));
    requestInterceptors.add(new ContentTypeRequestInterceptor());

    return Feign.builder()
        .decoder(new JacksonDecoder())
        .encoder(new JacksonEncoder())
        .requestInterceptors(requestInterceptors)
        //        .logger(new Logger.JavaLogger().appendToFile("http.log"))
        //        .logLevel(Logger.Level.FULL)
        .target(ShopifyApiClient.class, myShopifyUrl);
  }
}
