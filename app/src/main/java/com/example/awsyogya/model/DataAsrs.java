package com.example.awsyogya.model;

public class DataAsrs
{
    private String Tanggal, alltitude, diffuse_rad, global_rad, nett_rad, record_id, battery;
    private String reflective_rad, Jam, sunshine, azimuth, dni, IDStation;

    public String getTanggal ()
    {
        return Tanggal;
    }

    public void setTanggal (String Tanggal)
    {
        this.Tanggal = Tanggal;
    }

    public String getAlltitude ()
    {
        return alltitude;
    }

    public void setAlltitude (String alltitude)
    {
        this.alltitude = alltitude;
    }

    public String getDiffuse_rad ()
    {
        return diffuse_rad;
    }

    public void setDiffuse_rad (String diffuse_rad)
    {
        this.diffuse_rad = diffuse_rad;
    }

    public String getGlobal_rad ()
    {
        return global_rad;
    }

    public void setGlobal_rad (String global_rad)
    {
        this.global_rad = global_rad;
    }

    public String getNett_rad ()
    {
        return nett_rad;
    }

    public void setNett_rad (String nett_rad)
    {
        this.nett_rad = nett_rad;
    }

    public String getRecord_id ()
    {
        return record_id;
    }

    public void setRecord_id (String record_id)
    {
        this.record_id = record_id;
    }

    public String getBattery ()
    {
        return battery;
    }

    public void setBattery (String battery)
    {
        this.battery = battery;
    }

    public String getReflective_rad ()
    {
        return reflective_rad;
    }

    public void setReflective_rad (String reflective_rad)
    {
        this.reflective_rad = reflective_rad;
    }

    public String getJam ()
    {
        return Jam;
    }

    public void setJam (String Jam)
    {
        this.Jam = Jam;
    }

    public String getSunshine ()
    {
        return sunshine;
    }

    public void setSunshine (String sunshine)
    {
        this.sunshine = sunshine;
    }

    public String getAzimuth ()
    {
        return azimuth;
    }

    public void setAzimuth (String azimuth)
    {
        this.azimuth = azimuth;
    }

    public String getDni ()
    {
        return dni;
    }

    public void setDni (String dni)
    {
        this.dni = dni;
    }

    public String getIDStation ()
    {
        return IDStation;
    }

    public void setIDStation (String IDStation)
    {
        this.IDStation = IDStation;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Tanggal = "+Tanggal+", alltitude = "+alltitude+", diffuse_rad = "+diffuse_rad+", global_rad = "+global_rad+", nett_rad = "+nett_rad+", record_id = "+record_id+", battery = "+battery+", reflective_rad = "+reflective_rad+", Jam = "+Jam+", sunshine = "+sunshine+", azimuth = "+azimuth+", dni = "+dni+", IDStation = "+IDStation+"]";
    }
}
