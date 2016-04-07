// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Aspirant.java

package com.accenture.ngo.pojo;

import java.io.Serializable;
import java.util.Date;

// Referenced classes of package com.accenture.drf.pojo:
//            Batch, MstCourse, User

public class Aspirant
    implements Serializable
{
	    private Integer aspirantId;
	    private String registrationCode;
	    private String reqStatus;
	    private String name;
	    private Batch batch;
	    private MstCourse course;
	    private Date doj;
	    private String qualification;
	    private String fatherOrHusbandName;
	    private String gender;
	    private String pwd;
	    private Date dob;
	    private String caste;
	    private String bplNo;
	    private String minorityStatus;
	    private String annualFamilyIncome;
	    private String hnoStreet;
	    private String village;
	    private String mandal;
	    private String district;
	    private String contactNo;
	    private String alternateContactNo;
	    private Integer status;
	    private User createdBy;
	    private Date createdDate;
	    private User modifiedBy;
	    private Date modifiedDate;
	    private String address;
	    private String paymentOptionChangeStatus;
	    private String panNumber;
	    private String editRemarks;
	    private Boolean alumni;
	    private Boolean firstLogin;
	    private Boolean updatedDetails;
	    private String password;
	    private String referredBy;
		
		private String prevEmployed;
		 private String maritalStatus;
		 private String distofAspHomefromCenter;
		 private String attendedPaidTraining;
		 private String attendedFreeTraining;
		 private String parentProfession;
		 private String comments;
		/* private String approvedStatus;
		 private String rejectedStatus;
		 private String pendingStatus;*/
		 private Boolean isAssignedToBatch;
		 private MstPaymentOpt paymentOptId;
		 private Integer dupAspId;//Vennam Anand 21 Nov 13
		 //private Integer paymentOptId;
		 //venkat added for FootFalls on 19/6/2013
		 private String sourceOfLead;
		 private String leadOutCenterId;
		 
		 private Integer footFallId;
		 private String aspirantBsrComments;
		 private Integer paymentStatusId;
		 
		 //Jyothi Added On 03202014 to trace deleted batch id in aspirant table
		 private Integer deletedBatchId;
    /*public Integer getPaymentOptId() {
			return paymentOptId;
		}

		public void setPaymentOptId(Integer paymentOptId) {
			this.paymentOptId = paymentOptId;
		}*/

	public String getAspirantBsrComments() {
			return aspirantBsrComments;
		}

		public void setAspirantBsrComments(String aspirantBsrComments) {
			this.aspirantBsrComments = aspirantBsrComments;
		}

	/*public String getPendingStatus() {
			return pendingStatus;
		}

		public void setPendingStatus(String pendingStatus) {
			this.pendingStatus = pendingStatus;
		}*/

	public String getParentProfession() {
			return parentProfession;
		}

		public void setParentProfession(String parentProfession) {
			this.parentProfession = parentProfession;
		}

		public String getComments() {
			return comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}

		/*public String getApprovedStatus() {
			return approvedStatus;
		}

		public void setApprovedStatus(String approvedStatus) {
			this.approvedStatus = approvedStatus;
		}

		public String getRejectedStatus() {
			return rejectedStatus;
		}

		public void setRejectedStatus(String rejectedStatus) {
			this.rejectedStatus = rejectedStatus;
		}*/

	public String getPrevEmployed() {
			return prevEmployed;
		}

		public void setPrevEmployed(String prevEmployed) {
			this.prevEmployed = prevEmployed;
		}

		public String getMaritalStatus() {
			return maritalStatus;
		}

		public void setMaritalStatus(String maritalStatus) {
			this.maritalStatus = maritalStatus;
		}

		public String getDistofAspHomefromCenter() {
			return distofAspHomefromCenter;
		}

		public void setDistofAspHomefromCenter(String distofAspHomefromCenter) {
			this.distofAspHomefromCenter = distofAspHomefromCenter;
		}

		public String getAttendedPaidTraining() {
			return attendedPaidTraining;
		}

		public void setAttendedPaidTraining(String attendedPaidTraining) {
			this.attendedPaidTraining = attendedPaidTraining;
		}

		public String getAttendedFreeTraining() {
			return attendedFreeTraining;
		}

		public void setAttendedFreeTraining(String attendedFreeTraining) {
			this.attendedFreeTraining = attendedFreeTraining;
		}

		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}

	public Boolean getUpdatedDetails() {
			return updatedDetails;
		}

		public void setUpdatedDetails(Boolean updatedDetails) {
			this.updatedDetails = updatedDetails;
		}

	public Boolean getAlumni() {
			return alumni;
		}

		public void setAlumni(Boolean alumni) {
			this.alumni = alumni;
		}

		public Boolean getFirstLogin() {
			return firstLogin;
		}

		public void setFirstLogin(Boolean firstLogin) {
			this.firstLogin = firstLogin;
		}

		public String getPanNumber() {
			return panNumber;
		}

		public void setPanNumber(String panNumber) {
			this.panNumber = panNumber;
		}

	public Aspirant()
    {
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public Integer getAspirantId()
    {
        return aspirantId;
    }

    public void setAspirantId(Integer aspirantId)
    {
        this.aspirantId = aspirantId;
    }

    public Batch getBatch()
    {
        return batch;
    }

    public void setBatch(Batch batch)
    {
        this.batch = batch;
    }

    public MstCourse getCourse()
    {
        return course;
    }

    public void setCourse(MstCourse course)
    {
        this.course = course;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getFatherOrHusbandName()
    {
        return fatherOrHusbandName;
    }

    public void setFatherOrHusbandName(String fatherOrHusbandName)
    {
        this.fatherOrHusbandName = fatherOrHusbandName;
    }
 
    public String getBplNo() {
		return bplNo;
	}

	public void setBplNo(String bplNo) {
		this.bplNo = bplNo;
	}

	public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public Date getDob()
    {
        return dob;
    }

    public void setDob(Date dob)
    {
        this.dob = dob;
    }

    public String getQualification()
    {
        return qualification;
    }

    public void setQualification(String qualification)
    {
        this.qualification = qualification;
    }

    public String getCaste()
    {
        return caste;
    }

    public void setCaste(String caste)
    {
        this.caste = caste;
    }

    public String getMinorityStatus()
    {
        return minorityStatus;
    }

    public void setMinorityStatus(String minorityStatus)
    {
        this.minorityStatus = minorityStatus;
    }

     
    public String getAnnualFamilyIncome() {
		return annualFamilyIncome;
	}

	public void setAnnualFamilyIncome(String annualFamilyIncome) {
		this.annualFamilyIncome = annualFamilyIncome;
	}

	 
	public void setRegistrationCode(String registrationCode) {
		this.registrationCode = registrationCode;
	}

	public String getHnoStreet()
    {
        return hnoStreet;
    }

    public void setHnoStreet(String hnoStreet)
    {
        this.hnoStreet = hnoStreet;
    }

    public String getVillage()
    {
        return village;
    }

    public void setVillage(String village)
    {
        this.village = village;
    }

    public String getMandal()
    {
        return mandal;
    }

    public void setMandal(String mandal)
    {
        this.mandal = mandal;
    }

    public String getDistrict()
    {
        return district;
    }

    public void setDistrict(String district)
    {
        this.district = district;
    }

    public String getContactNo()
    {
        return contactNo;
    }

    public void setContactNo(String contactNo)
    {
        this.contactNo = contactNo;
    }

    public String getAlternateContactNo()
    {
        return alternateContactNo;
    }

    public void setAlternateContactNo(String alternateContactNo)
    {
        this.alternateContactNo = alternateContactNo;
    }

    public User getCreatedBy()
    {
        return createdBy;
    }

    public void setCreatedBy(User createdBy)
    {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate()
    {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate)
    {
        this.createdDate = createdDate;
    }

    public User getModifiedBy()
    {
        return modifiedBy;
    }

    public void setModifiedBy(User modifiedBy)
    {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedDate()
    {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate)
    {
        this.modifiedDate = modifiedDate;
    }

    public Date getDoj()
    {
        return doj;
    }

    public void setDoj(Date doj)
    {
        this.doj = doj;
    }

    public String getRegistrationCode()
    {
        return registrationCode;
    }

   
    public Integer getStatus()
    {
        return status;
    }

    public void setStatus(Integer status)
    {
        this.status = status;
    }

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	//Added by Raghu 03/07/2012
	public Boolean getIsAssignedToBatch() {
		return isAssignedToBatch;
	}

	public void setIsAssignedToBatch(Boolean isAssignedToBatch) {
		this.isAssignedToBatch = isAssignedToBatch;
	}

	public MstPaymentOpt getPaymentOptId() {
		return paymentOptId;
	}

	public void setPaymentOptId(MstPaymentOpt paymentOptId) {
		this.paymentOptId = paymentOptId;
	}

	public String getReqStatus() {
		return reqStatus;
	}

	public void setReqStatus(String reqStatus) {
		this.reqStatus = reqStatus;
	}

	public String getSourceOfLead() {
		return sourceOfLead;
	}

	public void setSourceOfLead(String sourceOfLead) {
		this.sourceOfLead = sourceOfLead;
	}

	public String getLeadOutCenterId() {
		return leadOutCenterId;
	}

	public void setLeadOutCenterId(String leadOutCenterId) {
		this.leadOutCenterId = leadOutCenterId;
	}

	public String getEditRemarks() {
		return editRemarks;
	}

	public void setEditRemarks(String editRemarks) {
		this.editRemarks = editRemarks;
	}

	public Integer getFootFallId() {
		return footFallId;
	}

	public void setFootFallId(Integer footFallId) {
		this.footFallId = footFallId;
	}

	public Integer getDupAspId() {
		return dupAspId;
	}

	public void setDupAspId(Integer dupAspId) {
		this.dupAspId = dupAspId;
	}

	public String getPaymentOptionChangeStatus() {
		return paymentOptionChangeStatus;
	}

	public void setPaymentOptionChangeStatus(String paymentOptionChangeStatus) {
		this.paymentOptionChangeStatus = paymentOptionChangeStatus;
	}

	public Integer getDeletedBatchId() {
		return deletedBatchId;
	}

	public void setDeletedBatchId(Integer deletedBatchId) {
		this.deletedBatchId = deletedBatchId;
	}

	public String getReferredBy() {
		return referredBy;
	}

	public void setReferredBy(String referredBy) {
		this.referredBy = referredBy;
	}

	public Integer getPaymentStatusId() {
		return paymentStatusId;
	}

	public void setPaymentStatusId(Integer paymentStatusId) {
		this.paymentStatusId = paymentStatusId;
	}

	


	

   
}
