package com.glosaryconstarint.app.modules.paymentaddnewaddress.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.paymentaddnewaddress.`data`.model.PaymentAddNewAddressModel

public class PaymentAddNewAddressVM : ViewModel() {
  public val paymentAddNewAddressModel: MutableLiveData<PaymentAddNewAddressModel> =
      MutableLiveData(PaymentAddNewAddressModel())

  public var navArguments: Bundle? = null
}
