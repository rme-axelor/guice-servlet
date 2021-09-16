package com.axelor.guice.servlet.listner;

import com.axelor.guice.module.XGuiceConfig;
import com.axelor.guice.servlet.module.MyServletModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class ServletListner extends GuiceServletContextListener {

  @Override
  protected Injector getInjector() {
    return Guice.createInjector(new MyServletModule(), new XGuiceConfig());
  }
}
