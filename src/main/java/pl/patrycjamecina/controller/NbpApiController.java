package pl.patrycjamecina.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patrycjamecina.model.NbpApiModel;
import pl.patrycjamecina.service.NbpApiServiceImpl;
@RestController
@RequiredArgsConstructor
@RequestMapping
public class NbpApiController {
    private final NbpApiServiceImpl nbpApiService;

    @GetMapping("/")
    public NbpApiModel[] getAllCurrencyRates() {
        return nbpApiService.getAllCurrencyRates();
    }
}
