package com.example.android.miwok;

/**
 * Created by vineet on 29-Dec-16.
 */

public class Word {
    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    private boolean flag = false;
    /**
     * image resource ID for the word
     */
    private int mImageResourceId;
    /**
     * resource ID for audio of each word
     */
    private int mAudioResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     **/
    public Word(String miwokTranslation, String defaultTranslation, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param ImageResourceId    is the resource id for the image resource
     **/
    public Word(String miwokTranslation, String defaultTranslation, int ImageResourceId, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = audioResourceId;
        flag = true;
    }

    /**
     * Get the Miwok translation of the word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the default translation of the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the image resource ID of the word
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * return true if image present else false
     */
    public boolean hasImage() {
        return flag;
    }

    /**
     * return the audio resource ID for each word
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
