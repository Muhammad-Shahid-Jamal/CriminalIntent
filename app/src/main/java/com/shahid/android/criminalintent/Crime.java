package com.shahid.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by shahid on 6/13/2017.
 */

public class Crime {
    private UUID mId;
    private Date mDate;
    private boolean mSolved;
    private String mTitle;

    public Crime(){
        this.mId = UUID.randomUUID();
        this.mDate = new Date();
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }
}
