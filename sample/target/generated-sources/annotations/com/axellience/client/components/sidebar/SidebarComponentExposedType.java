package com.axellience.client.components.sidebar;

import com.axellience.vuegwt.core.client.component.options.VueComponentOptions;
import com.axellience.vuegwt.core.client.tools.VueGWTTools;
import elemental2.core.Function;
import java.lang.Object;
import java.lang.String;
import javax.annotation.Generated;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

@Generated(
    value = "com.axellience.vuegwt.processors.component.ComponentExposedTypeGenerator",
    comments = "https://github.com/Axellience/vue-gwt"
)
public class SidebarComponentExposedType extends SidebarComponent {
  @JsProperty
  public Proto __proto__;

  @JsProperty
  public boolean vg$hrc_0;

  @JsMethod
  public void vg$created() {
    if (vg$hrc_0) return;
    vg$hrc_0 = true;
    vue().$options().proxyFields(this);
    VueGWTTools.initComponentInstanceFields(this, new SidebarComponent());
    Proto p = __proto__;
  }

  public static String getScopedCss() {
    return null;
  }

  private Function getRenderFunction() {
    String renderFunctionString = "with(this){return _m(0)}";
    return new Function(renderFunctionString);
  }

  private Function[] getStaticRenderFunctions() {
    return new Function[] { new Function("with(this){return _c('div',{staticClass:\"ui raised segment\"},[_c('div',{staticClass:\"ui list\"},[_c('div',{staticClass:\"item\"},[_c('div',{staticClass:\"header\"},[_v(\"New York City\")]),_v(\"\\n\\t\\t\\tA lovely city\\n\\t\\t\")]),_v(\" \"),_c('div',{staticClass:\"item\"},[_c('div',{staticClass:\"header\"},[_v(\"Chicago\")]),_v(\"\\n\\t\\t\\tAlso quite a lovely city\\n\\t\\t\")]),_v(\" \"),_c('div',{staticClass:\"item\"},[_c('div',{staticClass:\"header\"},[_v(\"Los Angeles\")]),_v(\"\\n\\t\\t\\tSometimes can be a lovely city\\n\\t\\t\")]),_v(\" \"),_c('div',{staticClass:\"item\"},[_c('div',{staticClass:\"header\"},[_v(\"San Francisco\")]),_v(\"\\n\\t\\t\\tWhat a lovely city\\n\\t\\t\")])])])}") };
  }

  public VueComponentOptions<SidebarComponent> getOptions() {
    VueComponentOptions<SidebarComponent> options = new VueComponentOptions<SidebarComponent>();
    Proto p = __proto__;
    options.setComponentExportedTypePrototype(p);
    options.addHookMethod("created", p.vg$created);
    options.initData(true, VueGWTTools.getFieldsName(this, () -> {
    } ));
    options.registerTemplateMethods();
    options.initRenderFunctions(getRenderFunction(), getStaticRenderFunctions());
    return options;
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  private static class Proto implements JsPropertyMap<Object> {
    public Function vg$created;
  }
}
