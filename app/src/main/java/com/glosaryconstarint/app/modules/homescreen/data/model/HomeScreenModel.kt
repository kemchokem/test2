package com.glosaryconstarint.app.modules.homescreen.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class HomeScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTopProducts: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_top_products)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtExploreAll: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_explore_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDealsOfTheWe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_deals_of_the_we)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtExploreAll1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_explore_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFeaturedItems: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_featured_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtExploreAll2: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_explore_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTopCategories: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_top_categories)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtExploreAll3: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_explore_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSanFrancisco: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_san_francisco)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etSearchProductsValue: String? = null
)
