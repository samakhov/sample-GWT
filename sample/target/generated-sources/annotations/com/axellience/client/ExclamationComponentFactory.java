package com.axellience.client;

import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vuegwt.core.client.component.options.VueComponentOptions;
import com.axellience.vuegwt.core.client.vue.VueComponentFactory;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * VueComponentFactory for Component {@link com.axellience.client.ExclamationComponent} */
@Singleton
@Generated(
    value = "com.axellience.vuegwt.processors.component.factory.VueComponentFactoryGenerator",
    date = "Thu Sep 27 14:20:12 CEST 2018",
    comments = "https://github.com/Axellience/vue-gwt"
)
public final class ExclamationComponentFactory extends VueComponentFactory<ExclamationComponent> {
  private static ExclamationComponentFactory INSTANCE;

  @Inject
  protected ExclamationComponentFactory() {
  }

  @Override
  public String getComponentTagName() {
    return "exclamation";
  }

  @Inject
  protected void init() {
    VueComponentOptions<ExclamationComponent> componentOptions = new ExclamationComponentExposedType().getOptions();
    jsConstructor = Vue.extendJavaComponent(componentOptions);
  }

  public static ExclamationComponentFactory get() {
    if (INSTANCE == null) {
      INSTANCE = new ExclamationComponentFactory();
      INSTANCE.injectComponentCss(ExclamationComponentExposedType.getScopedCss());
      INSTANCE.init();}
    return INSTANCE;
  }
}
