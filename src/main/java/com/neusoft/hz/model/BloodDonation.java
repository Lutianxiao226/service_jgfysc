package com.neusoft.hz.model;

import com.neusoft.hz.comp.hsbservice.common.annotation.ReturnType;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "BLOOD_DONATION_INFO")
@NameStyle(Style.uppercase)
public class BloodDonation {


    @Column(name = "BUSINESS_DATE")
    private String businessdate;

    @ReturnType(value = "0")
    @Column(name = "DONATIONVOLUME")
    private String DonationVolume;

    @ReturnType(value = "0")
    @Column(name = "AVOLUME")
    private String AVolume;

    @ReturnType(value = "0")
    @Column(name = "BVOLUME")
    private String BVolume;

    @ReturnType(value = "0")
    @Column(name = "OVOLUME")
    private String OVolume;

    @ReturnType(value = "0")
    @Column(name = "ABVOLUME")
    private String ABVolume;


    @Column(name = "ADD_DATE")
    private Date add_date;

    public String getBusinessdate() {
        return businessdate;
    }

    public void setBusinessdate(String businessdate) {
        this.businessdate = businessdate;
    }

    public String getDonationVolume() {
        return DonationVolume;
    }

    public void setDonationVolume(String donationVolume) {
        DonationVolume = donationVolume;
    }

    public String getAVolume() {
        return AVolume;
    }

    public void setAVolume(String AVolume) {
        this.AVolume = AVolume;
    }

    public String getBVolume() {
        return BVolume;
    }

    public void setBVolume(String BVolume) {
        this.BVolume = BVolume;
    }

    public String getOVolume() {
        return OVolume;
    }

    public void setOVolume(String OVolume) {
        this.OVolume = OVolume;
    }

    public String getABVolume() {
        return ABVolume;
    }

    public void setABVolume(String ABVolume) {
        this.ABVolume = ABVolume;
    }

    public Date getAdd_date() {
        return add_date;
    }

    public void setAdd_date(Date add_date) {
        this.add_date = add_date;
    }
}
