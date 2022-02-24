package com.glosaryconstarint.app.modules.faq.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class FaqModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFAQ: String? = MyApp.getInstance().resources.getString(R.string.lbl_faq)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHowDoIKnowA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_how_do_i_know_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPlacingAnOrde: String? =
      MyApp.getInstance().resources.getString(R.string.msg_placing_an_orde)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNotListedYour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_not_listed_your)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etSelectCategoryValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etWriteYourQuesValue: String? = null
)
