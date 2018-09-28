package com.axellience.client.components.crud;

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
public class CrudComponentExposedType extends CrudComponent {
  @JsProperty
  public Proto __proto__;

  @JsProperty
  public boolean vg$hrc_0;

  @JsMethod
  public void vg$created() {
    if (vg$hrc_0) return;
    vg$hrc_0 = true;
    vue().$options().proxyFields(this);
    VueGWTTools.initComponentInstanceFields(this, new CrudComponent());
    Proto p = __proto__;
    super.created();
  }

  public static String getScopedCss() {
    return null;
  }

  private Function getRenderFunction() {
    String renderFunctionString = "with(this){return _c('div',{staticClass:\"ui segments\"},[_c('div',{staticClass:\"ui secondary segment\"},[_c('div',{staticClass:\"ui grid\"},[_c('div',{staticClass:\"fourteen wide column\"},[_v(\" List of \"+_s(exp$0())+\" \")]),_v(\" \"),_c('div',{staticClass:\"two wide column\"},[_c('button',{staticClass:\"ui labeled icon button\"},[_c('i',{staticClass:\"plus icon\"}),_v(\"\\n\\t\\t\\t\\t\\tAdd \"+_s(exp$1())+\"\\n\\t\\t\\t\\t\")])])])]),_v(\" \"),_c('div',{staticClass:\"ui segment\"},[_c('table',{staticClass:\"ui celled table\"},[_c('thead',[_c('tr',[_l((exp$2()),function(attribute){return _c('th',[_v(_s(exp$3(attribute)))])}),_v(\" \"),(exp$4())?_c('th',[_v(\"Operations\")]):_e()],2)])])])])}";
    return new Function(renderFunctionString);
  }

  private Function[] getStaticRenderFunctions() {
    return new Function[] {  };
  }

  @JsMethod
  @SuppressWarnings("unusable-by-js")
  public String exp$0() {
    // CrudComponent.html, line 7
    return VueGWTTools.templateExpressionToString(object.getSimpleName());
  }

  @JsMethod
  @SuppressWarnings("unusable-by-js")
  public String exp$1() {
    // CrudComponent.html, line 10
    return VueGWTTools.templateExpressionToString(object.getSimpleName());
  }

  @JsMethod
  @SuppressWarnings("unusable-by-js")
  public Any exp$2() {
    // CrudComponent.html, line 20
    return Js.asAny(com.axellience.vuegwt.core.client.tools.VForExpressionUtil.vForExpressionFromJava(attributes));
  }

  @JsMethod
  @SuppressWarnings("unusable-by-js")
  public String exp$3(String attribute) {
    // CrudComponent.html, line 20
    return VueGWTTools.templateExpressionToString(attribute);
  }

  @JsMethod
  @SuppressWarnings("unusable-by-js")
  public boolean exp$4() {
    // CrudComponent.html, line 21
    return (boolean) (operations);
  }

  public VueComponentOptions<CrudComponent> getOptions() {
    VueComponentOptions<CrudComponent> options = new VueComponentOptions<CrudComponent>();
    Proto p = __proto__;
    options.setComponentExportedTypePrototype(p);
    options.addJavaProp("className", VueGWTTools.getFieldName(this, () -> this.className = null), true, null);
    options.addHookMethod("created", p.vg$created);
    options.initData(true, VueGWTTools.getFieldsName(this, () -> {
      this.operations = true;
      this.attributes = null;
      this.object = null;
    } ));
    options.registerTemplateMethods(p.exp$0, p.exp$1, p.exp$2, p.exp$3, p.exp$4);
    options.initRenderFunctions(getRenderFunction(), getStaticRenderFunctions());
    return options;
  }

  @JsMethod
  void vg$ef() {
    this.operations = FieldsExposer.v();
    this.className = FieldsExposer.v();
    this.attributes = FieldsExposer.v();
    this.object = FieldsExposer.v();
    FieldsExposer.e(operations,className,attributes,object);
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  private static class Proto implements JsPropertyMap<Object> {
    public Function vg$created;

    public Function exp$0;

    public Function exp$1;

    public Function exp$2;

    public Function exp$3;

    public Function exp$4;
  }
}
