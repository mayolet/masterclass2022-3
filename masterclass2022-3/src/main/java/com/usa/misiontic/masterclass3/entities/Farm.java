package com.usa.misiontic.masterclass3.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;






@Entity
@Table(name = "farm")
public class Farm implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFarm;
    private String address;
    private Integer exencion;
    private String category_id;
    private String name;

    public Integer getIdFarm() {
        return idFarm;
    }

    public void setIdFarm(Integer idFarm) {
        this.idFarm = idFarm;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getExencion() {
        return exencion;
    }

    public void setExencion(Integer exencion) {
        this.exencion = exencion;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  

}
