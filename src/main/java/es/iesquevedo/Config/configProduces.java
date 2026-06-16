package es.iesquevedo.Config;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

import java.util.Scanner;

@ApplicationScoped
public class configProduces {
    @Produces
    public Scanner process(){
        return new Scanner(System.in);
    }
}
