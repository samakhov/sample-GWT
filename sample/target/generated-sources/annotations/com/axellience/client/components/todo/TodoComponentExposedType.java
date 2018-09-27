package com.axellience.client.components.todo;

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
public class TodoComponentExposedType extends TodoComponent {
  @JsProperty
  public Proto __proto__;

  @JsProperty
  public boolean vg$hrc_0;

  @JsMethod
  public void vg$created() {
    if (vg$hrc_0) return;
    vg$hrc_0 = true;
    vue().$options().proxyFields(this);
    VueGWTTools.initComponentInstanceFields(this, new TodoComponent());
    Proto p = __proto__;
  }

  public static String getScopedCss() {
    return null;
  }

  private Function getRenderFunction() {
    String renderFunctionString = "with(this){return _c('div',[_c('li',[_v(\"\\n    \\t\"+_s(exp$0())+\"\\n\\t\")]),_v(\" \"),_c('button',{on:{\"click\":removeElement}},[_v(\"rm\")])])}";
    return new Function(renderFunctionString);
  }

  private Function[] getStaticRenderFunctions() {
    return new Function[] {  };
  }

  @JsMethod
  @SuppressWarnings("unusable-by-js")
  public String exp$0() {
    // TodoComponent.html, line 2
    return VueGWTTools.templateExpressionToString(todo.getText());
  }

  public VueComponentOptions<TodoComponent> getOptions() {
    VueComponentOptions<TodoComponent> options = new VueComponentOptions<TodoComponent>();
    Proto p = __proto__;
    options.setComponentExportedTypePrototype(p);
    options.addJavaProp("todo", VueGWTTools.getFieldName(this, () -> this.todo = null), false, null);
    options.addMethod("removeElement", p.removeElement);
    options.addHookMethod("created", p.vg$created);
    options.initData(true, VueGWTTools.getFieldsName(this, () -> {
    } ));
    options.registerTemplateMethods(p.exp$0);
    options.initRenderFunctions(getRenderFunction(), getStaticRenderFunctions());
    return options;
  }

  @JsMethod
  void vg$ef() {
    this.todo = FieldsExposer.v();
    FieldsExposer.e(todo);
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  private static class Proto implements JsPropertyMap<Object> {
    public Function removeElement;

    public Function vg$created;

    public Function exp$0;
  }
}
