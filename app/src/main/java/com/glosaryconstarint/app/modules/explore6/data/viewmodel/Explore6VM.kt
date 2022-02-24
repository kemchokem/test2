package com.glosaryconstarint.app.modules.explore6.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.explore6.`data`.model.Explore10RowModel
import com.glosaryconstarint.app.modules.explore6.`data`.model.Explore11RowModel
import com.glosaryconstarint.app.modules.explore6.`data`.model.Explore6Model
import com.glosaryconstarint.app.modules.explore6.`data`.model.Explore7RowModel
import com.glosaryconstarint.app.modules.explore6.`data`.model.Explore8RowModel
import com.glosaryconstarint.app.modules.explore6.`data`.model.Explore9RowModel
import kotlin.collections.MutableList

public class Explore6VM : ViewModel() {
  public val explore6Model: MutableLiveData<Explore6Model> = MutableLiveData(Explore6Model())

  public var navArguments: Bundle? = null

  public val recyclerFrame3List: MutableLiveData<MutableList<Explore7RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerFrame5List: MutableLiveData<MutableList<Explore8RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerFrame7List: MutableLiveData<MutableList<Explore9RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup506List: MutableLiveData<MutableList<Explore10RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerFrame11List: MutableLiveData<MutableList<Explore11RowModel>> =
      MutableLiveData(mutableListOf())
}
