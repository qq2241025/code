package com.dt.afzrms.po;

// Generated 2015-1-22 18:06:40 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * RefUserRole generated by hbm2java
 */
@Entity
@Table(name = "REF_USER_ROLE", catalog = "qdafz", uniqueConstraints = { @UniqueConstraint(columnNames = "user_id"),
		@UniqueConstraint(columnNames = { "user_id", "role_id" }) })
public class RefUserRole implements java.io.Serializable {

	private Integer id;
	private TUser TUser;
	private TRole TRole;

	public RefUserRole() {
	}

	public RefUserRole(TRole TRole) {
		this.TRole = TRole;
	}

	public RefUserRole(TUser TUser, TRole TRole) {
		this.TUser = TUser;
		this.TRole = TRole;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", unique = true)
	public TUser getTUser() {
		return this.TUser;
	}

	public void setTUser(TUser TUser) {
		this.TUser = TUser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id", nullable = false)
	public TRole getTRole() {
		return this.TRole;
	}

	public void setTRole(TRole TRole) {
		this.TRole = TRole;
	}

}