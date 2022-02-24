package com.glosaryconstarint.app.modules.explore6.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore6Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGroceries: String? = MyApp.getInstance().resources.getString(R.string.lbl_groceries)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSeeAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtVegetables: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_vegetables)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSeeAll1: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFruits: String? = MyApp.getInstance().resources.getString(R.string.lbl_fruits)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSeeAll2: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDairyProducts: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dairy_products)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSeeAll3: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBakeryItems: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_bakery_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSeeAll4: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSubscribe: String? = MyApp.getInstance().resources.getString(R.string.lbl_subscribe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBuyOnce: String? = MyApp.getInstance().resources.getString(R.string.lbl_buy_once)

)
