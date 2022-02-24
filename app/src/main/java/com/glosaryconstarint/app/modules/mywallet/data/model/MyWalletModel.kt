package com.glosaryconstarint.app.modules.mywallet.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class MyWalletModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtMyWallet: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_wallet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMyBalance: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_my_balance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt20: String? = MyApp.getInstance().resources.getString(R.string.lbl_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUseToPay100: String? =
      MyApp.getInstance().resources.getString(R.string.msg_use_to_pay_100)

)
