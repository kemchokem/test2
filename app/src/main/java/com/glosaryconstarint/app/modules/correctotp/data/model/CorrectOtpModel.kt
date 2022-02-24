package com.glosaryconstarint.app.modules.correctotp.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class CorrectOtpModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSGGrocery: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_sg_grocery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoginRegist: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_regist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOTPIsSendTo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_otp_is_send_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtResend: String? = MyApp.getInstance().resources.getString(R.string.lbl_resend)

)
