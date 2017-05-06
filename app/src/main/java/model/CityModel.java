package model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * model class
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

    /**
     * default constructor
     */
    public CityModel() {

    }

    /**
     *
     * @param in in
     */
    protected CityModel(final Parcel in) {

    }

    /**
     *
     * @return creater
     */
    public static Creator<CityModel> getCREATOR() {
        return CREATOR;
    }

    /**
     *
     * @param dest dest
     * @param flags flags
     */
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {

    }



    @Override
    public int describeContents() {
        return 0;
    }

}