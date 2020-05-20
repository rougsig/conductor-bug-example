package com.bluelinelabs.conductor.demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import com.bluelinelabs.conductor.RouterTransaction

class HomeController : Controller() {
  companion object {
    const val TAG = "HOME"
  }

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup,
    savedViewState: Bundle?
  ): View {
    return inflater.inflate(R.layout.controller_home, container, false)
      .apply {
        findViewById<View>(R.id.open_list).setOnClickListener {
          router.pushController(RouterTransaction.with(ListController()))
        }
      }
  }
}
