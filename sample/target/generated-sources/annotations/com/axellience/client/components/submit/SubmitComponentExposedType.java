package com.axellience.client.components.submit;

import com.axellience.client.Todo;
import com.axellience.vuegwt.core.client.component.options.VueComponentOptions;
import com.axellience.vuegwt.core.client.tools.FieldsExposer;
import com.axellience.vuegwt.core.client.tools.VueGWTTools;
import elemental2.core.Function;
import java.lang.Object;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
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
public class SubmitComponentExposedType extends SubmitComponent {
  @JsProperty
  public Proto __proto__;

  @JsProperty
  public boolean vg$hrc_0;

  @JsMethod
  public void vg$created() {
    if (vg$hrc_0) return;
    vg$hrc_0 = true;
    vue().$options().proxyFields(this);
    VueGWTTools.initComponentInstanceFields(this, new SubmitComponent());
    Proto p = __proto__;
  }

  public static String getScopedCss() {
    return null;
  }

  private Function getRenderFunction() {
    String renderFunctionString = "with(this){return _c('div',[_c('todo-list',{attrs:{\"todis\":exp$0()}},[_v(\"\\n    \\tTodo list:\\n    \")]),_v(\" \"),_c('div',{staticClass:\"ui input focus\"},[_c('input',{directives:[{name:\"model\",rawName:\"v-model\",value:(message__vuegwt__vmodel),expression:\"message__vuegwt__vmodel\"}],attrs:{\"type\":\"text\"},domProps:{\"value\":(message__vuegwt__vmodel)},on:{\"keyup\":function($event){if(!('button' in $event)&&_k($event.keyCode,\"enter\",13,$event.key,\"Enter\"))return null;return addElement($event)},\"input\":function($event){if($event.target.composing)return;message__vuegwt__vmodel=$event.target.value}}})]),_v(\" \"),_c('button',{staticClass:\"ui secondary button\",on:{\"click\":addElement}},[_v(\"Add\")])],1)}";
    renderFunctionString = VueGWTTools.replaceVariableInRenderFunction(renderFunctionString, "message__vuegwt__vmodel", this, () -> this.message = null);
    return new Function(renderFunctionString);
  }

  private Function[] getStaticRenderFunctions() {
    return new Function[] {  };
  }

  @JsMethod
  @SuppressWarnings("unusable-by-js")
  public List<Todo> exp$0() {
    // SubmitComponent.html, line 3
    return elements;
  }

  public VueComponentOptions<SubmitComponent> getOptions() {
    VueComponentOptions<SubmitComponent> options = new VueComponentOptions<SubmitComponent>();
    Proto p = __proto__;
    options.setComponentExportedTypePrototype(p);
    options.addMethod("addElement", p.addElement);
    options.addHookMethod("created", p.vg$created);
    options.initData(true, VueGWTTools.getFieldsName(this, () -> {
      this.message = null;
      this.elements = null;
    } ));
    options.registerTemplateMethods(p.exp$0);
    options.initRenderFunctions(getRenderFunction(), getStaticRenderFunctions());
    return options;
  }

  @JsMethod
  void vg$ef() {
    this.message = FieldsExposer.v();
    this.elements = FieldsExposer.v();
    FieldsExposer.e(message,elements);
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  private static class Proto implements JsPropertyMap<Object> {
    public Function addElement;

    public Function vg$created;

    public Function exp$0;
  }
}
