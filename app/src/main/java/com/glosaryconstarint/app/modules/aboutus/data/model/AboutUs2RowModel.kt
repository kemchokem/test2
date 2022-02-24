package com.glosaryconstarint.app.modules.aboutus.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class AboutUs2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtJaneCooper: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_jane_cooper)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFounder: String? = MyApp.getInstance().resources.getString(R.string.lbl_founder)

)
