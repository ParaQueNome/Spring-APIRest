package DIO.APIRest.Java.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import DIO.APIRest.Java.Repository.Endereco;

@Service
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws/")
public interface ViaCep {
    
    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable ("cep") String cep);
    
    //@RequestMapping(method = RequestMethod.GET, value = "/{cep}")
    
    
}
