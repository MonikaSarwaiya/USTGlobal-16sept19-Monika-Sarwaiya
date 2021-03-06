<<<<<<< HEAD
package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="person")
@Data
public class Person {

	@Column
	@Id
	private int pid;
	@Column
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="vid")
	private VoterCard voterCard;
}
=======
package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="person")
@Data
public class Person {

	@Column
	@Id
	private int pid;
	@Column
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="vid")
	private VoterCard voterCard;
}
>>>>>>> 163df58be9dd1ed58e66d470dd49c7970be20870
