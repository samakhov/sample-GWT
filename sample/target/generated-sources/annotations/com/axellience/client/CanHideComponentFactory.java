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
 * VueComponentFactory for Component {@link com.axellience.client.CanHideComponent} */
@Singleton
@Generated(
    value = "com.axellience.vuegwt.processors.component.factory.VueComponentFactoryGenerator",
    date = "Thu Sep 27 14:19:44 CEST 2018",
    comments = "https://github.com/Axellience/vue-gwt"
)
public final class CanHideComponentFactory extends VueComponentFactory<CanHideComponent> {
  private static CanHideComponentFactory INSTANCE;

  @Inject
  protected CanHideComponentFactory() {
  }

  @Override
  public String getComponentTagName() {
    return "can-hide";
  }

  @Inject
  protected void init() {
    VueComponentOptions<CanHideComponent> componentOptions = new CanHideComponentExposedType().getOptions();
    jsConstructor = Vue.extendJavaComponent(componentOptions);
  }

  public static CanHideComponentFactory get() {
    if (INSTANCE == null) {
      INSTANCE = new CanHideComponentFactory();
      INSTANCE.injectComponentCss(CanHideComponentExposedType.getScopedCss());
      INSTANCE.init();}
    return INSTANCE;
  }
}
