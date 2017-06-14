package com.shahid.android.criminalintent;

import java.util.UUID;

/**
 * Created by shahid on 6/13/2017.
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime(){
        this.mId = UUID.randomUUID();
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
}
