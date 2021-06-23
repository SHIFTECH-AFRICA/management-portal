package com.company.managementportal.web.screens.payment;

import com.haulmont.cuba.gui.screen.*;
import com.company.managementportal.entity.Payment;

@UiController("managementportal_Payment.browse")
@UiDescriptor("payment-browse.xml")
@LookupComponent("paymentsTable")
@LoadDataBeforeShow
public class PaymentBrowse extends StandardLookup<Payment> {
}