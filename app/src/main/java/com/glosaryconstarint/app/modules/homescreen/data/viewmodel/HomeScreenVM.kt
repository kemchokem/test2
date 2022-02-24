package com.glosaryconstarint.app.modules.homescreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.homescreen.`data`.model.HomeScreen2RowModel
import com.glosaryconstarint.app.modules.homescreen.`data`.model.HomeScreen3RowModel
import com.glosaryconstarint.app.modules.homescreen.`data`.model.HomeScreen4RowModel
import com.glosaryconstarint.app.modules.homescreen.`data`.model.HomeScreen5RowModel
import com.glosaryconstarint.app.modules.homescreen.`data`.model.HomeScreenModel
import kotlin.collections.MutableList

public class HomeScreenVM : ViewModel() {
  public val homeScreenModel: MutableLiveData<HomeScreenModel> = MutableLiveData(HomeScreenModel())

  public var navArguments: Bundle? = null

  public val recyclerFrame6List: MutableLiveData<MutableList<HomeScreen2RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerFrame8List: MutableLiveData<MutableList<HomeScreen3RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerFrame10List: MutableLiveData<MutableList<HomeScreen4RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerCategoriesListList: MutableLiveData<MutableList<HomeScreen5RowModel>> =
      MutableLiveData(mutableListOf())
}
