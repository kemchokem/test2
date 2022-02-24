package com.glosaryconstarint.app.modules.mysubscription.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.mysubscription.`data`.model.MySubscription1RowModel
import com.glosaryconstarint.app.modules.mysubscription.`data`.model.MySubscriptionModel
import kotlin.collections.MutableList

public class MySubscriptionVM : ViewModel() {
  public val mySubscriptionModel: MutableLiveData<MySubscriptionModel> =
      MutableLiveData(MySubscriptionModel())

  public var navArguments: Bundle? = null

  public val recyclerMySubscriptionList: MutableLiveData<MutableList<MySubscription1RowModel>> =
      MutableLiveData(mutableListOf())
}
