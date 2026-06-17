package com.phisher98.cloudplay

import com.lagradost.cloudstream3.plugins.BasePlugin
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin

@CloudstreamPlugin
class CloudPlayPlugin: BasePlugin() {
    override fun load() {
        registerMainAPI(CloudPlay())
    }
}