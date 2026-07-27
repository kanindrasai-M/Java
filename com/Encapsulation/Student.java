package com.Encapsulation;

public class Student {
    private int rollNumber;
    private String name;
    private boolean isAttended;

    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public void setAttended(boolean Attended) {
        if(!isAttended)
            isAttended = Attended;
        System.out.println("Teacher assgined Attendence for student");
    }
    public boolean getAttendence() {
        System.out.println("Teacher accessed student attendece");
        return isAttended;
    }
}
