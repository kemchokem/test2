package com.glosaryconstarint.app.modules.myorders.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.myorders.`data`.model.MyOrders1RowModel
import com.glosaryconstarint.app.modules.myorders.`data`.model.MyOrdersModel
import kotlin.collections.MutableList

public class MyOrdersVM : ViewModel() {
  public val myOrdersModel: MutableLiveData<MyOrdersModel> = MutableLiveData(MyOrdersModel())

  public var navArguments: Bundle? = null

  public val recyclerMyOrdersList: MutableLiveData<MutableList<MyOrders1RowModel>> =
      MutableLiveData(mutableListOf())
}
