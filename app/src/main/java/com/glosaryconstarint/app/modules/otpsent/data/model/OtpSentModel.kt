package com.glosaryconstarint.app.modules.otpsent.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class OtpSentModel(
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
  public var txtResendIn30s: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_resend_in_30s)

)
