/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donor;

/**
 *
 * @author rajusingh
 */
public class Donor {
 
    // Donor Profile
    private String lastName;
    private String firstName;
    private String middleName;
    private String regID;
    private String nationIDType;
    private String nationID;
    private String addressType;
    private String streetAddress;
    private String zipPostal;
    private String stateProvince;
    private String city;
    private String country;
    private String dOB;
    private String gender;
    private String marital;
    private String ethnicity;
    private String emailID;
    private String mobileNo;
    private String occupation;
    private String appointmentDate;
    private String register;
    private String donorPresenceStatus;
    private String donationStatus;        
    
    //Nurse Assesment
    private String lastAppointment;
    private String lastDonation;
    private String previousDeferral;
    private String previousDonationReport;
    private String anyMajorAlignmentYesNo;
    private String anyMajorAlignmentWhat;
    private String bloodPressure;
    private String height;
    private String weight;
    private String vaccination6Month;
    private String generalHeathYesNo;
    private String deferredNotDeferredYesNo;
    private String deferredWhy;
    
    //Donor Report
    private String bloodType;
    private String rHFactor;
    private String sTDYesNo;
    private String hBVYesNo;
    private String hIVYesNo;
    private String hCVYesNo;
    private String hTLVYesNo;
    private String donorFutureEligibility;
    private String donorFutureEligbilityifNoWhy;
    
    //Getter&Setter

    public String getDonorPresenceStatus() {
        return donorPresenceStatus;
    }

    public void setDonorPresenceStatus(String donorPresenceStatus) {
        this.donorPresenceStatus = donorPresenceStatus;
    }

    public String getDonationStatus() {
        return donationStatus;
    }
    
    public void setDonationStatus(String donationStatus) {
        this.donationStatus = donationStatus;    
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }    

    public String getRegister() {
        return register;
    }
    
    public void setRegister(String register) {    
        this.register = register;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getRegID() {
        return regID;
    }

    public void setRegID(String regID) {
        this.regID = regID;
    }

    public String getNationIDType() {
        return nationIDType;
    }

    public void setNationIDType(String nationIDType) {
        this.nationIDType = nationIDType;
    }

    public String getNationID() {
        return nationID;
    }

    public void setNationID(String nationID) {
        this.nationID = nationID;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getZipPostal() {
        return zipPostal;
    }

    public void setZipPostal(String zipPostal) {
        this.zipPostal = zipPostal;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getLastAppointment() {
        return lastAppointment;
    }

    public void setLastAppointment(String lastAppointment) {
        this.lastAppointment = lastAppointment;
    }

    public String getLastDonation() {
        return lastDonation;
    }

    public void setLastDonation(String lastDonation) {
        this.lastDonation = lastDonation;
    }

    public String getPreviousDeferral() {
        return previousDeferral;
    }

    public void setPreviousDeferral(String previousDeferral) {
        this.previousDeferral = previousDeferral;
    }

    public String getPreviousDonationReport() {
        return previousDonationReport;
    }

    public void setPreviousDonationReport(String previousDonationReport) {
        this.previousDonationReport = previousDonationReport;
    }

    public String getAnyMajorAlignmentYesNo() {
        return anyMajorAlignmentYesNo;
    }

    public void setAnyMajorAlignmentYesNo(String anyMajorAlignmentYesNo) {
        this.anyMajorAlignmentYesNo = anyMajorAlignmentYesNo;
    }

    public String getAnyMajorAlignmentWhat() {
        return anyMajorAlignmentWhat;
    }

    public void setAnyMajorAlignmentWhat(String anyMajorAlignmentWhat) {
        this.anyMajorAlignmentWhat = anyMajorAlignmentWhat;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getVaccination6Month() {
        return vaccination6Month;
    }

    public void setVaccination6Month(String vaccination6Month) {
        this.vaccination6Month = vaccination6Month;
    }

    public String getGeneralHeathYesNo() {
        return generalHeathYesNo;
    }

    public void setGeneralHeathYesNo(String generalHeathYesNo) {
        this.generalHeathYesNo = generalHeathYesNo;
    }

    public String getDeferredNotDeferredYesNo() {
        return deferredNotDeferredYesNo;
    }

    public void setDeferredNotDeferredYesNo(String deferredNotDeferredYesNo) {
        this.deferredNotDeferredYesNo = deferredNotDeferredYesNo;
    }

    public String getDeferredWhy() {
        return deferredWhy;
    }

    public void setDeferredWhy(String deferredWhy) {
        this.deferredWhy = deferredWhy;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getrHFactor() {
        return rHFactor;
    }

    public void setrHFactor(String rHFactor) {
        this.rHFactor = rHFactor;
    }

    public String getsTDYesNo() {
        return sTDYesNo;
    }

    public void setsTDYesNo(String sTDYesNo) {
        this.sTDYesNo = sTDYesNo;
    }

    public String gethBVYesNo() {
        return hBVYesNo;
    }

    public void sethBVYesNo(String hBVYesNo) {
        this.hBVYesNo = hBVYesNo;
    }

    public String gethIVYesNo() {
        return hIVYesNo;
    }

    public void sethIVYesNo(String hIVYesNo) {
        this.hIVYesNo = hIVYesNo;
    }

    public String gethCVYesNo() {
        return hCVYesNo;
    }

    public void sethCVYesNo(String hCVYesNo) {
        this.hCVYesNo = hCVYesNo;
    }

    public String gethTLVYesNo() {
        return hTLVYesNo;
    }

    public void sethTLVYesNo(String hTLVYesNo) {
        this.hTLVYesNo = hTLVYesNo;
    }

    public String getDonorFutureEligibility() {
        return donorFutureEligibility;
    }

    public void setDonorFutureEligibility(String donorFutureEligibility) {
        this.donorFutureEligibility = donorFutureEligibility;
    }

    public String getDonorFutureEligbilityifNoWhy() {
        return donorFutureEligbilityifNoWhy;
    }

    public void setDonorFutureEligbilityifNoWhy(String donorFutureEligbilityifNoWhy) {
        this.donorFutureEligbilityifNoWhy = donorFutureEligbilityifNoWhy;
    }
    
    @Override
    public String toString()
    {
        return this.regID;
    }  
    
}
