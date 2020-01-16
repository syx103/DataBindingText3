package com.example.databiningtext;

import android.database.Observable;

import androidx.databinding.ObservableField;
import androidx.databinding.ObservableFloat;

public class ObservableGood {
    private ObservableField<String> name;
    private ObservableField<String> details;
    private ObservableFloat prices;
    public ObservableGood(ObservableField<String> name,ObservableField<String> details,ObservableFloat prices) {
        this.details = details;
        this.name = name;
        this.prices = prices;
    }

    public ObservableField<String> getDetails() {
        return details;
    }

    public ObservableFloat getPrices() {
        return prices;
    }

    public ObservableField<String> getName() {
        return name;
    }
    /*不能通过set方法改变值*/
    /*public void setName(ObservableField<String> name) {
        this.name = name;
    }

    public void setDetails(ObservableField<String> details) {
        this.details = details;
    }

    public void setPrices(ObservableFloat prices) {
        this.prices = prices;
    }*/
}
