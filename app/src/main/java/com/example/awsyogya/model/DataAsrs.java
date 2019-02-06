package com.example.awsyogya.model;

public class DataAsrs
{
    private String IDStation;

    private String sunshine;

    private String alltitude;

    private String reflective_rad;

    private String azimuth;

    private String global_rad;

    private String battery;

    private String record_id;

    private String nett_rad;

    private String Jam;

    private String diffuse_rad;

    private String Tanggal;

    private String dni;

    public String getIDStation ()
    {
        return IDStation;
    }

    public void setIDStation (String IDStation)
    {
        this.IDStation = IDStation;
    }

    public String getSunshine ()
    {
        return sunshine;
    }

    public void setSunshine (String sunshine)
    {
        this.sunshine = sunshine;
    }

    public String getAlltitude ()
    {
        return alltitude;
    }

    public void setAlltitude (String alltitude)
    {
        this.alltitude = alltitude;
    }

    public String getReflective_rad ()
    {
        return reflective_rad;
    }

    public void setReflective_rad (String reflective_rad)
    {
        this.reflective_rad = reflective_rad;
    }

    public String getAzimuth ()
    {
        return azimuth;
    }

    public void setAzimuth (String azimuth)
    {
        this.azimuth = azimuth;
    }

    public String getGlobal_rad ()
    {
        return global_rad;
    }

    public void setGlobal_rad (String global_rad)
    {
        this.global_rad = global_rad;
    }

    public String getBattery ()
    {
        return battery;
    }

    public void setBattery (String battery)
    {
        this.battery = battery;
    }

    public String getRecord_id ()
    {
        return record_id;
    }

    public void setRecord_id (String record_id)
    {
        this.record_id = record_id;
    }

    public String getNett_rad ()
    {
        return nett_rad;
    }

    public void setNett_rad (String nett_rad)
    {
        this.nett_rad = nett_rad;
    }

    public String getJam ()
    {
        return Jam;
    }

    public void setJam (String Jam)
    {
        this.Jam = Jam;
    }

    public String getDiffuse_rad ()
    {
        return diffuse_rad;
    }

    public void setDiffuse_rad (String diffuse_rad)
    {
        this.diffuse_rad = diffuse_rad;
    }

    public String getTanggal ()
    {
        return Tanggal;
    }

    public void setTanggal (String Tanggal)
    {
        this.Tanggal = Tanggal;
    }

    public String getDni ()
    {
        return dni;
    }

    public void setDni (String dni)
    {
        this.dni = dni;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [IDStation = "+IDStation+", sunshine = "+sunshine+", alltitude = "+alltitude+", reflective_rad = "+reflective_rad+", azimuth = "+azimuth+", global_rad = "+global_rad+", battery = "+battery+", record_id = "+record_id+", nett_rad = "+nett_rad+", Jam = "+Jam+", diffuse_rad = "+diffuse_rad+", Tanggal = "+Tanggal+", dni = "+dni+"]";
    }
}

