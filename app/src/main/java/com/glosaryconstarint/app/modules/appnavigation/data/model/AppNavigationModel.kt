package com.glosaryconstarint.app.modules.appnavigation.`data`.model

import com.glosaryconstarint.app.R
import com.glosaryconstarint.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMyCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUser: String? = MyApp.getInstance().resources.getString(R.string.lbl_user)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFAQ: String? = MyApp.getInstance().resources.getString(R.string.lbl_faq)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMyAddresses: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_my_addresses)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMyWallet: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_wallet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMyOrders: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_orders)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtContactUs: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_contact_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAboutUs: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_us)
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
  public var txtTermsOfServices: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terms_of_servic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFruits: String? = MyApp.getInstance().resources.getString(R.string.lbl_fruits)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtExplore1: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMySubscription: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_my_subscription)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoginWithMobile: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_with_mobi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCorrectMobileNumber: String? =
      MyApp.getInstance().resources.getString(R.string.msg_correct_mobile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtIncorrectMobileNumber: String? =
      MyApp.getInstance().resources.getString(R.string.msg_incorrect_mobil2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOTPSent: String? = MyApp.getInstance().resources.getString(R.string.lbl_otp_sent)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCorrectOTP: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_correct_otp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtIncorrectOTP: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_incorrect_otp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSplash: String? = MyApp.getInstance().resources.getString(R.string.lbl_splash)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHomeScreen: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_home_screen)

)
