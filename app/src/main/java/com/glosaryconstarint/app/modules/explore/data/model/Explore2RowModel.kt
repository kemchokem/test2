package com.glosaryconstarint.app.modules.explore.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTomato: String? = MyApp.getInstance().resources.getString(R.string.lbl_tomato)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1Kg: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_kg)

)
