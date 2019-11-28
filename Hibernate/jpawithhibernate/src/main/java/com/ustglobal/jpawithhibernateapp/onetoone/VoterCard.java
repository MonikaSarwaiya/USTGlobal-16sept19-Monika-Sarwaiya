<<<<<<< HEAD
package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Entity
@Table(name="voter_card")
@Data
public class VoterCard {

	@Column
	@Id
	private int vid;
	@Column
	private String vname;
	@Exclude
	@OneToOne(mappedBy = "voterCard")
	private Person person;
}
=======
package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Entity
@Table(name="voter_card")
@Data
public class VoterCard {

	@Column
	@Id
	private int vid;
	@Column
	private String vname;
	@Exclude
	@OneToOne(mappedBy = "voterCard")
	private Person person;
}
>>>>>>> 163df58be9dd1ed58e66d470dd49c7970be20870
