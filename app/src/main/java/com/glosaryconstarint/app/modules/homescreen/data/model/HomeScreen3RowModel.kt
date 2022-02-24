package com.glosaryconstarint.app.modules.homescreen.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class HomeScreen3RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSoftDrinks: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_soft_drinks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUpto40Off: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_upto_40_off)

)
