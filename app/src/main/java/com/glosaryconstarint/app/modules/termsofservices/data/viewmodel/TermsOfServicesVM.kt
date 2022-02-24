package com.glosaryconstarint.app.modules.termsofservices.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.termsofservices.`data`.model.TermsOfServicesModel

public class TermsOfServicesVM : ViewModel() {
  public val termsOfServicesModel: MutableLiveData<TermsOfServicesModel> =
      MutableLiveData(TermsOfServicesModel())

  public var navArguments: Bundle? = null
}
