package com.company.managementportal.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Table(name = "MANAGEMENTPORTAL_ATTENDANCE", indexes = {
        @Index(name = "IDX_MANAGEMENTPORTAL_ATTENDANCE_TYPE_", columnList = "TYPE_")
})
@Entity(name = "managementportal_Attendance")
@NamePattern("%s|type")
public class Attendance extends StandardEntity {
    private static final long serialVersionUID = 6110394337101079217L;

    @NotNull
    @Column(name = "START_TIME", nullable = false)
    private LocalDateTime startTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GUARD_ID")
    private Guard guard;

    @NotNull
    @Column(name = "TYPE_", nullable = false)
    private String type;

    @NotNull
    @Column(name = "DURATION", nullable = false)
    private Integer duration;

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Guard getGuard() {
        return guard;
    }

    public void setGuard(Guard guard) {
        this.guard = guard;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    @Transient
    @MetaProperty(related = {"startDate", "duration"})
    public LocalDateTime getEndDate() {
        return (startDate != null && duration != null) ? startDate.plusHours(duration) : null;
    }
}