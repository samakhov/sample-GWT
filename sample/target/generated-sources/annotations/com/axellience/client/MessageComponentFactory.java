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
 * VueComponentFactory for Component {@link com.axellience.client.MessageComponent} */
@Singleton
@Generated(
    value = "com.axellience.vuegwt.processors.component.factory.VueComponentFactoryGenerator",
    date = "Thu Sep 27 14:20:21 CEST 2018",
    comments = "https://github.com/Axellience/vue-gwt"
)
public final class MessageComponentFactory extends VueComponentFactory<MessageComponent> {
  private static MessageComponentFactory INSTANCE;

  @Inject
  protected MessageComponentFactory() {
  }

  @Override
  public String getComponentTagName() {
    return "message";
  }

  @Inject
  protected void init() {
    VueComponentOptions<MessageComponent> componentOptions = new MessageComponentExposedType().getOptions();
    jsConstructor = Vue.extendJavaComponent(componentOptions);
  }

  public static MessageComponentFactory get() {
    if (INSTANCE == null) {
      INSTANCE = new MessageComponentFactory();
      INSTANCE.injectComponentCss(MessageComponentExposedType.getScopedCss());
      INSTANCE.init();}
    return INSTANCE;
  }
}
