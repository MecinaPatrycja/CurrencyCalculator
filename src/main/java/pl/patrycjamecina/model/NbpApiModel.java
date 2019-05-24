package pl.patrycjamecina.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@RequiredArgsConstructor
public class NbpApiModel {
    @JsonProperty(value = "effectiveDate")
    private String date;
    private List<Rates> rates;
}
