package com.glosaryconstarint.app.modules.splash.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.splash.`data`.model.SplashModel

public class SplashVM : ViewModel() {
  public val splashModel: MutableLiveData<SplashModel> = MutableLiveData(SplashModel())

  public var navArguments: Bundle? = null
}
