package com.glosaryconstarint.app.modules.details.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.details.`data`.model.Details1RowModel
import com.glosaryconstarint.app.modules.details.`data`.model.DetailsModel
import kotlin.collections.MutableList

public class DetailsVM : ViewModel() {
  public val detailsModel: MutableLiveData<DetailsModel> = MutableLiveData(DetailsModel())

  public var navArguments: Bundle? = null

  public val recyclerDetailsList: MutableLiveData<MutableList<Details1RowModel>> =
      MutableLiveData(mutableListOf())
}
