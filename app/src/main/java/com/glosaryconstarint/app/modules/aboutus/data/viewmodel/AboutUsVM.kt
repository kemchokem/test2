package com.glosaryconstarint.app.modules.aboutus.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.aboutus.`data`.model.AboutUs1RowModel
import com.glosaryconstarint.app.modules.aboutus.`data`.model.AboutUs2RowModel
import com.glosaryconstarint.app.modules.aboutus.`data`.model.AboutUs3RowModel
import com.glosaryconstarint.app.modules.aboutus.`data`.model.AboutUsModel
import kotlin.collections.MutableList

public class AboutUsVM : ViewModel() {
  public val aboutUsModel: MutableLiveData<AboutUsModel> = MutableLiveData(AboutUsModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup394List: MutableLiveData<MutableList<AboutUs1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerAboutUsList: MutableLiveData<MutableList<AboutUs2RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup393List: MutableLiveData<MutableList<AboutUs3RowModel>> =
      MutableLiveData(mutableListOf())
}
