package com.company.managementportal.web.screens.supplier;

import com.haulmont.cuba.gui.screen.*;
import com.company.managementportal.entity.Supplier;

@UiController("managementportal_Supplier.edit")
@UiDescriptor("supplier-edit.xml")
@EditedEntityContainer("supplierDc")
@LoadDataBeforeShow
public class SupplierEdit extends StandardEditor<Supplier> {
}