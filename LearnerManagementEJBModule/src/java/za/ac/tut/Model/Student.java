/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Desmond
 */
@Entity
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private int studentNo;
    
    private String name;
    @Temporal(TemporalType.DATE)
    private Date dob;
    private String surname; 
    private String qualification;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    public Student() {
    }

    public Student(int studentNo, String name, Date dob, String surname, String qualification) {
        this.studentNo = studentNo;
        this.name = name;
        this.dob = dob;
        this.surname = surname;
        this.qualification = qualification;
    }

    public Student(int studentNo, String name, Date dob, String surname, String qualification, Date creationDate) {
        this.studentNo = studentNo;
        this.name = name;
        this.dob = dob;
        this.surname = surname;
        this.qualification = qualification;
        this.creationDate = creationDate;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

   
    
    

 
}
