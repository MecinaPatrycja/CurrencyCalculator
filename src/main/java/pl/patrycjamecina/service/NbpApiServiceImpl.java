package pl.patrycjamecina.service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.patrycjamecina.model.NbpApiModel;
@Service
public class NbpApiServiceImpl {
    @Value("${CORE_URL}")
    private String coreURL;

    public NbpApiModel[] getAllCurrencyRates() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<NbpApiModel[]> nbpApiModelResponseEntity
                = restTemplate.getForEntity(coreURL, NbpApiModel[].class);
        return nbpApiModelResponseEntity.getBody();
    }
}
