package com.axellience.client.components.todo;

import com.axellience.client.Todo;
import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Prop;
import com.axellience.vuegwt.core.client.component.IsVueComponent;

import jsinterop.annotations.JsMethod;

@Component
public class TodoComponent implements IsVueComponent
{
    @Prop
    Todo todo;

    @JsMethod
    public void removeElement()
    {
        vue().$el().remove();
    }
}
