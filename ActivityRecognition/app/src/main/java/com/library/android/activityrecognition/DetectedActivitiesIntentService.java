package com.library.android.activityrecognition;


import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

public class DetectedActivitiesIntentService extends IntentService {

    private static final String TAG = DetectedActivitiesIntentService.class.getSimpleName();

    public DetectedActivitiesIntentService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

    }
}
