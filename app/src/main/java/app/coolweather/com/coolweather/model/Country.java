package app.coolweather.com.coolweather.model;

/**
 * Created by hui on 2016/10/22.
 */
public class Country {
    private int id;;
    private String countryCode;
    private int cityId;
    private String countryName;

    public String getCountryName() {
        return countryName;
    }
    public String getCountryCode() {
        return countryCode;
    }
    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public int getCityId() {
        return cityId;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
}
