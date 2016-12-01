import groovy.time.TimeCategory
use ( TimeCategory ) {
  // e.g. find jobs not run in last 3 months
  sometimeago = (new Date() - 1.hour)
}

Hudson.instance.items.each { job ->

	//job.metaClass.properties.each {println it.name }
	println("parameterized: ${job.parameterized}")
	println("rootDir: ${job.rootDir}")
	println("logUpdated: ${job.logUpdated}")
	println("searchIndex: ${job.searchIndex}")
	println("properties: ${job.properties}")
	println("allJobs: ${job.allJobs}")
	println("SCMs: ${job.SCMs}")
	println("overrides: ${job.overrides}")
	println("ACL: ${job.ACL}")
	println("descriptor: ${job.descriptor}")
	println("lastSuccessfulBuild: ${job.lastSuccessfulBuild}")
	println("estimatedDurationCandidates: ${job.estimatedDurationCandidates}")
	println("buildDir: ${job.buildDir}")
	println("search: ${job.search}")
	println("actions: ${job.actions}")
	println("buildNowText: ${job.buildNowText}")
	println("SCMTrigger: ${job.SCMTrigger}")
	println("configFile: ${job.configFile}")
	println("buildDiscarder: ${job.buildDiscarder}")
	println("fullName: ${job.fullName}")
	println("displayName: ${job.displayName}")
	println("fullDisplayName: ${job.fullDisplayName}")
	println("searchName: ${job.searchName}")
	println("quietPeriod: ${job.quietPeriod}")
	println("resourceList: ${job.resourceList}")
	println("subTasks: ${job.subTasks}")
	println("absoluteUrl: ${job.absoluteUrl}")
	println("whyBlocked: ${job.whyBlocked}")
	println("lazyBuildMixIn: ${job.lazyBuildMixIn}")
	println("hasCustomQuietPeriod: ${job.hasCustomQuietPeriod}")
	println("buildable: ${job.buildable}")
	println("url: ${job.url}")
	println("name: ${job.name}")
	println("lastStableBuild: ${job.lastStableBuild}")
	println("ownerTask: ${job.ownerTask}")
	println("api: ${job.api}")
	println("searchUrl: ${job.searchUrl}")
	println("definition: ${job.definition}")
	println("iconColor: ${job.iconColor}")
	println("triggers: ${job.triggers}")
	println("pronoun: ${job.pronoun}")
	println("displayNameOrNull: ${job.displayNameOrNull}")
	println("authToken: ${job.authToken}")
	println("assignedLabel: ${job.assignedLabel}")
	println("parent: ${job.parent}")
	println("nameEditable: ${job.nameEditable}")
	println("builds: ${job.builds}")
	println("queueItem: ${job.queueItem}")
	println("timeline: ${job.timeline}")
	println("buildHealthReports: ${job.buildHealthReports}")
	println("inQueue: ${job.inQueue}")
	println("lastFailedBuild: ${job.lastFailedBuild}")
	println("keepDependencies: ${job.keepDependencies}")
	println("sameNodeConstraint: ${job.sameNodeConstraint}")
	println("holdOffBuildUntilSave: ${job.holdOffBuildUntilSave}")
	println("typicalSCM: ${job.typicalSCM}")
	println("nextBuildNumber: ${job.nextBuildNumber}")
	println("allProperties: ${job.allProperties}")
	println("class: ${job.class}")
	println("lastBuild: ${job.lastBuild}")
	println("lastBuiltOn: ${job.lastBuiltOn}")
	println("buildStatusUrl: ${job.buildStatusUrl}")
	println("buildHealth: ${job.buildHealth}")
	println("buildsAsMap: ${job.buildsAsMap}")
	println("firstBuild: ${job.firstBuild}")
	println("buildTimeGraph: ${job.buildTimeGraph}")
	println("permalinks: ${job.permalinks}")
	println("causeOfBlockage: ${job.causeOfBlockage}")
	println("shortUrl: ${job.shortUrl}")
	println("building: ${job.building}")
	println("logRotator: ${job.logRotator}")
	println("lastUnstableBuild: ${job.lastUnstableBuild}")
	println("widgets: ${job.widgets}")
	println("buildBlocked: ${job.buildBlocked}")
	println("lastCompletedBuild: ${job.lastCompletedBuild}")
	println("concurrentBuild: ${job.concurrentBuild}")
	println("lastUnsuccessfulBuild: ${job.lastUnsuccessfulBuild}")
	println("nextBuildNumberFile: ${job.nextBuildNumberFile}")
	println("allActions: ${job.allActions}")
	println("description: ${job.description}")
	println("newBuilds: ${job.newBuilds}")
	println("buildStatusIconClassName: ${job.buildStatusIconClassName}")
	println("estimatedDuration: ${job.estimatedDuration}")
	println("characteristicEnvVars: ${job.characteristicEnvVars}")
	println("defaultAuthentication: ${job.defaultAuthentication}")

    //println job.toString()


    if (!jobType.contains("Template") && !jobType.contains("Folder")) {

        println ("Last Build	: " + job.getLastBuild().getTime() )

      if (job.getLastBuild().getTime() < sometimeago) {
      println ("older than 1 hour")
      }else{
      println ("newer than 1 hour")
      }
      
        jobTriggers = job.getTriggers()
        jobTriggers.each { trigger ->
                println("trigger: ${trigger}")
        }

        if (jobType.contains("FreeStyle")) {
            //println("Timer Trigger: ${job.TimerTrigger}")
        }

    }

    println("")
    println("Methods		: " + job.metaClass.methods*.name.sort().unique())
    println("")
    
    println("")
    println("")

}
