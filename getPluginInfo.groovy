Jenkins.instance.pluginManager.plugins.each { plugin ->
  println("====================================================================================================")
  println("longName: ${plugin.longName}")
  println("shortName: ${plugin.shortName}")
  println("displayName: ${plugin.displayName}")
  println("Has update: " + plugin.hasUpdate())
  println("optionalDependencies: ${plugin.optionalDependencies}")
  println("manifest: ${plugin.manifest}")
  println("bundled: ${plugin.bundled}")
  println("pinned: ${plugin.pinned}")
  println("url: ${plugin.url}")
  println("indexPage: ${plugin.indexPage}")
  println("active: ${plugin.active}")
  println("deleted: ${plugin.deleted}")
  println("downgradable: ${plugin.downgradable}")
  println("dependencies: ${plugin.dependencies}")
  println("dependants: ${plugin.dependants}")
  println("backupFile: ${plugin.backupFile}")
  println("class: ${plugin.class}")
  println("backupVersion: ${plugin.backupVersion}")
  println("hasCycleDependency: ${plugin.hasCycleDependency}")
  println("pluginClass: ${plugin.pluginClass}")
  println("version: ${plugin.version}")
  println("pinningForcingOldVersion: ${plugin.pinningForcingOldVersion}")
  println("info: ${plugin.info}")
  println("enabled: ${plugin.enabled}")
  println("versionNumber: ${plugin.versionNumber}")
  println("updateInfo: ${plugin.updateInfo}")
  println("plugin: ${plugin.plugin}")
}
