package com.axellience.client.components.sidebar;

import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vuegwt.core.client.component.options.VueComponentOptions;
import com.axellience.vuegwt.core.client.vue.VueComponentFactory;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * VueComponentFactory for Component {@link com.axellience.client.components.sidebar.SidebarComponent} */
@Singleton
@Generated(
    value = "com.axellience.vuegwt.processors.component.factory.VueComponentFactoryGenerator",
    date = "Fri Sep 28 14:26:04 CEST 2018",
    comments = "https://github.com/Axellience/vue-gwt"
)
public final class SidebarComponentFactory extends VueComponentFactory<SidebarComponent> {
  private static SidebarComponentFactory INSTANCE;

  @Inject
  protected SidebarComponentFactory() {
  }

  @Override
  public String getComponentTagName() {
    return "sidebar";
  }

  @Inject
  protected void init() {
    VueComponentOptions<SidebarComponent> componentOptions = new SidebarComponentExposedType().getOptions();
    jsConstructor = Vue.extendJavaComponent(componentOptions);
  }

  public static SidebarComponentFactory get() {
    if (INSTANCE == null) {
      INSTANCE = new SidebarComponentFactory();
      INSTANCE.injectComponentCss(SidebarComponentExposedType.getScopedCss());
      INSTANCE.init();}
    return INSTANCE;
  }
}
