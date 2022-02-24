package com.glosaryconstarint.app.modules.loginwithmobile.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class LoginWithMobileModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoginRegist: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_regist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMobileNumber: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_mobile_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOrContinueWit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_continue_wit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_19)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEnterYourMobi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_mobi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSGGrocery: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_sg_grocery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGoogle: String? = MyApp.getInstance().resources.getString(R.string.lbl_google)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFacebook: String? = MyApp.getInstance().resources.getString(R.string.lbl_facebook)

)
