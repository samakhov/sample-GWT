package com.axellience.client.components.content;

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
public class ContentComponentExposedType extends ContentComponent {
  @JsProperty
  public Proto __proto__;

  @JsProperty
  public boolean vg$hrc_0;

  @JsMethod
  public void vg$created() {
    if (vg$hrc_0) return;
    vg$hrc_0 = true;
    vue().$options().proxyFields(this);
    VueGWTTools.initComponentInstanceFields(this, new ContentComponent());
    Proto p = __proto__;
  }

  public static String getScopedCss() {
    return null;
  }

  private Function getRenderFunction() {
    String renderFunctionString = "with(this){return _c('div',{staticClass:\"ui raised segment\"},[_c('div',{staticClass:\"content\"},[_v(\"\\n\\t\\tLorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam vitae nunc faucibus, sagittis erat eget, varius enim. Aliquam erat volutpat. Proin ut erat gravida, lobortis augue et, dapibus enim. Fusce ullamcorper pellentesque finibus. Morbi eros elit, condimentum et scelerisque vel, scelerisque eget purus. Aliquam placerat viverra libero a condimentum. Integer tempor elit nulla, eu mattis justo ultricies ac. Fusce rhoncus dictum ipsum, eu dictum neque tristique sed. Aenean semper, erat eu cursus feugiat, ante neque lobortis justo, non porttitor sem urna nec mi. Curabitur vestibulum purus sed velit tempus hendrerit. Vestibulum consectetur leo vel libero aliquam placerat. Maecenas at felis nunc. Fusce non magna sem.\\n\\n\\t\\tInteger mattis erat at nibh pretium commodo. Aenean nec tortor varius, suscipit justo ac, posuere quam. Nulla ut iaculis felis. Duis volutpat tellus ut mauris elementum egestas id posuere nunc. Etiam eu diam in massa auctor posuere quis eu ante. Vestibulum sed feugiat nisl. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Morbi porttitor sapien enim, sed interdum augue congue sed. Integer maximus tempor turpis sed convallis. Etiam ullamcorper neque eget arcu gravida malesuada. Phasellus sapien libero, sagittis id scelerisque quis, porttitor id sem. Donec ac lectus mauris. Quisque mattis dolor porta nisl fringilla vulputate. Sed gravida lobortis libero nec feugiat.\\n\\t\")]),_v(\" \"),_c('crud',{attrs:{\"className\":exp$0()}})],1)}";
    return new Function(renderFunctionString);
  }

  private Function[] getStaticRenderFunctions() {
    return new Function[] {  };
  }

  @JsMethod
  @SuppressWarnings("unusable-by-js")
  public String exp$0() {
    // ContentComponent.html, line 7
    return VueGWTTools.templateExpressionToString(person);
  }

  public VueComponentOptions<ContentComponent> getOptions() {
    VueComponentOptions<ContentComponent> options = new VueComponentOptions<ContentComponent>();
    Proto p = __proto__;
    options.setComponentExportedTypePrototype(p);
    options.addHookMethod("created", p.vg$created);
    options.initData(true, VueGWTTools.getFieldsName(this, () -> {
      this.person = null;
    } ));
    options.registerTemplateMethods(p.exp$0);
    options.initRenderFunctions(getRenderFunction(), getStaticRenderFunctions());
    return options;
  }

  @JsMethod
  void vg$ef() {
    this.person = FieldsExposer.v();
    FieldsExposer.e(person);
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
