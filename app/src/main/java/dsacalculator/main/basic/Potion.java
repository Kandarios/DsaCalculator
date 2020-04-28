package dsacalculator.main.basic;

import java.util.List;

public class Potion {

    String name;
    String category;
    String labor;
    String price;
    String acquisition;
    String availability;
    String creation;
    String identification;
    String page;

    public Potion(String[] csvList) {
        this.name = csvList[0];
        this.category = csvList[1];
        this.labor = csvList[2];
        this.price = csvList[3];
        this.acquisition = csvList[4];
        this.availability = csvList[5];
        this.creation = csvList[6];
        this.identification = csvList[7];
        this.page = csvList[8];
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLabor() {
        return labor;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAcquisition() {
        return acquisition;
    }

    public void setAcquisition(String acquisition) {
        this.acquisition = acquisition;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getCreation() {
        return creation;
    }

    public void setCreation(String creation) {
        this.creation = creation;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }



}
