package com.glosaryconstarint.app.modules.explore.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore5RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtParleRusk: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_parle_rusk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt3: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt500G: String? = MyApp.getInstance().resources.getString(R.string.lbl_500_g)

)
