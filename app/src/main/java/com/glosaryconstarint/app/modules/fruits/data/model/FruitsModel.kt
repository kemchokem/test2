package com.glosaryconstarint.app.modules.fruits.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class FruitsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFruits: String? = MyApp.getInstance().resources.getString(R.string.lbl_fruits)

)
