package org.felight.dto;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Date;
//import java.util.HashSet;
//import java.util.Set;

import javax.persistence.Cacheable;
//import javax.persistence.AttributeOverride;
//import javax.persistence.AttributeOverrides;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.ElementCollection;
//import javax.persistence.Embedded;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

//import org.hibernate.annotations.CollectionId;
//import org.hibernate.annotations.GenericGenerator;
//import org.hibernate.annotations.Type;


@Entity 
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@NamedQuery(name="Employee.byId", query="from Employee where id = ?")
@Table(name="Employee")
public class Employee {
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String name;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
