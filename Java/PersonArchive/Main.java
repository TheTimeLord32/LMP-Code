package PersonArchive;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    private static final ArrayList<Persona> persona = new ArrayList<>();

    public static void main(String[] args) {
        persona.add(new Persona("Thomas", "Mandija", "Persona1", LocalDate.of(2001, 1, 31)));
        persona.add(new Impiegato( "Kevin", "Sotja", "Persona1", LocalDate.now(), "024409", "AWS", 1));
        persona.add(new LiberoProfessionista( "Tizio", "Caio", "Persona1", LocalDate.now(), "Sistemista", "123456789"));

        System.out.println(persona);
        System.out.println("Cerco persona: \n");
        cercaPersona(persona.get(0).getCf());
    }

    public static void cercaPersona(String cf) {
        persona.stream()
                .filter(p->p.getCf().equals(cf))
                .forEach(System.out::println);
    }
}
