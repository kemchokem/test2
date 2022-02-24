package com.glosaryconstarint.app.modules.explore6.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore9RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtStrawberry: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_strawberry)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt4: String? = MyApp.getInstance().resources.getString(R.string.lbl_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1Kg: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_kg)

)
