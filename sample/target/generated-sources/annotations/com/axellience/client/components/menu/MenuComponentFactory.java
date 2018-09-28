package com.axellience.client.components.menu;

import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vuegwt.core.client.component.options.VueComponentOptions;
import com.axellience.vuegwt.core.client.vue.VueComponentFactory;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * VueComponentFactory for Component {@link com.axellience.client.components.menu.MenuComponent} */
@Singleton
@Generated(
    value = "com.axellience.vuegwt.processors.component.factory.VueComponentFactoryGenerator",
    date = "Fri Sep 28 14:14:25 CEST 2018",
    comments = "https://github.com/Axellience/vue-gwt"
)
public final class MenuComponentFactory extends VueComponentFactory<MenuComponent> {
  private static MenuComponentFactory INSTANCE;

  @Inject
  protected MenuComponentFactory() {
  }

  @Override
  public String getComponentTagName() {
    return "menu";
  }

  @Inject
  protected void init() {
    VueComponentOptions<MenuComponent> componentOptions = new MenuComponentExposedType().getOptions();
    jsConstructor = Vue.extendJavaComponent(componentOptions);
  }

  public static MenuComponentFactory get() {
    if (INSTANCE == null) {
      INSTANCE = new MenuComponentFactory();
      INSTANCE.injectComponentCss(MenuComponentExposedType.getScopedCss());
      INSTANCE.init();}
    return INSTANCE;
  }
}
