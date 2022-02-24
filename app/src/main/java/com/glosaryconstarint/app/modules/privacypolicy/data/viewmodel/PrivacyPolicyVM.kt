package com.glosaryconstarint.app.modules.privacypolicy.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.privacypolicy.`data`.model.PrivacyPolicyModel

public class PrivacyPolicyVM : ViewModel() {
  public val privacyPolicyModel: MutableLiveData<PrivacyPolicyModel> =
      MutableLiveData(PrivacyPolicyModel())

  public var navArguments: Bundle? = null
}
