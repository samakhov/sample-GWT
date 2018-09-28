package com.axellience.client.components.crudelement;

import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vuegwt.core.client.component.options.VueComponentOptions;
import com.axellience.vuegwt.core.client.vue.VueComponentFactory;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * VueComponentFactory for Component {@link com.axellience.client.components.crudelement.CrudElementComponent} */
@Singleton
@Generated(
    value = "com.axellience.vuegwt.processors.component.factory.VueComponentFactoryGenerator",
    date = "Fri Sep 28 15:17:54 CEST 2018",
    comments = "https://github.com/Axellience/vue-gwt"
)
public final class CrudElementComponentFactory extends VueComponentFactory<CrudElementComponent> {
  private static CrudElementComponentFactory INSTANCE;

  @Inject
  protected CrudElementComponentFactory() {
  }

  @Override
  public String getComponentTagName() {
    return "crud-element";
  }

  @Inject
  protected void init() {
    VueComponentOptions<CrudElementComponent> componentOptions = new CrudElementComponentExposedType().getOptions();
    jsConstructor = Vue.extendJavaComponent(componentOptions);
  }

  public static CrudElementComponentFactory get() {
    if (INSTANCE == null) {
      INSTANCE = new CrudElementComponentFactory();
      INSTANCE.injectComponentCss(CrudElementComponentExposedType.getScopedCss());
      INSTANCE.init();}
    return INSTANCE;
  }
}
