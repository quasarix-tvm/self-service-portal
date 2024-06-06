/**
 * Filename: Employee.java
 *
 * © Copyright 2023 Quasarix. ALL RIGHTS RESERVED.

 * All rights, title and interest (including all intellectual property rights) in this software and any derivative works based upon or derived from
 * this software belongs exclusively to Quasarix.

 * Access to this software is forbidden to anyone except current employees of Quasarix and its affiliated companies who have executed non-disclosure
 * agreements explicitly covering such access. While in the employment of Quasarix or its affiliate companies as the case may be, employees may use
 * this software internally, solely in the course of employment, for the sole purpose of developing new functionalities, features, procedures,
 * routines, customizations or derivative works, or for the purpose of providing maintenance or support for the software. Save as expressly permitted
 * above, no license or right thereto is hereby granted to anyone, either directly, by implication or otherwise. On the termination of employment,
 * the license granted to employee to access the software shall terminate and the software should be returned to the employer, without retaining any
 * copies.

 * This software is (i) proprietary to Quasarix; (ii) is of significant value to it; (iii) contains trade secrets of Quasarix; (iv) is not publicly
 * available; and (v) constitutes the confidential information of Quasarix.

 * Any use, reproduction, modification, distribution, public performance or display of this software or through the use of this software without the
 * prior, express written consent of Quasarix is strictly prohibited and may be in violation of applicable laws.
 *
 */
package com.quasarix.self_service_portal.dao.ds1.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author anto.jayaraj
 */
@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "full_name", nullable = false)
	private String fullName;

	@Column(name = "employee_id", unique = true, nullable = false)
	private String employeeId;

	@Column(name = "phone_number", nullable = false)
	private String phoneNumber;

	@Column(name = "official_mail", unique = true, nullable = false)
	private String officialMail;

	@Column(name = "email", unique = true, nullable = false)
	private String email;

	@Column(name = "adhar_no", unique = true, nullable = false)
	private String adharNo;

	@Column(name = "pan_no", unique = true, nullable = false)
	private String panNo;

	@Column(name = "date_of_birth", nullable = false)
	private Date dateOfBirth;

	@Column(name = "blood_group")
	private String bloodGroup;

	@Column(name = "fatherName", nullable = false)
	private String fatherName;

	@Column(name = "address_permanent", nullable = false)
	private String addressPermanent;

	@Column(name = "address_temporary", nullable = false)
	private String addressTemporary;

	@Column(name = "nominee_name", nullable = false)
	private String nomineeName;

	@Column(name = "nominee_relation", nullable = false)
	private String nomineeRelation;

	@Column(name = "date_of_joining", nullable = false)
	private String dateOfJoining;

	@Column(name = "current_position", nullable = false)
	private String currentPosition;

	@Column(name = "department", nullable = false)
	private String department;

	@Column(name = "reportingManager", nullable = false)
	private String reportingManager;

	@Column(name = "office_location", nullable = false)
	private String officeLocation;

	@Column(name = "country", nullable = false)
	private String country;
}

