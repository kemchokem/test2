package com.glosaryconstarint.app.modules.mycart.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class MyCartModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtMyCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPaymentDetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTomorrow7AM: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tomorrow_7_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtShippingCharge: String? =
      MyApp.getInstance().resources.getString(R.string.msg_shipping_charge)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFree: String? = MyApp.getInstance().resources.getString(R.string.lbl_free)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDiscount: String? = MyApp.getInstance().resources.getString(R.string.lbl_discount)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt000: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTotalMRP: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_mrp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt997: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_97)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt998: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_972)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPromoCodeCan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_promo_code_can)

)
