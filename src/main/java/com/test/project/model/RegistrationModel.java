package com.test.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "register")
public class RegistrationModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rgstrn_id", columnDefinition = "serial")
	private Integer rgstrnId;
	
	@Column(name = "frst_nm")
	private String frstNm;
	
	@Column(name = "mdle_nm")
	private String mdleNm;
	
	@Column(name = "lst_nm")
	private String lstNm;
	
	@Column(name = "eml_id")
	private String emlId;
	
	@Column(name = "phn_num")
	private Long phnNum;
	
	@Column(name = "pswd")
	private String pswd;

	public Integer getRgstrnId() {
		return rgstrnId;
	}

	public void setRgstrnId(Integer rgstrnId) {
		this.rgstrnId = rgstrnId;
	}

	public String getFrstNm() {
		return frstNm;
	}

	public void setFrstNm(String frstNm) {
		this.frstNm = frstNm;
	}

	public String getMdleNm() {
		return mdleNm;
	}

	public void setMdleNm(String mdleNm) {
		this.mdleNm = mdleNm;
	}

	public String getLstNm() {
		return lstNm;
	}

	public void setLstNm(String lstNm) {
		this.lstNm = lstNm;
	}

	public String getEmlId() {
		return emlId;
	}

	public void setEmlId(String emlId) {
		this.emlId = emlId;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public Long getPhnNum() {
		return phnNum;
	}

	public void setPhnNum(Long phnNum) {
		this.phnNum = phnNum;
	}
	
	
	
}
