package com.example.submission1.base

import android.content.Context

interface IBaseView {

    fun contextView(): Context

    fun onShowProgressbar()

    fun onHideProgressbar()

    fun onPushInformation(message: String?, data: Any?)

}
