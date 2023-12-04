package org.example.bot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)

public class Dollar  {
  @JsonProperty("Ccy")
	private String ccy;
	@JsonProperty("Rate")
	private String rate;
	@JsonProperty("Date")
	private String date;

	}