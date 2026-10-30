package com.example.result;
import jakarta.persistence.*;
@Entity @Table(name="student_results")
public class StudentResult {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
private String studentName,rollNo,semester,subject1,subject2,subject3,subject4;
private int mse1,ese1,final1,mse2,ese2,final2,mse3,ese3,final3,mse4,ese4,final4,total;
private double percentage; private String result;
public Long getId(){return id;} public String getStudentName(){return studentName;} public void setStudentName(String x){studentName=x;}
public String getRollNo(){return rollNo;} public void setRollNo(String x){rollNo=x;} public String getSemester(){return semester;} public void setSemester(String x){semester=x;}
public String getSubject1(){return subject1;} public void setSubject1(String x){subject1=x;} public String getSubject2(){return subject2;} public void setSubject2(String x){subject2=x;}
public String getSubject3(){return subject3;} public void setSubject3(String x){subject3=x;} public String getSubject4(){return subject4;} public void setSubject4(String x){subject4=x;}
public int getMse1(){return mse1;} public void setMse1(int x){mse1=x;} public int getEse1(){return ese1;} public void setEse1(int x){ese1=x;} public int getFinal1(){return final1;}
public int getMse2(){return mse2;} public void setMse2(int x){mse2=x;} public int getEse2(){return ese2;} public void setEse2(int x){ese2=x;} public int getFinal2(){return final2;}
public int getMse3(){return mse3;} public void setMse3(int x){mse3=x;} public int getEse3(){return ese3;} public void setEse3(int x){ese3=x;} public int getFinal3(){return final3;}
public int getMse4(){return mse4;} public void setMse4(int x){mse4=x;} public int getEse4(){return ese4;} public void setEse4(int x){ese4=x;} public int getFinal4(){return final4;}
public int getTotal(){return total;} public double getPercentage(){return percentage;} public String getResult(){return result;}
public void calculate(){final1=mse1+ese1;final2=mse2+ese2;final3=mse3+ese3;final4=mse4+ese4;total=final1+final2+final3+final4;percentage=total/4.0;result=(final1>=40&&final2>=40&&final3>=40&&final4>=40)?"PASS":"FAIL";}
}