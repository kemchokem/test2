package com.glosaryconstarint.app.modules.contactus.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class ContactUsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtContactUs: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_contact_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGetInTouch: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_get_in_touch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOneOfOurWork: String? =
      MyApp.getInstance().resources.getString(R.string.msg_one_of_our_work)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourDetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_your_details)
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
  public var txt2464RoyalLn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_2464_royal_ln)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt177360048: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_773_600_48)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt177360049: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_773_600_482)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSggrocerygmail: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sggrocery_gmail)
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
  public var etAdditionalInfoValue: String? = null
)
