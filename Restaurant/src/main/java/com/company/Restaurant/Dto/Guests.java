package com.company.Restaurant.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="guests")
public class Guests {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String lastName;
    private String firstName;
    private Integer numInParty;

    private Integer tableNum;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tableNum", updatable = false, insertable = false)
    private Tables tables;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getNumInParty() {
        return numInParty;
    }

    public void setNumInParty(Integer numInParty) {
        this.numInParty = numInParty;
    }

    public Tables getTables() {
        return tables;
    }

    public Integer getTableNum() {
        return tableNum;
    }

    public void setTableNum(Integer tableNum) {
        this.tableNum = tableNum;
    }
}

