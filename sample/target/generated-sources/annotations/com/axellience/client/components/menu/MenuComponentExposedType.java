package com.axellience.client.components.menu;

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
public class MenuComponentExposedType extends MenuComponent {
  @JsProperty
  public Proto __proto__;

  @JsProperty
  public boolean vg$hrc_0;

  @JsMethod
  public void vg$created() {
    if (vg$hrc_0) return;
    vg$hrc_0 = true;
    vue().$options().proxyFields(this);
    VueGWTTools.initComponentInstanceFields(this, new MenuComponent());
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
    return new Function[] { new Function("with(this){return _c('div',{staticClass:\"ui pointing menu\"},[_c('a',{staticClass:\"active item\"},[_v(\"\\n    Home\\n  \")]),_v(\" \"),_c('a',{staticClass:\"item\"},[_v(\"\\n    Messages\\n  \")]),_v(\" \"),_c('a',{staticClass:\"item\"},[_v(\"\\n    Friends\\n  \")]),_v(\" \"),_c('div',{staticClass:\"right menu\"},[_c('div',{staticClass:\"item\"},[_c('div',{staticClass:\"ui transparent icon input\"},[_c('input',{attrs:{\"type\":\"text\",\"placeholder\":\"Search...\"}}),_v(\" \"),_c('i',{staticClass:\"search link icon\"})])])])])}") };
  }

  public VueComponentOptions<MenuComponent> getOptions() {
    VueComponentOptions<MenuComponent> options = new VueComponentOptions<MenuComponent>();
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
