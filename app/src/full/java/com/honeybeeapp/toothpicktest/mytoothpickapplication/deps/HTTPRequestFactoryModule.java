package com.honeybeeapp.toothpicktest.mytoothpickapplication.deps;

import dagger.Module;
import dagger.Provides;

/**
 * Created by djh on 2018/05/25.
 */

@Module
public class HTTPRequestFactoryModule {

  @Provides
  public IHTTPRequestFactory providesHTTPRequestFactory() {
      return new ProdHTTPRequestFactory();
  }
}
