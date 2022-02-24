package com.glosaryconstarint.app.modules.paymentaddnewaddress.ui

import androidx.fragment.app.viewModels
import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.glosaryconstarint.app.databinding.BottomsheetPaymentAddNewAddressBinding
import com.glosaryconstarint.app.modules.paymentaddnewaddress.`data`.viewmodel.PaymentAddNewAddressVM
import kotlin.String
import kotlin.Unit

public class PaymentAddNewAddressBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetPaymentAddNewAddressBinding>(R.layout.bottomsheet_payment_add_new_address)
    {
  private val viewModel: PaymentAddNewAddressVM by viewModels<PaymentAddNewAddressVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.paymentAddNewAddressVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "PAYMENT_ADD_NEW_ADDRESS_BOTTOMSHEET"
  }
}
