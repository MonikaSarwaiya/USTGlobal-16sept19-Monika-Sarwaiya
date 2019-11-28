<<<<<<< HEAD
package com.ustglobal.jpawithhibernateapp.onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "pencilbox")
public class PencilBox {


	@Column
	@Id
	private int bid;
	@Column
	private String bname;
	@Exclude
	@OneToMany(mappedBy = "pencilBox")
	
	private List<Pencil> pencil;
}
=======
package com.ustglobal.jpawithhibernateapp.onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "pencilbox")
public class PencilBox {


	@Column
	@Id
	private int bid;
	@Column
	private String bname;
	@Exclude
	@OneToMany(mappedBy = "pencilBox")
	
	private List<Pencil> pencil;
}
>>>>>>> 163df58be9dd1ed58e66d470dd49c7970be20870
