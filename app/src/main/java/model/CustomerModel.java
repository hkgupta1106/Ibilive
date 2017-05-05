package model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by himanshu on 29/4/17.
 */

public class CustomerModel implements Parcelable {

    String name,city;

    public static final Creator<CustomerModel> CREATOR = new Creator<CustomerModel>() {
        @Override
        public CustomerModel createFromParcel(final Parcel in) {
            return new CustomerModel(in);
        }

        @Override
        public CustomerModel[] newArray(final int size) {
            return new CustomerModel[size];
        }
    };

    public CustomerModel(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    protected CustomerModel(final Parcel in) {
        name = in.readString();
        city = in.readString();
    }

    public static Creator<CustomerModel> getCREATOR() {
        return CREATOR;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(city);
    }
}
