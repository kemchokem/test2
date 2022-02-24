package com.glosaryconstarint.app.modules.payment.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.payment.`data`.model.Payment1RowModel
import com.glosaryconstarint.app.modules.payment.`data`.model.Payment2RowModel
import com.glosaryconstarint.app.modules.payment.`data`.model.PaymentModel
import kotlin.collections.MutableList

public class PaymentVM : ViewModel() {
  public val paymentModel: MutableLiveData<PaymentModel> = MutableLiveData(PaymentModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup655List: MutableLiveData<MutableList<Payment1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup654List: MutableLiveData<MutableList<Payment2RowModel>> =
      MutableLiveData(mutableListOf())
}
