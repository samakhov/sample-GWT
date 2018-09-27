package com.axellience.client.components.reversed;

import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vuegwt.core.client.component.options.VueComponentOptions;
import com.axellience.vuegwt.core.client.vue.VueComponentFactory;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * VueComponentFactory for Component {@link com.axellience.client.components.reversed.ReverseComponent} */
@Singleton
@Generated(
    value = "com.axellience.vuegwt.processors.component.factory.VueComponentFactoryGenerator",
    date = "Thu Sep 27 14:37:49 CEST 2018",
    comments = "https://github.com/Axellience/vue-gwt"
)
public final class ReverseComponentFactory extends VueComponentFactory<ReverseComponent> {
  private static ReverseComponentFactory INSTANCE;

  @Inject
  protected ReverseComponentFactory() {
  }

  @Override
  public String getComponentTagName() {
    return "reverse";
  }

  @Inject
  protected void init() {
    VueComponentOptions<ReverseComponent> componentOptions = new ReverseComponentExposedType().getOptions();
    jsConstructor = Vue.extendJavaComponent(componentOptions);
  }

  public static ReverseComponentFactory get() {
    if (INSTANCE == null) {
      INSTANCE = new ReverseComponentFactory();
      INSTANCE.injectComponentCss(ReverseComponentExposedType.getScopedCss());
      INSTANCE.init();}
    return INSTANCE;
  }
}
