package com.oop.studentregistration;

public class Student {
    int studentId;
    boolean hasScholarship;
    int scholarshipRate;

    public Student() {
    }

    public Student(int studentId, boolean hasScholarship, int scholarshipRate) {
        this.studentId = studentId;
        this.hasScholarship = hasScholarship;
        this.scholarshipRate = scholarshipRate;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public boolean isHasScholarship() {
        return hasScholarship;
    }

    public void setHasScholarship(boolean hasScholarship) {
        this.hasScholarship = hasScholarship;
    }

    public int getScholarshipRate() {
        return scholarshipRate;
    }

    public void setScholarshipRate(int scholarshipRate) {
        this.scholarshipRate = scholarshipRate;
    }
}
