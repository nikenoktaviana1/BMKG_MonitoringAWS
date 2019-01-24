package com.example.awsyogya.model;

public class AsrsResponse
{
    private String message;

    private String status;

    private DataAsrs[] data;

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public DataAsrs[] getData ()
    {
        return data;
    }

    public void setData (DataAsrs[] data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [message = "+message+", status = "+status+", data = "+data+"]";
    }
}


