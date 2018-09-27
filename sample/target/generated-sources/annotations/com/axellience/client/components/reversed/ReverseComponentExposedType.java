package com.axellience.client.components.reversed;

import com.axellience.vuegwt.core.client.component.options.VueComponentOptions;
import com.axellience.vuegwt.core.client.component.options.computed.ComputedKind;
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
public class ReverseComponentExposedType extends ReverseComponent {
  @JsProperty
  public Proto __proto__;

  @JsProperty
  protected String vg$c_reversedMessage;

  @JsProperty
  public boolean vg$hrc_0;

  @JsMethod
  @SuppressWarnings("unusable-by-js")
  public String vg$e0() {
    String result = super.getReversedMessage();
    return result;
  }

  @JsMethod
  public void vg$created() {
    if (vg$hrc_0) return;
    vg$hrc_0 = true;
    vue().$options().proxyFields(this);
    VueGWTTools.initComponentInstanceFields(this, new ReverseComponent());
    Proto p = __proto__;
  }

  public static String getScopedCss() {
    return null;
  }

  private Function getRenderFunction() {
    String renderFunctionString = "with(this){return _c('div',{attrs:{\"id\":\"example\"}},[_c('p',[_v(\"Original message: \\\"\"+_s(exp$0())+\"\\\"\")]),_v(\" \"),_c('p',[_v(\"Computed reversed message: \\\"\"+_s(exp$1())+\"\\\"\")])])}";
    return new Function(renderFunctionString);
  }

  private Function[] getStaticRenderFunctions() {
    return new Function[] {  };
  }

  @JsMethod
  @SuppressWarnings("unusable-by-js")
  public String exp$0() {
    // ReverseComponent.html, line 2
    return VueGWTTools.templateExpressionToString(message);
  }

  @JsMethod
  @SuppressWarnings("unusable-by-js")
  public String exp$1() {
    // ReverseComponent.html, line 3
    return VueGWTTools.templateExpressionToString(vg$c_reversedMessage);
  }

  public VueComponentOptions<ReverseComponent> getOptions() {
    VueComponentOptions<ReverseComponent> options = new VueComponentOptions<ReverseComponent>();
    Proto p = __proto__;
    options.setComponentExportedTypePrototype(p);
    options.addJavaComputed(p.vg$e0, VueGWTTools.getFieldName(this, () -> this.vg$c_reversedMessage = null), ComputedKind.GETTER);
    options.addHookMethod("created", p.vg$created);
    options.initData(true, VueGWTTools.getFieldsName(this, () -> {
      this.message = null;
    } ));
    options.registerTemplateMethods(p.exp$0, p.exp$1);
    options.initRenderFunctions(getRenderFunction(), getStaticRenderFunctions());
    return options;
  }

  @JsMethod
  void vg$ef() {
    this.message = FieldsExposer.v();
    this.vg$c_reversedMessage = FieldsExposer.v();
    FieldsExposer.e(message,vg$c_reversedMessage);
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  private static class Proto implements JsPropertyMap<Object> {
    public Function vg$e0;

    public Function vg$created;

    public Function exp$0;

    public Function exp$1;
  }
}
