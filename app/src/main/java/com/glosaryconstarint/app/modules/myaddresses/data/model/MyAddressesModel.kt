package com.glosaryconstarint.app.modules.myaddresses.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class MyAddressesModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtMyAddresses: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_my_addresses)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAddNewAddress: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_new_address)

)
