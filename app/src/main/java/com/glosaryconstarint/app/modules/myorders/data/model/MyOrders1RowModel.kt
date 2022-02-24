package com.glosaryconstarint.app.modules.myorders.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class MyOrders1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtGetInvoice: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_get_invoice)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDeliveredOn23: String? =
      MyApp.getInstance().resources.getString(R.string.msg_delivered_on_23)

)
