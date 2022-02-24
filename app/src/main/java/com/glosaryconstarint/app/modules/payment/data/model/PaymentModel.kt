package com.glosaryconstarint.app.modules.payment.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class PaymentModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtChoosePayment: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEnterCVV: String? = MyApp.getInstance().resources.getString(R.string.lbl_enter_cvv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEg123: String? = MyApp.getInstance().resources.getString(R.string.lbl_e_g_123)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAddNewCard: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_new_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourPersonalD: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_personal_d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtContactDetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_contact_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPhoneNumber: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_phone_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtChooseDelivery: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_delivery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAddNewAddress: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_new_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDoYouHaveAP: String? =
      MyApp.getInstance().resources.getString(R.string.msg_do_you_have_a_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etFirstNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etLastNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterYourCodeValue: String? = null
)
