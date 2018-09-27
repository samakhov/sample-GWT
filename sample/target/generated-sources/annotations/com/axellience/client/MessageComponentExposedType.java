package com.axellience.client;

import com.axellience.vuegwt.core.client.component.options.VueComponentOptions;
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
public class MessageComponentExposedType extends MessageComponent {
  @JsProperty
  public Proto __proto__;

  @JsProperty
  public boolean vg$hrc_0;

  @JsMethod
  public void vg$created() {
    if (vg$hrc_0) return;
    vg$hrc_0 = true;
    vue().$options().proxyFields(this);
    VueGWTTools.initComponentInstanceFields(this, new MessageComponent());
    Proto p = __proto__;
  }

  public static String getScopedCss() {
    return null;
  }

  private Function getRenderFunction() {
    String renderFunctionString = "with(this){return _c('div',[_c('p',[_v(_s(exp$0()))]),_v(\" \"),_c('input',{directives:[{name:\"model\",rawName:\"v-model\",value:(message__vuegwt__vmodel),expression:\"message__vuegwt__vmodel\"}],attrs:{\"type\":\"text\"},domProps:{\"value\":(message__vuegwt__vmodel)},on:{\"input\":function($event){if($event.target.composing)return;message__vuegwt__vmodel=$event.target.value}}})])}";
    renderFunctionString = VueGWTTools.replaceVariableInRenderFunction(renderFunctionString, "message__vuegwt__vmodel", this, () -> this.message = null);
    return new Function(renderFunctionString);
  }

  private Function[] getStaticRenderFunctions() {
    return new Function[] {  };
  }

  @JsMethod
  @SuppressWarnings("unusable-by-js")
  public String exp$0() {
    // MessageComponent.html, line 2
    return VueGWTTools.templateExpressionToString(message);
  }

  public VueComponentOptions<MessageComponent> getOptions() {
    VueComponentOptions<MessageComponent> options = new VueComponentOptions<MessageComponent>();
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
    public Function vg$created;

    public Function exp$0;
  }
}
