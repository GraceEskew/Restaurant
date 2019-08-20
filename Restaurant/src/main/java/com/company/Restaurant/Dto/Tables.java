package com.company.Restaurant.Dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="tables")
public class Tables {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tableNum;
    private Integer numSeats;
    private Boolean isAvailable;

    @OneToMany(mappedBy="guests", cascade= CascadeType.ALL, fetch=FetchType.EAGER)
    @JsonIgnore
    public Integer getTableNum() {
        return tableNum;
    }

    public void setTableNum(Integer tableNum) {
        this.tableNum = tableNum;
    }

    public Integer getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(Integer numSeats) {
        this.numSeats = numSeats;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}
