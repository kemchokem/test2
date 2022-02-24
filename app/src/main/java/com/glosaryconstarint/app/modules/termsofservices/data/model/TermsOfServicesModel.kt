package com.glosaryconstarint.app.modules.termsofservices.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class TermsOfServicesModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTermsOfServic: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terms_of_servic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTermsAndCondi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terms_and_condi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWELCOMETOALL: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtByPlacingAnO: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_placing_an_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhenYouPlace: String? =
      MyApp.getInstance().resources.getString(R.string.msg_when_you_place)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOURDELIVERYSE: String? =
      MyApp.getInstance().resources.getString(R.string.msg_our_delivery_se)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFromTimeToTi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_from_time_to_ti)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWeAcceptOnly: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_accept_only)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPAYMENT: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPRICEANDAVAIL: String? =
      MyApp.getInstance().resources.getString(R.string.msg_price_and_avail)

)
