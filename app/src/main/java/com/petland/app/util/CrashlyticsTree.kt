package com.petland.app.util

import com.google.firebase.crashlytics.FirebaseCrashlytics
import timber.log.Timber


class CrashlyticsTree : Timber.Tree() {

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        if (t != null) {
            FirebaseCrashlytics.getInstance().recordException(t)
        }
    }
}
