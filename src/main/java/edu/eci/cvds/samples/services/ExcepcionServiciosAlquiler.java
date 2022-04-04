package edu.eci.cvds.samples.services;

import org.apache.ibatis.exceptions.PersistenceException;

public class ExcepcionServiciosAlquiler extends Exception {

    public ExcepcionServiciosAlquiler(String msg) {
        super(msg);
    }
    public ExcepcionServiciosAlquiler(String msg, PersistenceException ex) {
        super(msg);
    }
}
