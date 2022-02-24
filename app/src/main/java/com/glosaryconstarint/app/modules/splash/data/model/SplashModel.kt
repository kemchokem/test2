package com.glosaryconstarint.app.modules.splash.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class SplashModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSGGrocery: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_sg_grocery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourNeedsInJ: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_needs_in_j)

)
