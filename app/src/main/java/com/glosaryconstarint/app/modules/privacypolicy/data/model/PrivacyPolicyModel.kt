package com.glosaryconstarint.app.modules.privacypolicy.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class PrivacyPolicyModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtInformationCol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_information_col)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrivacyPolicy: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_privacy_policy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSGGroceryIsC: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sg_grocery_is_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSGGroceryColl: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sg_grocery_coll)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWeWillUseYo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_will_use_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUseOfYourInf: String? =
      MyApp.getInstance().resources.getString(R.string.msg_use_of_your_inf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWeReserveThe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_reserve_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLegalDisclaime: String? =
      MyApp.getInstance().resources.getString(R.string.msg_legal_disclaime)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSGGroceryRese: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sg_grocery_rese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtChangesInThis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_changes_in_this)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLastUpdatedOn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_last_updated_on)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrivacyPolicy1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_privacy_policy)

)
