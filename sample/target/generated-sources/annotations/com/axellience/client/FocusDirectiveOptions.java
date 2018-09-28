package com.axellience.client;

import com.axellience.vuegwt.core.client.directive.options.VueDirectiveOptions;
import jsinterop.annotations.JsType;

/**
 * VueComponent Directive Options for directive {@link "com.axellience.client.FocusDirective"} */
@JsType
public final class FocusDirectiveOptions extends VueDirectiveOptions {
  public FocusDirectiveOptions() {
    this.vuegwt$javaDirectiveInstance = new FocusDirective();
    this.copyHooks();
  }
}
