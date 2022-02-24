package com.glosaryconstarint.app.modules.correctotp.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.correctotp.`data`.model.CorrectOtpModel

public class CorrectOtpVM : ViewModel() {
  public val correctOtpModel: MutableLiveData<CorrectOtpModel> = MutableLiveData(CorrectOtpModel())

  public var navArguments: Bundle? = null
}
