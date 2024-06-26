package com.oop.studentregistration;

public class Dummy {
    int studentId;
    String courseId;
    int courseCredit;
    int section;

    public Dummy() {

    }

    public Dummy(int studentId, String courseId, int courseCredit, int section) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.courseCredit = courseCredit;
        this.section = section;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }
}
