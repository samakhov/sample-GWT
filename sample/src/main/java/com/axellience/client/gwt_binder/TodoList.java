package com.axellience.client.gwt_binder;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class TodoList extends Composite
{
    interface MyUiBinder extends UiBinder<Widget, TodoList>
    {
    }

    private static final MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    @UiField
    SpanElement nameSpan;

    public TodoList()
    {
        initWidget(uiBinder.createAndBindUi(this));
    }

}
