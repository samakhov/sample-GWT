package com.axellience.client.components.submit;

import com.axellience.client.components.todolist.TodoListComponentFactory;
import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vuegwt.core.client.component.options.VueComponentOptions;
import com.axellience.vuegwt.core.client.vue.VueComponentFactory;
import com.axellience.vuegwt.core.client.vue.VueJsAsyncProvider;
import com.axellience.vuegwt.core.client.vue.VueJsConstructor;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import jsinterop.base.JsPropertyMap;

/**
 * VueComponentFactory for Component {@link com.axellience.client.components.submit.SubmitComponent} */
@Singleton
@Generated(
    value = "com.axellience.vuegwt.processors.component.factory.VueComponentFactoryGenerator",
    date = "Fri Sep 28 10:20:13 CEST 2018",
    comments = "https://github.com/Axellience/vue-gwt"
)
public final class SubmitComponentFactory extends VueComponentFactory<SubmitComponent> {
  private static SubmitComponentFactory INSTANCE;

  @Inject
  protected SubmitComponentFactory() {
  }

  @Override
  public String getComponentTagName() {
    return "submit";
  }

  @Inject
  protected void init(Provider<TodoListComponentFactory> com_axellience_client_components_todolist_TodoListComponentFactory) {
    VueComponentOptions<SubmitComponent> componentOptions = new SubmitComponentExposedType().getOptions();
    jsConstructor = Vue.extendJavaComponent(componentOptions);
    JsPropertyMap<VueJsAsyncProvider<VueJsConstructor>> components = jsConstructor.getOptionsComponents();
    components.set(com_axellience_client_components_todolist_TodoListComponentFactory.get().getComponentTagName(), render -> render.accept(com_axellience_client_components_todolist_TodoListComponentFactory.get().getJsConstructor()));
  }

  public static SubmitComponentFactory get() {
    if (INSTANCE == null) {
      INSTANCE = new SubmitComponentFactory();
      INSTANCE.injectComponentCss(SubmitComponentExposedType.getScopedCss());
      INSTANCE.init(() -> TodoListComponentFactory.get());}
    return INSTANCE;
  }
}
