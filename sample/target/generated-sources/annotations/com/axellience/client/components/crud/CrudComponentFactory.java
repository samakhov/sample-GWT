package com.axellience.client.components.crud;

import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vuegwt.core.client.component.options.VueComponentOptions;
import com.axellience.vuegwt.core.client.vue.VueComponentFactory;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * VueComponentFactory for Component {@link com.axellience.client.components.crud.CrudComponent} */
@Singleton
@Generated(
    value = "com.axellience.vuegwt.processors.component.factory.VueComponentFactoryGenerator",
    date = "Fri Sep 28 17:24:08 CEST 2018",
    comments = "https://github.com/Axellience/vue-gwt"
)
public final class CrudComponentFactory extends VueComponentFactory<CrudComponent> {
  private static CrudComponentFactory INSTANCE;

  @Inject
  protected CrudComponentFactory() {
  }

  @Override
  public String getComponentTagName() {
    return "crud";
  }

  @Inject
  protected void init() {
    VueComponentOptions<CrudComponent> componentOptions = new CrudComponentExposedType().getOptions();
    jsConstructor = Vue.extendJavaComponent(componentOptions);
  }

  public static CrudComponentFactory get() {
    if (INSTANCE == null) {
      INSTANCE = new CrudComponentFactory();
      INSTANCE.injectComponentCss(CrudComponentExposedType.getScopedCss());
      INSTANCE.init();}
    return INSTANCE;
  }
}
