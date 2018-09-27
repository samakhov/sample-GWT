package com.axellience.client.gwt_binder;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;

public class ListElement extends HorizontalPanel
{
    private Button deleteButton = new Button("Delete");

    public ListElement(String labelText)
    {
        this.add(new Label(labelText));
        deleteButton.addClickHandler(this::deleteLabel);
        this.add(deleteButton);
    }

    public void deleteLabel(ClickEvent event)
    {
        this.removeFromParent();
    }

}
