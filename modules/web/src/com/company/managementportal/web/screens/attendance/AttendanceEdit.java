package com.company.managementportal.web.screens.attendance;

import com.haulmont.cuba.gui.screen.*;
import com.company.managementportal.entity.Attendance;

@UiController("managementportal_Attendance.edit")
@UiDescriptor("attendance-edit.xml")
@EditedEntityContainer("attendanceDc")
@LoadDataBeforeShow
public class AttendanceEdit extends StandardEditor<Attendance> {
}