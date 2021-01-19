package com.OurVision.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="attachment")

public class Attach {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Lob
	  private byte[] personal_image;
	
	@Lob
	  private byte[] id_image;

	@Column(updatable=false)
	private Date createdAt;
	
	private Date updatedAt;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "modify_id", referencedColumnName = "id")
    private ModifyPassport modify_passport;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "new_id", referencedColumnName = "id")
    private NewPassport new_passport;

	public Attach() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public byte[] getPersonal_image() {
		return personal_image;
	}

	public void setPersonal_image(byte[] personal_image) {
		this.personal_image = personal_image;
	}

	public byte[] getId_image() {
		return id_image;
	}

	public void setId_image(byte[] id_image) {
		this.id_image = id_image;
	}

	public ModifyPassport getModify_passport() {
		return modify_passport;
	}

	public void setModify_passport(ModifyPassport modify_passport) {
		this.modify_passport = modify_passport;
	}

	public NewPassport getNew_passport() {
		return new_passport;
	}

	public void setNew_passport(NewPassport new_passport) {
		this.new_passport = new_passport;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	
	
}

