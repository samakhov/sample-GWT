package com.axellience.client.components.todolist;

import com.axellience.client.components.todo.TodoComponentFactory;
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
 * VueComponentFactory for Component {@link com.axellience.client.components.todolist.TodoListComponent} */
@Singleton
@Generated(
    value = "com.axellience.vuegwt.processors.component.factory.VueComponentFactoryGenerator",
    date = "Fri Sep 28 11:13:48 CEST 2018",
    comments = "https://github.com/Axellience/vue-gwt"
)
public final class TodoListComponentFactory extends VueComponentFactory<TodoListComponent> {
  private static TodoListComponentFactory INSTANCE;

  @Inject
  protected TodoListComponentFactory() {
  }

  @Override
  public String getComponentTagName() {
    return "todo-list";
  }

  @Inject
  protected void init(Provider<TodoComponentFactory> com_axellience_client_components_todo_TodoComponentFactory) {
    VueComponentOptions<TodoListComponent> componentOptions = new TodoListComponentExposedType().getOptions();
    jsConstructor = Vue.extendJavaComponent(componentOptions);
    JsPropertyMap<VueJsAsyncProvider<VueJsConstructor>> components = jsConstructor.getOptionsComponents();
    components.set(com_axellience_client_components_todo_TodoComponentFactory.get().getComponentTagName(), render -> render.accept(com_axellience_client_components_todo_TodoComponentFactory.get().getJsConstructor()));
  }

  public static TodoListComponentFactory get() {
    if (INSTANCE == null) {
      INSTANCE = new TodoListComponentFactory();
      INSTANCE.injectComponentCss(TodoListComponentExposedType.getScopedCss());
      INSTANCE.init(() -> TodoComponentFactory.get());}
    return INSTANCE;
  }
}
