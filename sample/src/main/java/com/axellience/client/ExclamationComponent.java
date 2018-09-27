package com.axellience.client;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.client.component.IsVueComponent;

import jsinterop.annotations.JsMethod;

@Component
public class ExclamationComponent implements IsVueComponent
{

    @Data
    String message = "Hello Vue GWT!";

    @JsMethod // Notice the @JsMethod annotation to expose this method to our
              // template
    public void addExclamationMark()
    {
        this.message += "!";
    }
}