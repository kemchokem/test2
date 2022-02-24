package com.glosaryconstarint.app.modules.aboutus.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class AboutUsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAbout: String? = MyApp.getInstance().resources.getString(R.string.lbl_about)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhatBeganLitt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_began_litt)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhyChooseUs: String? =
      MyApp.getInstance().resources.getString(R.string.msg_why_choose_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWeDoNotBuyF: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_do_not_buy_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWeWouldLikeT: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_would_like_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSomeOfThePeo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_some_of_the_peo)

)
