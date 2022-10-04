package com.itranswarp.learnjava;

public class VTPConfig {
    private CountryConfig[] countries;
    public void setCountries(CountryConfig[] countries){
        this.countries = countries;
    }
    public CountryConfig[] getCountries(){
        return countries;
    }
}



class CountryConfig{
    private String priority;
    private String country;
    private String countryFriends;

    public void setPriority(String priority){
        this.priority = priority;
    }
    public String getPriority(){
        return this.priority;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return this.country;
    }
    public void setCountryFriends(String countryFriends){
        this.countryFriends = countryFriends;
    }

    @Override
    public String toString(){
        return String.format("priority: %s, country: %s, countryFriends: %s", priority, country, countryFriends);
    }
}
