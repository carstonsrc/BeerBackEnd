package com.revature.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
public class Beer implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="beer_name")
	private String name;
	
	@Column(name="chosen_category")
	private String category;
	
	@Column(name="apv_lowapv")
	private String lowapv;

	@Column(name="apv_highapv")
	private String highapv;
	
	@Column(name="ibu_lowibu")
	private String lowibu;
	
	@Column(name="ibu_highibu")
	private String highibu;
	
	@Column(name="srm_lowsrm")
	private String lowsrm;
	
	@Column(name="srm_highsrm")
	private String highsrm;
	
	public Beer() {
		super();
	}

	public Beer(String name, String category, String lowapv, String highapv, String lowibu, String highibu, String lowsrm, String highsrm) {
		super();
		this.name = name;
		this.category = category;
		this.lowapv = lowapv;
		this.highapv = highapv;
		this.lowibu = lowibu;
		this.highibu = highibu;
		this.lowsrm = lowsrm;
		this.highsrm = highsrm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLowapv() {
		return lowapv;
	}

	public void setLowapv(String lowapv) {
		this.lowapv = lowapv;
	}

	public String getHighapv() {
		return highapv;
	}

	public void setHighapv(String highapv) {
		this.highapv = highapv;
	}

	public String getLowibu() {
		return lowibu;
	}

	public void setLowibu(String lowibu) {
		this.lowibu = lowibu;
	}

	public String getHighibu() {
		return highibu;
	}

	public void setHighibu(String highibu) {
		this.highibu = highibu;
	}

	public String getLowsrm() {
		return lowsrm;
	}

	public void setLowsrm(String lowsrm) {
		this.lowsrm = lowsrm;
	}

	public String getHighsrm() {
		return highsrm;
	}

	public void setHighsrm(String highsrm) {
		this.highsrm = highsrm;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((highapv == null) ? 0 : highapv.hashCode());
		result = prime * result + ((highibu == null) ? 0 : highibu.hashCode());
		result = prime * result + ((highsrm == null) ? 0 : highsrm.hashCode());
		result = prime * result + ((lowapv == null) ? 0 : lowapv.hashCode());
		result = prime * result + ((lowibu == null) ? 0 : lowibu.hashCode());
		result = prime * result + ((lowsrm == null) ? 0 : lowsrm.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Beer other = (Beer) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (highapv == null) {
			if (other.highapv != null)
				return false;
		} else if (!highapv.equals(other.highapv))
			return false;
		if (highibu == null) {
			if (other.highibu != null)
				return false;
		} else if (!highibu.equals(other.highibu))
			return false;
		if (highsrm == null) {
			if (other.highsrm != null)
				return false;
		} else if (!highsrm.equals(other.highsrm))
			return false;
		if (lowapv == null) {
			if (other.lowapv != null)
				return false;
		} else if (!lowapv.equals(other.lowapv))
			return false;
		if (lowibu == null) {
			if (other.lowibu != null)
				return false;
		} else if (!lowibu.equals(other.lowibu))
			return false;
		if (lowsrm == null) {
			if (other.lowsrm != null)
				return false;
		} else if (!lowsrm.equals(other.lowsrm))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Beer [name=" + name + ", category=" + category + ", lowapv=" + lowapv + ", highapv=" + highapv
				+ ", lowibu=" + lowibu + ", highibu=" + highibu + ", lowsrm=" + lowsrm + ", highsrm=" + highsrm + "]";
	}
	
	

}
