package com.fanduel.modelgenerator.generated.sportradar.nfl.dailytransactions;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Transaction {
    @JsonProperty("transaction_type")
    private String transactionType;

    @JsonProperty("transaction_year")
    private Integer transactionYear;

    @JsonProperty("status_before")
    private String statusBefore;

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

    @JsonProperty("status_after")
    private String statusAfter;

    @JsonProperty("to_team")
    private ToTeam toTeam;

    @JsonProperty("desc")
    private String desc;

    public Optional<String> getTransactionType() {
        return Optional.ofNullable(transactionType);
    }

    public Optional<Integer> getTransactionYear() {
        return Optional.ofNullable(transactionYear);
    }

    public Optional<String> getStatusBefore() {
        return Optional.ofNullable(statusBefore);
    }

    public Optional<FromTeam> getFromTeam() {
        return Optional.ofNullable(fromTeam);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getLastModified() {
        return Optional.ofNullable(lastModified);
    }

    public Optional<String> getTransactionCode() {
        return Optional.ofNullable(transactionCode);
    }

    public Optional<String> getEffectiveDate() {
        return Optional.ofNullable(effectiveDate);
    }

    public Optional<String> getStatusAfter() {
        return Optional.ofNullable(statusAfter);
    }

    public Optional<ToTeam> getToTeam() {
        return Optional.ofNullable(toTeam);
    }

    public Optional<String> getDesc() {
        return Optional.ofNullable(desc);
    }
}
