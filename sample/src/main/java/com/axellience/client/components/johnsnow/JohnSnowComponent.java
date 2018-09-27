package com.axellience.client.components.johnsnow;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.annotations.component.Watch;
import com.axellience.vuegwt.core.client.component.IsVueComponent;

@Component
public class JohnSnowComponent implements IsVueComponent
{

    @Data
    String message = "Suis présent";

    @Watch("message")
    public void watchMessage(String newValue, String oldValue)
    {
        newValue = "th";

    }

}
