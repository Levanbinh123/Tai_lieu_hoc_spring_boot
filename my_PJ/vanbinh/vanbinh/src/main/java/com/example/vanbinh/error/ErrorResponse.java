package com.example.vanbinh.error;

public class ErrorResponse {
    private int status;
    private String message;
    private long timestamp;
    public ErrorResponse(int status, String message) {

        this.status = status;
        this.message = message;
        this.timestamp =System.currentTimeMillis();
    }

    public ErrorResponse() {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
