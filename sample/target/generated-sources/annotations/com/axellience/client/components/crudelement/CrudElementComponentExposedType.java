package com.axellience.client.components.crudelement;

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
public class CrudElementComponentExposedType extends CrudElementComponent {
  @JsProperty
  public Proto __proto__;

  @JsProperty
  public boolean vg$hrc_0;

  @JsMethod
  public void vg$created() {
    if (vg$hrc_0) return;
    vg$hrc_0 = true;
    vue().$options().proxyFields(this);
    VueGWTTools.initComponentInstanceFields(this, new CrudElementComponent());
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
    return new Function[] { new Function("with(this){return _c('html',[_c('head',[_c('meta',{attrs:{\"charset\":\"UTF-8\"}}),_v(\" \"),_c('title',[_v(\"Insert title here\")])]),_v(\" \"),_c('body')])}") };
  }

  public VueComponentOptions<CrudElementComponent> getOptions() {
    VueComponentOptions<CrudElementComponent> options = new VueComponentOptions<CrudElementComponent>();
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
