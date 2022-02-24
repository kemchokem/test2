package com.glosaryconstarint.app.modules.homescreen.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.glosaryconstarint.app.databinding.SlideritemHomeScreen1Binding
import com.glosaryconstarint.app.modules.homescreen.`data`.model.ImageSliderGroup189Model
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public class ImageSliderGroup189Adapter(
  public val dataList: ArrayList<ImageSliderGroup189Model>,
  public val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderGroup189Model>(dataList, mIsInfinite) {
  public override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ): Unit {
    if (binding is SlideritemHomeScreen1Binding) {
      binding.imageSliderGroup189Model = dataList[listPosition]
    }
  }

  public override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemHomeScreen1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
