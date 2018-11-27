package com.ryanz.dialogflow.fulfillment.v2.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#Item
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class FulfillmentItem() {

        constructor(info: FulfillmentSelectItemInfo?, title: String?, description: String?, image: FulfillmentImage?): this() {
                this.info = info
                this.title = title
                this.description = description
                this.image = image
        }

        @JsonProperty("info")
        var info: FulfillmentSelectItemInfo? = null
        @JsonProperty("title")
        var title: String? = ""
        @JsonProperty("description")
        var description: String? = ""

        @JsonProperty("image")
        var image: FulfillmentImage? = null

        override fun equals(other: Any?): Boolean {
                return EqualsBuilder.reflectionEquals(this, other)
        }

        override fun hashCode(): Int {
                return HashCodeBuilder.reflectionHashCode(this)
        }

        override fun toString(): String {
                return ToStringBuilder.reflectionToString(this)
        }
}