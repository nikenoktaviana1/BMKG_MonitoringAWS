package com.example.awsyogya.model;


public class ApiResponse
{
    private String message;

    private String status;

    private DataBmkg [] data;

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

    public DataBmkg[] getData ()
    {
        return data;
    }

    public void setData (DataBmkg[] data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [message = "+message+", status = "+status+", data = "+data+"]";
    }
}