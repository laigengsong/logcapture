package com.songcream.logcapture;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by gengsong on 2018/6/29.
 */

public class LogBean implements Parcelable{
    private long time;
    private String url;
    private String body;
    private String response;

    public LogBean(){}

    protected LogBean(Parcel in) {
        super();
        time = in.readLong();
        url = in.readString();
        body = in.readString();
        response = in.readString();
    }

    public static final Creator<LogBean> CREATOR = new Creator<LogBean>() {
        @Override
        public LogBean createFromParcel(Parcel in) {
            return new LogBean(in);
        }

        @Override
        public LogBean[] newArray(int size) {
            return new LogBean[size];
        }
    };

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(time);
        dest.writeString(url);
        dest.writeString(body);
        dest.writeString(response);
    }

}
