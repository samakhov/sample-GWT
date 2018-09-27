package com.axellience.client.components.johnsnow;

import com.axellience.vuegwt.core.client.component.options.VueComponentOptions;
import com.axellience.vuegwt.core.client.component.options.watch.WatchOptions;
import com.axellience.vuegwt.core.client.tools.FieldsExposer;
import com.axellience.vuegwt.core.client.tools.VueGWTTools;
import elemental2.core.Function;
import java.lang.Object;
import java.lang.String;
import java.lang.SuppressWarnings;
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
public class JohnSnowComponentExposedType extends JohnSnowComponent {
  @JsProperty
  public Proto __proto__;

  @JsProperty
  public boolean vg$hrc_0;

  @JsMethod
  @SuppressWarnings("unusable-by-js")
  public void vg$e0(String newValue, String oldValue) {
    super.watchMessage(newValue, oldValue);
  }

  @JsMethod
  public Object vg$e1() {
    return message;
  }

  @JsMethod
  public void vg$created() {
    if (vg$hrc_0) return;
    vg$hrc_0 = true;
    vue().$options().proxyFields(this);
    VueGWTTools.initComponentInstanceFields(this, new JohnSnowComponent());
    Proto p = __proto__;
    vue().$watch(p.vg$e1, p.vg$e0, WatchOptions.of(false, false));
  }

  public static String getScopedCss() {
    return null;
  }

  private Function getRenderFunction() {
    String renderFunctionString = "with(this){return _c('div',{attrs:{\"id\":\"demo\"}},[_v(_s(exp$0()))])}";
    return new Function(renderFunctionString);
  }

  private Function[] getStaticRenderFunctions() {
    return new Function[] {  };
  }

  @JsMethod
  @SuppressWarnings("unusable-by-js")
  public String exp$0() {
    // JohnSnowComponent.html, line 1
    return VueGWTTools.templateExpressionToString(message);
  }

  public VueComponentOptions<JohnSnowComponent> getOptions() {
    VueComponentOptions<JohnSnowComponent> options = new VueComponentOptions<JohnSnowComponent>();
    Proto p = __proto__;
    options.setComponentExportedTypePrototype(p);
    options.addHookMethod("created", p.vg$created);
    options.initData(true, VueGWTTools.getFieldsName(this, () -> {
      this.message = null;
    } ));
    options.registerTemplateMethods(p.exp$0);
    options.initRenderFunctions(getRenderFunction(), getStaticRenderFunctions());
    return options;
  }

  @JsMethod
  void vg$ef() {
    this.message = FieldsExposer.v();
    FieldsExposer.e(message);
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  private static class Proto implements JsPropertyMap<Object> {
    public Function vg$e0;

    public Function vg$e1;

    public Function vg$created;

    public Function exp$0;
  }
}
