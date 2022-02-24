package com.glosaryconstarint.app.modules.correctmobilenumber.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.correctmobilenumber.`data`.model.CorrectMobileNumberModel

public class CorrectMobileNumberVM : ViewModel() {
  public val correctMobileNumberModel: MutableLiveData<CorrectMobileNumberModel> =
      MutableLiveData(CorrectMobileNumberModel())

  public var navArguments: Bundle? = null
}
