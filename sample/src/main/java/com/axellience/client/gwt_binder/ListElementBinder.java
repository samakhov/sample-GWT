package com.axellience.client.gwt_binder;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class ListElementBinder extends Composite
{

    interface MyUiBinder extends UiBinder<Widget, ListElementBinder>
    {
    }

    private static final MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    @UiField
    Label elementValue;

    @UiField
    Button deleteButton;

    public ListElementBinder(String text)
    {
        initWidget(uiBinder.createAndBindUi(this));
        elementValue.setText(text);
        // deleteButton.setStyleName("circular ui icon button");
        // deleteButton.addStyleName("times icon");
    }

    @UiHandler("deleteButton")
    void doClickDelete(ClickEvent event)
    {
        this.removeFromParent();
    }

}
