package com.company.managementportal.web.screens.guard;

import com.haulmont.cuba.gui.screen.*;
import com.company.managementportal.entity.Guard;

@UiController("managementportal_Guard.browse")
@UiDescriptor("guard-browse.xml")
@LookupComponent("guardsTable")
@LoadDataBeforeShow
public class GuardBrowse extends StandardLookup<Guard> {
}