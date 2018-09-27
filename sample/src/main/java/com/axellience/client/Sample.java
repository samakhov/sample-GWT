package com.axellience.client;

import com.axellience.client.components.johnsnow.JohnSnowComponentFactory;
import com.axellience.client.components.reversed.ReverseComponentFactory;
import com.axellience.client.components.submit.SubmitComponentFactory;
import com.axellience.client.components.todo.TodoComponentFactory;
import com.axellience.client.gwt_binder.ListElementBinder;
import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vuegwt.core.client.VueGWT;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.TextBox;

public class Sample implements EntryPoint
{
    private TextBox   textBox   = new TextBox();
    private FlowPanel listPanel = new FlowPanel();

    @Override
    public void onModuleLoad()
    {
        VueGWT.init();

        Vue.component(TodoComponentFactory.get());

        Vue.attach("#simpleLinkComponentContainer", SimpleLinkComponentFactory.get());

        /*LinkComponent linkComponent =
                Vue.attach("#linkComponentContainer", LinkComponentFactory.get());*/

        Vue.attach("#canHideComponentContainer", CanHideComponentFactory.get());

        /*
        Vue.attach("#todoListComponentContainer", TodoListComponentFactory.get());
        */

        Vue.attach("#exclamationComponentContainer", ExclamationComponentFactory.get());

        Vue.attach("#messageComponentContainer", MessageComponentFactory.get());

        Vue.attach("#submitComponentContainer", SubmitComponentFactory.get());

        Vue.attach("#reverseComponentContainer", ReverseComponentFactory.get());

        Vue.attach("#johnSnowComponentContainer", JohnSnowComponentFactory.get());

        /*FlowPanel panel = new FlowPanel();
        
        Button button = new Button("Add");
        
        button.addClickHandler(this::handleEvent);
        
        // RootPanel.get("gwt-container").add(panel);
        
        HelloWorld helloWorld = new HelloWorld();
        SimpleLinkComponent simpleComponent = new SimpleLinkComponent();
        
        textBox.setStyleName("ui input");
        button.setStyleName("ui primary button");
        
        listPanel.setStyleName("ui card");
        panel.add(listPanel);
        panel.add(textBox);
        panel.add(button);
        panel.add(helloWorld);*/

    }

    public void handleEvent(ClickEvent event)
    {
        if (textBox.getText().isEmpty()) {
            Window.alert("Empty label, write something in the label");
        } else {
            // listPanel.add(new ListElement(textBox.getText()));
            listPanel.add(new ListElementBinder(textBox.getText()));
            textBox.setText(null);
        }

    }

}
