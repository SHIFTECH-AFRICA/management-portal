package com.company.managementportal.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.managementportal.entity.Client;

@UiController("managementportal_Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
@LoadDataBeforeShow
public class ClientEdit extends StandardEditor<Client> {
}