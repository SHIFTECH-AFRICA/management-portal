package com.company.managementportal.web.screens.guard;

import com.haulmont.cuba.gui.screen.*;
import com.company.managementportal.entity.Guard;

@UiController("managementportal_Guard.edit")
@UiDescriptor("guard-edit.xml")
@EditedEntityContainer("guardDc")
@LoadDataBeforeShow
public class GuardEdit extends StandardEditor<Guard> {
}