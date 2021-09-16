package com.axelor.guice.servlet.module;

import com.axelor.guice.servlet.Servlet1;
import com.axelor.guice.servlet.Servlet2;
import com.google.inject.servlet.ServletModule;

public class MyServletModule extends ServletModule {

  @Override
  protected void configureServlets() {
    serve("/").with(Servlet1.class);
    serve("/test").with(Servlet2.class);
  }
}
