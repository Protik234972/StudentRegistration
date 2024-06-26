package com.oop.studentregistration;

public class Registration {

    String courseId;
    int courseCredit;
    int section;

    public Registration(String courseId, int courseCredit, int section) {
        this.courseId = courseId;
        this.courseCredit = courseCredit;
        this.section = section;
    }

    public Registration() {
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
