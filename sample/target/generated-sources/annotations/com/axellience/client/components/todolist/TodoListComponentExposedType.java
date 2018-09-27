package com.axellience.client.components.todolist;

import com.axellience.client.Todo;
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
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated(
    value = "com.axellience.vuegwt.processors.component.ComponentExposedTypeGenerator",
    comments = "https://github.com/Axellience/vue-gwt"
)
public class TodoListComponentExposedType extends TodoListComponent {
  @JsProperty
  public Proto __proto__;

  @JsProperty
  public boolean vg$hrc_0;

  @JsMethod
  @SuppressWarnings("unusable-by-js")
  public void vg$e0() {
    super.mounted();
  }

  @JsMethod
  public void vg$created() {
    if (vg$hrc_0) return;
    vg$hrc_0 = true;
    vue().$options().proxyFields(this);
    VueGWTTools.initComponentInstanceFields(this, new TodoListComponent());
    Proto p = __proto__;
  }

  public static String getScopedCss() {
    return null;
  }

  private Function getRenderFunction() {
    String renderFunctionString = "with(this){return _c('div',[_c('strong',[_t(\"default\")],2),_v(\" \"),_c('ol',_l((exp$0()),function(tido){return _c('todo',{attrs:{\"todo\":exp$1(tido)}})}))])}";
    return new Function(renderFunctionString);
  }

  private Function[] getStaticRenderFunctions() {
    return new Function[] {  };
  }

  @JsMethod
  @SuppressWarnings("unusable-by-js")
  public Any exp$0() {
    // TodoListComponent.html, line 5
    return Js.asAny(com.axellience.vuegwt.core.client.tools.VForExpressionUtil.vForExpressionFromJava(todis));
  }

  @JsMethod
  @SuppressWarnings("unusable-by-js")
  public Todo exp$1(Todo tido) {
    // TodoListComponent.html, line 5
    return tido;
  }

  public VueComponentOptions<TodoListComponent> getOptions() {
    VueComponentOptions<TodoListComponent> options = new VueComponentOptions<TodoListComponent>();
    Proto p = __proto__;
    options.setComponentExportedTypePrototype(p);
    options.addJavaProp("todis", VueGWTTools.getFieldName(this, () -> this.todis = null), true, null);
    options.addHookMethod("mounted", p.vg$e0);
    options.addHookMethod("created", p.vg$created);
    options.initData(true, VueGWTTools.getFieldsName(this, () -> {
    } ));
    options.registerTemplateMethods(p.exp$0, p.exp$1);
    options.initRenderFunctions(getRenderFunction(), getStaticRenderFunctions());
    return options;
  }

  @JsMethod
  void vg$ef() {
    this.todis = FieldsExposer.v();
    FieldsExposer.e(todis);
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
