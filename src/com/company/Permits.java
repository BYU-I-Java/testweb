package com.company;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;


@Entity
@Table(name = "Cuz2020.Permits")

public class Permits {
    /**
     * id is an identity type field in the database and the primary key
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "PermitNo")
    private String PermitNo;

    @Column(name = "FKRegion")
    private int FKRegion;

    @Column(name = "FKPType")
    private int FKPType;

    @Column(name = "FKAOath")
    private int FKAOath;

    @Column(name = "FKIOath")
    private int FKIOath;

    @Column(name = "FKCOath")
    private int FKCOath;

    @Column(name = "IDate")
    private Date IDate;

    @Column(name = "CDate")
    private Date CDate;

    @Column(name = "CTime")
    private Time CTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPermitNo() {
        return PermitNo;
    }

    public void setPermitNo(String permitNo) {
        PermitNo = permitNo;
    }

    public int getFKRegion() {
        return FKRegion;
    }

    public void setFKRegion(int FKRegion) {
        this.FKRegion = FKRegion;
    }

    public int getFKPType() {
        return FKPType;
    }

    public void setFKPType(int FKPType) {
        this.FKPType = FKPType;
    }

    public int getFKAOath() {
        return FKAOath;
    }

    public void setFKAOath(int FKAOath) {
        this.FKAOath = FKAOath;
    }

    public int getFKIOath() {
        return FKIOath;
    }

    public void setFKIOath(int FKIOath) {
        this.FKIOath = FKIOath;
    }

    public int getFKCOath() {
        return FKCOath;
    }

    public void setFKCOath(int FKCOath) {
        this.FKCOath = FKCOath;
    }

    public Date getIDate() {
        return IDate;
    }

    public void setIDate(Date IDate) {
        this.IDate = IDate;
    }

    public Date getCDate() {
        return CDate;
    }

    public void setCDate(Date CDate) {
        this.CDate = CDate;
    }

    public Time getCTime() {
        return CTime;
    }

    public void setCTime(Time CTime) {
        this.CTime = CTime;
    }

    @Override
    public String toString() {
        return "Permits{" +
                "id=" + id +
                ", PermitNo='" + PermitNo + '\'' +
                ", IDate=" + IDate +
                ", CDate=" + CDate +
                ", CTime=" + CTime +
                '}';
    }
}
