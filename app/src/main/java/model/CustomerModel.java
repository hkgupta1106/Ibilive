package model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * model class
 */

public class CustomerModel implements Parcelable {

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
    private String name, city;
    /**
     * @param name name
     * @param city city
     */
    public CustomerModel(final String name, final String city) {
        this.name = name;
        this.city = city;
    }

    /**
     * @param in in
     */
    protected CustomerModel(final Parcel in) {
        name = in.readString();
        city = in.readString();
    }

    /**
     * @return creater
     */
    public static Creator<CustomerModel> getCREATOR() {
        return CREATOR;
    }
    /**
     * @param dest  dest
     * @param flags flags
     */
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        dest.writeString(name);
        dest.writeString(city);
    }

    /**
     * @return getting name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name setting name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return getting name
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city setting name
     */
    public void setCity(final String city) {
        this.city = city;
    }


    @Override
    public int describeContents() {
        return 0;
    }
}
