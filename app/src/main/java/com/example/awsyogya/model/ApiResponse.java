package com.example.awsyogya.model;


public class ApiResponse
{
    private DataBmkg[] data;

    private String message;

    private String status;

    public DataBmkg[] getData ()
    {
        return data;
    }

    public void setData (DataBmkg[] data)
    {
        this.data = data;
    }

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

    @Override
    public String toString()
    {
        return "ClassPojo [data = "+data+", message = "+message+", status = "+status+"]";
    }
}

