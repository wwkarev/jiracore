package com.github.wwkarev.jiracore.endpoint

import javax.ws.rs.core.Response

/**
 * REST request handler
 * @author wwkarev
 */
interface Endpoint {
    abstract Response handle()
}
