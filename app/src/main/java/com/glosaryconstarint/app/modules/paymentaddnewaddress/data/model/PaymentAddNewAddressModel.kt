package com.glosaryconstarint.app.modules.paymentaddnewaddress.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class PaymentAddNewAddressModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAddNewAddress: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_new_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPincode: String? = MyApp.getInstance().resources.getString(R.string.lbl_pincode)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWorkOffice: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_work_office)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etCountryValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etStateValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etCityValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etAreaValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etLandmarkValue: String? = null
)
