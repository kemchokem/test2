package com.glosaryconstarint.app.modules.homescreen.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class HomeScreen4RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtGranolaPremiu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_granola_premiu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1Kg: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2200: String? = MyApp.getInstance().resources.getString(R.string.lbl_22_00)

)
