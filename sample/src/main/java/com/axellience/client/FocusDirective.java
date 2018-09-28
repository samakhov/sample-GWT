package com.axellience.client;

import com.axellience.vuegwt.core.annotations.directive.Directive;
import com.axellience.vuegwt.core.client.directive.VueDirective;

import elemental2.dom.DomGlobal;
import elemental2.dom.Element;

@Directive
public class FocusDirective extends VueDirective
{
    public void inserted(Element el, VueDirective binding)
    {
        DomGlobal.console.log("inserted", el);
        el.focus();
    }

    public void bind(Element el, VueDirective binding)
    {
        DomGlobal.console.log("bind", el);
        el.focus();
    }

}
