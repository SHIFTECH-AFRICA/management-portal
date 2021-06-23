package com.company.managementportal.web.screens.attendance;

import com.haulmont.cuba.gui.screen.*;
import com.company.managementportal.entity.Attendance;

@UiController("managementportal_Attendance.browse")
@UiDescriptor("attendance-browse.xml")
@LookupComponent("attendancesTable")
@LoadDataBeforeShow
public class AttendanceBrowse extends StandardLookup<Attendance> {
}