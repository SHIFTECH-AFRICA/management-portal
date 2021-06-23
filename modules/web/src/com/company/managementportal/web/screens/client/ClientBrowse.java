package com.company.managementportal.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.managementportal.entity.Client;

@UiController("managementportal_Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
@LoadDataBeforeShow
public class ClientBrowse extends StandardLookup<Client> {
}