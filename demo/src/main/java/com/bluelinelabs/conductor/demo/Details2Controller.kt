package com.bluelinelabs.conductor.demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller

class Details2Controller : Controller() {
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup,
    savedViewState: Bundle?
  ): View {
    return inflater.inflate(R.layout.controller_details_two, container, false)
      .apply {
        findViewById<View>(R.id.goto_home).setOnClickListener {
          router.popToTag(HomeController.TAG)
        }
      }
  }
}
