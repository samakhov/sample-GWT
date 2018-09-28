package com.axellience.client.components.content;

import com.axellience.client.components.crud.CrudComponent;
import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.client.component.IsVueComponent;

@Component(components = {CrudComponent.class})
public class ContentComponent implements IsVueComponent
{
    @Data
    String person = "Person";

}
