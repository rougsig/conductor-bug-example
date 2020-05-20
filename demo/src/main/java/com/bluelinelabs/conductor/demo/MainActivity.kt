package com.bluelinelabs.conductor.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bluelinelabs.conductor.Conductor.attachRouter
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.RouterTransaction.Companion.with

class MainActivity : AppCompatActivity() {
  private lateinit var router: Router
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    router = attachRouter(this, findViewById(R.id.root), savedInstanceState)
    if (!router.hasRootController()) router.setRoot(with(HomeController()).tag(HomeController.TAG))
  }

  override fun onBackPressed() {
    if (!router.handleBack()) super.onBackPressed()
  }
}

