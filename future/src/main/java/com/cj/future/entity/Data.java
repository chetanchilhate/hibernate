package com.cj.future.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import org.hibernate.annotations.DynamicUpdate;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@ToString
@lombok.Data
@DynamicUpdate
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "spring-db", name = "data_tbl")
public class Data {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "data_id")
	private Integer dataId;
	@Column(name = "data_status")
	private String status;
	@Future
	@Column(name = "data_date")
	private Date date;

}
