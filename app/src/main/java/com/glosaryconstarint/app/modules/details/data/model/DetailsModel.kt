package com.glosaryconstarint.app.modules.details.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class DetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtGreenApple: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_green_apple)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSpecialPrice: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_special_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt42Off: String? = MyApp.getInstance().resources.getString(R.string.lbl_42_off)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRelatedItems: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_related_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_description)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGreenApplesHa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_green_apples_ha)

)
