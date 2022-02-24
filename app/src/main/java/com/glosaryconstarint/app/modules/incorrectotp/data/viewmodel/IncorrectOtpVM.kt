package com.glosaryconstarint.app.modules.incorrectotp.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.incorrectotp.`data`.model.IncorrectOtpModel

public class IncorrectOtpVM : ViewModel() {
  public val incorrectOtpModel: MutableLiveData<IncorrectOtpModel> =
      MutableLiveData(IncorrectOtpModel())

  public var navArguments: Bundle? = null
}
