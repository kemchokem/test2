package com.glosaryconstarint.app.modules.otpsent.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.otpsent.`data`.model.OtpSentModel

public class OtpSentVM : ViewModel() {
  public val otpSentModel: MutableLiveData<OtpSentModel> = MutableLiveData(OtpSentModel())

  public var navArguments: Bundle? = null
}
