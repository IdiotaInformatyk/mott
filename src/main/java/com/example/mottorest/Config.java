package com.example.mottorest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Config {
    @Bean
    CommandLineRunner CLR(Repositories repositories){
        return args -> {
            Mott a =new Mott("Poznasz głupiego po czynach jego.");
            Mott b =new Mott("Życie jest jak pudełko czekoladek – nigdy nie wiesz, co ci się trafi");
            Mott c =new Mott("Ludzie, którym lepiej się nie odszczekiwać: nauczyciel, sierżant w wojsku, policjant, własna mama");
            Mott d =new Mott("Ja nikomu prawie nie wierzę, a cóż dopiero Niemcom---Piłsudski ");
            Mott e =new Mott("Umiłowanym stanem Polaków jest niezdecydowanie.---Piłsudski");
            Mott f =new Mott("CZego krzyczysz... co noga? A tamtemu głowe urwało i nie krzyczy ,a Ty o takie głupstwo.---Piłsudski");
            Mott g =new Mott("co ja tu robie");


            repositories.saveAll(
                    List.of(a,b,c,d,e,f,g)
            );
        };
    }

}
