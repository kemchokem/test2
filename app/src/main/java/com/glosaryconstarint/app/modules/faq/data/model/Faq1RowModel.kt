package com.glosaryconstarint.app.modules.faq.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class Faq1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhereDoYouDe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_where_do_you_de)

)
