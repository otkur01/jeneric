package org.example;

public enum projectStatus {
    OPEN, CLOSED, PROGRESS("IN PROGRESS");
    private String Status;

    projectStatus(String status) {
        Status = status;
    }

    public String getStatus() {
        return Status;
    }

    projectStatus() {
    }
}
