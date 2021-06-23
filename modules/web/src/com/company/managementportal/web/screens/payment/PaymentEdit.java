package com.company.managementportal.web.screens.payment;

import com.haulmont.cuba.gui.screen.*;
import com.company.managementportal.entity.Payment;

@UiController("managementportal_Payment.edit")
@UiDescriptor("payment-edit.xml")
@EditedEntityContainer("paymentDc")
@LoadDataBeforeShow
public class PaymentEdit extends StandardEditor<Payment> {
}