package com.glosaryconstarint.app.modules.explore.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore4RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtA2MATEMilk: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_a2mate_milk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt05Ltr: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_5_ltr)

)
