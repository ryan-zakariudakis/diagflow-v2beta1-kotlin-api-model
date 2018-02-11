package com.ryanz.diagflow.webhook

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

// https://dialogflow.com/docs/reference/api-v2/rest/v2beta1/projects.agent.intents#CarouselSelect
@JsonIgnoreProperties(ignoreUnknown = true)
data class FulfillmentCarouselSelect(
        @JsonProperty("items")
        var items: List<FulfillmentItem>? = mutableListOf()
)