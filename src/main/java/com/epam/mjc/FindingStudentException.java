package com.epam.mjc;

public class FindingStudentException extends IllegalArgumentException {

    public FindingStudentException(String s) {
        super("Could not find student with ID " + s);
    }
}
