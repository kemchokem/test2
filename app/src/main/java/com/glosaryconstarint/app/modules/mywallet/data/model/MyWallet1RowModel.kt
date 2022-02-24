package com.glosaryconstarint.app.modules.mywallet.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class MyWallet1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt17Oct2021: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_17_oct_2021)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCashbackReceiv: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cashback_receiv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTransactionId: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transaction_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)

)
