package com.glosaryconstarint.app.modules.mysubscription.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class MySubscriptionModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSubscriptionW: String? =
      MyApp.getInstance().resources.getString(R.string.msg_subscription_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtExcitedToServ: String? =
      MyApp.getInstance().resources.getString(R.string.msg_excited_to_serv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt23September2: String? =
      MyApp.getInstance().resources.getString(R.string.msg_23_september_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMySubscription: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_my_subscription)

)
