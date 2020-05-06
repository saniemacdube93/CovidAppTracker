package com.example.covidapptracker.ui.country;

public class CovidCountry {

    String mCovidCountry , mCases , mTodaCases , mDeaths , mTodayDeaths ,mRecoverd , mCritical ;

    public CovidCountry(String mCovidCountry, String mCases) {
        this.mCovidCountry = mCovidCountry;
        this.mCases = mCases;
        this.mTodaCases = mTodaCases;
        this.mDeaths = mDeaths;
        this.mTodayDeaths = mTodayDeaths;
        this.mRecoverd = mRecoverd;
        this.mCritical = mCritical;
    }


    public String getmCovidCountry() {
        return mCovidCountry;
    }

    public void setmCovidCountry(String mCovidCountry) {
        this.mCovidCountry = mCovidCountry;
    }

    public String getmCases() {
        return mCases;
    }

    public void setmCases(String mCases) {
        this.mCases = mCases;
    }
}
