package com.glosaryconstarint.app.modules.aboutus.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class AboutUs1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt100OrganicF: String? =
      MyApp.getInstance().resources.getString(R.string.msg_100_organic_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFastDelivery: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_fast_delivery)

)
