package com.example.demo;
import jakarta.persistence.*;

@Entity
        @Table(name="Phones")
public class Phone {

        public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModel(String modelName) {
        this.modelName = modelName;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String manufacturer;
    private String modelName;
    private String publishYear;

    public Phone(String manufacturer, String modelName, String publishYear) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.publishYear = publishYear;
    }

    public Phone(){

    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + modelName + '\'' +
                ", publishYear='" + publishYear +
                '}';
    }
}
