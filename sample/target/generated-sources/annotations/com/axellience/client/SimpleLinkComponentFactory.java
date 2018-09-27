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
 * VueComponentFactory for Component {@link com.axellience.client.SimpleLinkComponent} */
@Singleton
@Generated(
    value = "com.axellience.vuegwt.processors.component.factory.VueComponentFactoryGenerator",
    date = "Thu Sep 27 14:20:02 CEST 2018",
    comments = "https://github.com/Axellience/vue-gwt"
)
public final class SimpleLinkComponentFactory extends VueComponentFactory<SimpleLinkComponent> {
  private static SimpleLinkComponentFactory INSTANCE;

  @Inject
  protected SimpleLinkComponentFactory() {
  }

  @Override
  public String getComponentTagName() {
    return "simple-link";
  }

  @Inject
  protected void init() {
    VueComponentOptions<SimpleLinkComponent> componentOptions = new SimpleLinkComponentExposedType().getOptions();
    jsConstructor = Vue.extendJavaComponent(componentOptions);
  }

  public static SimpleLinkComponentFactory get() {
    if (INSTANCE == null) {
      INSTANCE = new SimpleLinkComponentFactory();
      INSTANCE.injectComponentCss(SimpleLinkComponentExposedType.getScopedCss());
      INSTANCE.init();}
    return INSTANCE;
  }
}
