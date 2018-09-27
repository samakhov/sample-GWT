package com.axellience.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class HelloWorld extends Composite
{
    interface MyUiBinder extends UiBinder<Widget, HelloWorld>
    {
    }

    private static final MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    @UiField
    SpanElement nameSpan;

    public HelloWorld()
    {
        initWidget(uiBinder.createAndBindUi(this));
    }

    public void setName(String name)
    {
        nameSpan.setInnerText(name);
    }

}
