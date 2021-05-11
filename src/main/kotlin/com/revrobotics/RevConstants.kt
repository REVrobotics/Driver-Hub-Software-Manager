package com.revrobotics

import android.content.Context
import android.content.SharedPreferences
import nya.kitsunyan.foxydroid.MainApplication

object RevConstants {
  const val DRIVER_HUB_OS_CONTAINER_PACKAGE = "com.revrobotics.driverhuboscontainer"
  const val DRIVER_HUB_OS_VERSION_NAME_PROPERTY = "ro.driverhub.os.version"
  const val DRIVER_HUB_OS_VERSION_CODE_PROPERTY = "ro.driverhub.os.versionnum"

  val SHARED_PREFS: SharedPreferences = MainApplication.instance.getSharedPreferences("revrobotics", Context.MODE_PRIVATE)

  private const val PREF_AUTO_INSTALL_OS_ON_NEXT_LAUNCH = "autoInstallOsOnNextLaunch"
  private const val PREF_AUTO_INSTALL_OS_WHEN_DOWNLOAD_COMPLETES = "autoInstallOsWhenDownloadCompletes"

  var shouldAutoInstallOSWhenDownloadCompletes: Boolean
    get() {
      return SHARED_PREFS.getBoolean(PREF_AUTO_INSTALL_OS_WHEN_DOWNLOAD_COMPLETES, true)
    }
    set(value) {
      SHARED_PREFS.edit().putBoolean(PREF_AUTO_INSTALL_OS_WHEN_DOWNLOAD_COMPLETES, value).apply()
    }

  var shouldAutoInstallOsOnNextLaunch: Boolean
    get() {
      return SHARED_PREFS.getBoolean(PREF_AUTO_INSTALL_OS_ON_NEXT_LAUNCH, true)
    }
    set(value) {
      SHARED_PREFS.edit().putBoolean(PREF_AUTO_INSTALL_OS_ON_NEXT_LAUNCH, value).apply()
    }
}