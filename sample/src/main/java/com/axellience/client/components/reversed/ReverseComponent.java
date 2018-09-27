package com.axellience.client.components.reversed;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Computed;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.client.component.IsVueComponent;

@Component
public class ReverseComponent implements IsVueComponent
{
    @Data
    String message = "Hello";

    @Computed // Note the annotation that tells Vue GWT that this is a Computed
              // Property
    public String getReversedMessage()
    {
        return new StringBuilder(message).reverse().toString();
    }
}
