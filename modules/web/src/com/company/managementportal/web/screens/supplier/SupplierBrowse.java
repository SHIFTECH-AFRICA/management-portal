package com.company.managementportal.web.screens.supplier;

import com.haulmont.cuba.gui.screen.*;
import com.company.managementportal.entity.Supplier;

@UiController("managementportal_Supplier.browse")
@UiDescriptor("supplier-browse.xml")
@LookupComponent("suppliersTable")
@LoadDataBeforeShow
public class SupplierBrowse extends StandardLookup<Supplier> {
}