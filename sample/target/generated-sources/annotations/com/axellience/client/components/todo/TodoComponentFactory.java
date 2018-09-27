package com.axellience.client.components.todo;

import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vuegwt.core.client.component.options.VueComponentOptions;
import com.axellience.vuegwt.core.client.vue.VueComponentFactory;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * VueComponentFactory for Component {@link com.axellience.client.components.todo.TodoComponent} */
@Singleton
@Generated(
    value = "com.axellience.vuegwt.processors.component.factory.VueComponentFactoryGenerator",
    date = "Thu Sep 27 16:40:57 CEST 2018",
    comments = "https://github.com/Axellience/vue-gwt"
)
public final class TodoComponentFactory extends VueComponentFactory<TodoComponent> {
  private static TodoComponentFactory INSTANCE;

  @Inject
  protected TodoComponentFactory() {
  }

  @Override
  public String getComponentTagName() {
    return "todo";
  }

  @Inject
  protected void init() {
    VueComponentOptions<TodoComponent> componentOptions = new TodoComponentExposedType().getOptions();
    jsConstructor = Vue.extendJavaComponent(componentOptions);
  }

  public static TodoComponentFactory get() {
    if (INSTANCE == null) {
      INSTANCE = new TodoComponentFactory();
      INSTANCE.injectComponentCss(TodoComponentExposedType.getScopedCss());
      INSTANCE.init();}
    return INSTANCE;
  }
}
