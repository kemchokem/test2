package com.glosaryconstarint.app.modules.loginwithmobile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.loginwithmobile.`data`.model.LoginWithMobileModel

public class LoginWithMobileVM : ViewModel() {
  public val loginWithMobileModel: MutableLiveData<LoginWithMobileModel> =
      MutableLiveData(LoginWithMobileModel())

  public var navArguments: Bundle? = null
}
