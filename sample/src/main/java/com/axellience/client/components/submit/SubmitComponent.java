package com.axellience.client.components.submit;

import java.util.LinkedList;
import java.util.List;

import com.axellience.client.Todo;
import com.axellience.client.components.todolist.TodoListComponent;
import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.client.component.IsVueComponent;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;

@Component(components = {TodoListComponent.class})
public class SubmitComponent implements IsVueComponent
{
    @Data
    String message = "";

    @Data
    @JsProperty
    List<Todo> elements = new LinkedList<>();

    @JsMethod
    public void addElement()
    {
        if (message != "") {
            this.elements.add(new Todo(message));
            this.message = "";
        }
    }

}
