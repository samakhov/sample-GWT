package com.axellience.client.components.johnsnow;

import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vuegwt.core.client.component.options.VueComponentOptions;
import com.axellience.vuegwt.core.client.vue.VueComponentFactory;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * VueComponentFactory for Component {@link com.axellience.client.components.johnsnow.JohnSnowComponent} */
@Singleton
@Generated(
    value = "com.axellience.vuegwt.processors.component.factory.VueComponentFactoryGenerator",
    date = "Thu Sep 27 15:19:59 CEST 2018",
    comments = "https://github.com/Axellience/vue-gwt"
)
public final class JohnSnowComponentFactory extends VueComponentFactory<JohnSnowComponent> {
  private static JohnSnowComponentFactory INSTANCE;

  @Inject
  protected JohnSnowComponentFactory() {
  }

  @Override
  public String getComponentTagName() {
    return "john-snow";
  }

  @Inject
  protected void init() {
    VueComponentOptions<JohnSnowComponent> componentOptions = new JohnSnowComponentExposedType().getOptions();
    jsConstructor = Vue.extendJavaComponent(componentOptions);
  }

  public static JohnSnowComponentFactory get() {
    if (INSTANCE == null) {
      INSTANCE = new JohnSnowComponentFactory();
      INSTANCE.injectComponentCss(JohnSnowComponentExposedType.getScopedCss());
      INSTANCE.init();}
    return INSTANCE;
  }
}
