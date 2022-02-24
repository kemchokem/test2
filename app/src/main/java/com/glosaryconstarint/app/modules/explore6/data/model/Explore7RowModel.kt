package com.glosaryconstarint.app.modules.explore6.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore7RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtJaggeryPowder: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_jaggery_powder)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt4: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt500G: String? = MyApp.getInstance().resources.getString(R.string.lbl_500_g)

)
