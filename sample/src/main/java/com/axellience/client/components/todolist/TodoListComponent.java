package com.axellience.client.components.todolist;

import java.util.List;

import com.axellience.client.Todo;
import com.axellience.client.components.todo.TodoComponent;
import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Prop;
import com.axellience.vuegwt.core.client.component.IsVueComponent;
import com.axellience.vuegwt.core.client.component.hooks.HasMounted;

import elemental2.dom.DomGlobal;
import jsinterop.annotations.JsProperty;

@Component(components = {TodoComponent.class})
public class TodoListComponent implements IsVueComponent, HasMounted
{
    @Prop(required = true)
    @JsProperty
    List<Todo> todis;

    @Override
    public void mounted()
    {
        DomGlobal.console.log(todis);
    }
}
