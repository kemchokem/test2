package com.glosaryconstarint.app.modules.details.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class Details1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPinapple: String? = MyApp.getInstance().resources.getString(R.string.lbl_pinapple)

)
