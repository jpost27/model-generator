
package com.fanduel.modelgenerator.sportradar.nfl.dailytransactions;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "desc",
    "effective_date",
    "last_modified",
    "transaction_type",
    "transaction_code",
    "transaction_year",
    "status_before",
    "status_after",
    "from_team",
    "to_team"
})
@Generated("jsonschema2pojo")
public class Transaction {

    @JsonProperty("id")
    public String id;
    @JsonProperty("desc")
    public String desc;
    @JsonProperty("effective_date")
    public String effectiveDate;
    @JsonProperty("last_modified")
    public String lastModified;
    @JsonProperty("transaction_type")
    public String transactionType;
    @JsonProperty("transaction_code")
    public String transactionCode;
    @JsonProperty("transaction_year")
    public Integer transactionYear;
    @JsonProperty("status_before")
    public String statusBefore;
    @JsonProperty("status_after")
    public String statusAfter;
    @JsonProperty("from_team")
    public FromTeam fromTeam;
    @JsonProperty("to_team")
    public ToTeam toTeam;

}
