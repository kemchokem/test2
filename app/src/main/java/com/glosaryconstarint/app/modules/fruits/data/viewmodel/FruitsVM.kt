package com.glosaryconstarint.app.modules.fruits.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosaryconstarint.app.modules.fruits.`data`.model.Fruits1RowModel
import com.glosaryconstarint.app.modules.fruits.`data`.model.FruitsModel
import kotlin.collections.MutableList

public class FruitsVM : ViewModel() {
  public val fruitsModel: MutableLiveData<FruitsModel> = MutableLiveData(FruitsModel())

  public var navArguments: Bundle? = null

  public val recyclerFruitsList: MutableLiveData<MutableList<Fruits1RowModel>> =
      MutableLiveData(mutableListOf())
}
