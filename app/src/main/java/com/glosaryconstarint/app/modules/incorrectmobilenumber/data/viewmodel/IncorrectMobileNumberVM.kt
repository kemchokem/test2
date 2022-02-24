package com.glosaryconstarint.app.modules.incorrectmobilenumber.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.incorrectmobilenumber.`data`.model.IncorrectMobileNumber1RowModel
import com.glosaryconstarint.app.modules.incorrectmobilenumber.`data`.model.IncorrectMobileNumberModel
import kotlin.collections.MutableList

public class IncorrectMobileNumberVM : ViewModel() {
  public val incorrectMobileNumberModel: MutableLiveData<IncorrectMobileNumberModel> =
      MutableLiveData(IncorrectMobileNumberModel())

  public var navArguments: Bundle? = null

  public val recyclerIncorrectMobileNumberList:
      MutableLiveData<MutableList<IncorrectMobileNumber1RowModel>> =
      MutableLiveData(mutableListOf())
}
