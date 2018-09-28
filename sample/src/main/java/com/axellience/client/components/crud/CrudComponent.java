package com.axellience.client.components.crud;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.annotations.component.Prop;
import com.axellience.vuegwt.core.client.component.IsVueComponent;
import com.axellience.vuegwt.core.client.component.hooks.HasCreated;

import jsinterop.annotations.JsProperty;

@Component
public class CrudComponent implements IsVueComponent, HasCreated
{

    @Data
    Class<?> object;

    @Data
    @JsProperty
    List<String> attributes = new ArrayList();

    @Data
    boolean operations = true;

    @Prop(required = true)
    String className;

    /*@JsMethod
    public void removeElement()
    {
        vue().$el().remove();
    }*/

    @Override
    public void created()
    {
        String completeName = "com.axellience.client.components." + className;

        // ClassLoader classLoader = CrudComponent.class.getClassLoader();

        /*try {
            object = Class.forName(completeName);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        for (Field f : object.getFields()) {
            attributes.add(f.getName());
        }

    }

}
