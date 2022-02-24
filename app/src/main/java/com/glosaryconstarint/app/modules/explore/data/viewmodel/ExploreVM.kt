package com.glosaryconstarint.app.modules.explore.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.explore.`data`.model.Explore1RowModel
import com.glosaryconstarint.app.modules.explore.`data`.model.Explore2RowModel
import com.glosaryconstarint.app.modules.explore.`data`.model.Explore3RowModel
import com.glosaryconstarint.app.modules.explore.`data`.model.Explore4RowModel
import com.glosaryconstarint.app.modules.explore.`data`.model.Explore5RowModel
import com.glosaryconstarint.app.modules.explore.`data`.model.ExploreModel
import kotlin.collections.MutableList

public class ExploreVM : ViewModel() {
  public val exploreModel: MutableLiveData<ExploreModel> = MutableLiveData(ExploreModel())

  public var navArguments: Bundle? = null

  public val recyclerFrame3List: MutableLiveData<MutableList<Explore1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerFrame5List: MutableLiveData<MutableList<Explore2RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerFrame7List: MutableLiveData<MutableList<Explore3RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup442List: MutableLiveData<MutableList<Explore4RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerFrame11List: MutableLiveData<MutableList<Explore5RowModel>> =
      MutableLiveData(mutableListOf())
}
