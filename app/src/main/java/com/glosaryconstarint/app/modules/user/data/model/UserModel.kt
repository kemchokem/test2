package com.glosaryconstarint.app.modules.user.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class UserModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtGeorgeD: String? = MyApp.getInstance().resources.getString(R.string.lbl_george_d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtgeorge31: String? = MyApp.getInstance().resources.getString(R.string.lbl_george31)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etMyOrdersValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etMySubscriptionValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etMyAddressesValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etMyWalletValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etNotificationsValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etSettingsValue: String? = null
)
