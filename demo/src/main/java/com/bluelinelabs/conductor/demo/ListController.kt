package com.bluelinelabs.conductor.demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import com.bluelinelabs.conductor.RouterTransaction
import com.bluelinelabs.conductor.changehandler.FadeChangeHandler

class ListController : Controller() {
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup,
    savedViewState: Bundle?
  ): View {
    return inflater.inflate(R.layout.controller_list, container, false)
      .apply {
        findViewById<View>(R.id.open_details).setOnClickListener {
          router.pushController(
            RouterTransaction.with(DetailsController())
              .pushChangeHandler(FadeChangeHandler(/* removesFromViewOnPush=*/false))
          )
        }
      }
  }
}
