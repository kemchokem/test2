package com.glosaryconstarint.app.modules.faq.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class Faq2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhatIsMinimum: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_is_minimum)

)
