package com.glosaryconstarint.app.modules.myorders.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class MyOrdersModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtMyOrders: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_orders2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOrderHistory: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_order_history)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtArrivesTomorro: String? =
      MyApp.getInstance().resources.getString(R.string.msg_arrives_tomorro)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt7AMPM: String? = MyApp.getInstance().resources.getString(R.string.lbl_7_am_pm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGetInvoice: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_get_invoice)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEditOrder: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_edit_order)

)
