package model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by himanshu on 30/4/17.
 */

public class CityModel implements Parcelable {

    public static final Creator<CityModel> CREATOR = new Creator<CityModel>() {
        @Override
        public CityModel createFromParcel(final Parcel in) {
            return new CityModel(in);
        }

        @Override
        public CityModel[] newArray(final int size) {
            return new CityModel[size];
        }
    };

    public CityModel() {

    }

    @Override
    public int describeContents() {
        return 0;
    }

    protected CityModel(final Parcel in) {

    }

    public static Creator<CityModel> getCREATOR() {
        return CREATOR;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}