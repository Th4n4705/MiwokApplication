package com.example.android.miwok;

public class ItemModule {

    private int imageId;
    private String nativeLanguage;
    private String miwokLanguage;


    public ItemModule(int imageId, String nativeLanguage, String miwokLanguage){
        this.imageId = imageId;
        this.nativeLanguage = nativeLanguage;
        this.miwokLanguage = miwokLanguage;
    }

    public int getImageId() {
        return imageId;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }

    public String getMiwokLanguage() {
        return miwokLanguage;
    }


}
