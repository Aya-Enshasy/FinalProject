
package com.example.pablo.model.hotels;

import java.io.Serializable;

import com.example.pablo.model.hotel.HotelsData;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelsExample implements Serializable
{

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private HotelsData data;
    private final static long serialVersionUID = -5286599594202548749L;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HotelsData getData() {
        return data;
    }

    public void setData(HotelsData data) {
        this.data = data;
    }

}
