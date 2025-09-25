package cz.czechitas.java2webapps.lekce2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalTime;

@Controller

public class MainController {

    @GetMapping( "/cas")
    public ModelAndView time() {  //vracime ModelAndView - dame ti view =co mas zobrazit a model = metoda pro vypocet
        ModelAndView modelAndView = new ModelAndView("time"); //tady modelAndView naplnime a nastavime co se ma zobrazit/vratit, Spring najde sablonu jmenem kostka a freemarker pracuje dal
        modelAndView.addObject("time", LocalTime.now()); //tady pouziji metodu pro nahodny hod kostkou
        return modelAndView;  //tomuto se rika view, protoze je to to, co se ma zobrazit na strance. zde namapuju soubor, ktery mam v resources
    }


    @GetMapping( "/datum")
    public ModelAndView date() {  //vracime ModelAndView - dame ti view =co mas zobrazit a model = metoda pro vypocet
        ModelAndView modelAndView = new ModelAndView("date"); //tady modelAndView naplnime a nastavime co se ma zobrazit/vratit, Spring najde sablonu jmenem kostka a freemarker pracuje dal
        modelAndView.addObject("date", LocalDate.now()); //tady pouziji metodu pro nahodny hod kostkou
        return modelAndView;  //tomuto se rika view, protoze je to to, co se ma zobrazit na strance. zde namapuju soubor, ktery mam v resources
    }
}
