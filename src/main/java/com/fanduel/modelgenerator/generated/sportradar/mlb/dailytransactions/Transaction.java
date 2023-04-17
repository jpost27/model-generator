package com.fanduel.modelgenerator.generated.sportradar.mlb.dailytransactions;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Transaction {
    @JsonProperty("transaction_type")
    private String transactionType;

    @JsonProperty("from_team")
    private FromTeam fromTeam;

    @JsonProperty("id")
    private String id;

    @JsonProperty("last_modified")
    private String lastModified;

    @JsonProperty("transaction_code")
    private String transactionCode;

    @JsonProperty("effective_date")
    private String effectiveDate;

    @JsonProperty("to_team")
    private ToTeam toTeam;

    @JsonProperty("desc")
    private String desc;
}
