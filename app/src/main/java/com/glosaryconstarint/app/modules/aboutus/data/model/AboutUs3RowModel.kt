package com.glosaryconstarint.app.modules.aboutus.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class AboutUs3RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrivacyPolicy: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_privacy_policy)

)
