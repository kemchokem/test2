package com.glosaryconstarint.app.modules.mycart.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.mycart.`data`.model.MyCart1RowModel
import com.glosaryconstarint.app.modules.mycart.`data`.model.MyCart2RowModel
import com.glosaryconstarint.app.modules.mycart.`data`.model.MyCartModel
import kotlin.collections.MutableList

public class MyCartVM : ViewModel() {
  public val myCartModel: MutableLiveData<MyCartModel> = MutableLiveData(MyCartModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup259List: MutableLiveData<MutableList<MyCart1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup258List: MutableLiveData<MutableList<MyCart2RowModel>> =
      MutableLiveData(mutableListOf())
}
