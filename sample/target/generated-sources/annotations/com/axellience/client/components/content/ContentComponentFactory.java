package com.axellience.client.components.content;

import com.axellience.client.components.crud.CrudComponentFactory;
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
 * VueComponentFactory for Component {@link com.axellience.client.components.content.ContentComponent} */
@Singleton
@Generated(
    value = "com.axellience.vuegwt.processors.component.factory.VueComponentFactoryGenerator",
    date = "Fri Sep 28 17:11:25 CEST 2018",
    comments = "https://github.com/Axellience/vue-gwt"
)
public final class ContentComponentFactory extends VueComponentFactory<ContentComponent> {
  private static ContentComponentFactory INSTANCE;

  @Inject
  protected ContentComponentFactory() {
  }

  @Override
  public String getComponentTagName() {
    return "content";
  }

  @Inject
  protected void init(Provider<CrudComponentFactory> com_axellience_client_components_crud_CrudComponentFactory) {
    VueComponentOptions<ContentComponent> componentOptions = new ContentComponentExposedType().getOptions();
    jsConstructor = Vue.extendJavaComponent(componentOptions);
    JsPropertyMap<VueJsAsyncProvider<VueJsConstructor>> components = jsConstructor.getOptionsComponents();
    components.set(com_axellience_client_components_crud_CrudComponentFactory.get().getComponentTagName(), render -> render.accept(com_axellience_client_components_crud_CrudComponentFactory.get().getJsConstructor()));
  }

  public static ContentComponentFactory get() {
    if (INSTANCE == null) {
      INSTANCE = new ContentComponentFactory();
      INSTANCE.injectComponentCss(ContentComponentExposedType.getScopedCss());
      INSTANCE.init(() -> CrudComponentFactory.get());}
    return INSTANCE;
  }
}
