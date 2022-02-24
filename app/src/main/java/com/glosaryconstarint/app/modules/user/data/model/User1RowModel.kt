package com.glosaryconstarint.app.modules.user.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class User1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFAQ: String? = MyApp.getInstance().resources.getString(R.string.lbl_faq)

)
