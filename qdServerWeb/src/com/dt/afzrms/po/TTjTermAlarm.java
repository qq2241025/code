package com.dt.afzrms.po;

// Generated 2015-3-31 15:28:59 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TTjTermAlarm generated by hbm2java
 */
@Entity
@Table(name = "T_TJ_TERM_ALARM", catalog = "qdafz")
public class TTjTermAlarm implements java.io.Serializable {

	private TTjTermAlarmId id;
	private Integer speedAlarmCount;
	private Integer areaAlarmCount;
	private Integer areaSpeedAlarmCount;

	public TTjTermAlarm() {
	}

	public TTjTermAlarm(TTjTermAlarmId id) {
		this.id = id;
	}

	public TTjTermAlarm(TTjTermAlarmId id, Integer speedAlarmCount, Integer areaAlarmCount, Integer areaSpeedAlarmCount) {
		this.id = id;
		this.speedAlarmCount = speedAlarmCount;
		this.areaAlarmCount = areaAlarmCount;
		this.areaSpeedAlarmCount = areaSpeedAlarmCount;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "deviceId", column = @Column(name = "device_id", nullable = false, length = 40)),
			@AttributeOverride(name = "tjDate", column = @Column(name = "tj_date", nullable = false, length = 10)) })
	public TTjTermAlarmId getId() {
		return this.id;
	}

	public void setId(TTjTermAlarmId id) {
		this.id = id;
	}

	@Column(name = "speed_alarm_count")
	public Integer getSpeedAlarmCount() {
		return this.speedAlarmCount;
	}

	public void setSpeedAlarmCount(Integer speedAlarmCount) {
		this.speedAlarmCount = speedAlarmCount;
	}

	@Column(name = "area_alarm_count")
	public Integer getAreaAlarmCount() {
		return this.areaAlarmCount;
	}

	public void setAreaAlarmCount(Integer areaAlarmCount) {
		this.areaAlarmCount = areaAlarmCount;
	}

	@Column(name = "area_speed_alarm_count")
	public Integer getAreaSpeedAlarmCount() {
		return this.areaSpeedAlarmCount;
	}

	public void setAreaSpeedAlarmCount(Integer areaSpeedAlarmCount) {
		this.areaSpeedAlarmCount = areaSpeedAlarmCount;
	}

}