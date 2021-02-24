public class metodoMain {
    public static void main(String[] args) {

        System.out.println("###### Ordenando Personas según su nombre######");

        // clase Persona
        Persona p1 = new Persona("Angie", 23902049);
        Persona p2 = new Persona("Zenaida", 42348800);
        Persona p3 = new Persona("Carlos", 92348922);
        Persona p4 = new Persona("Matias", 42348191);
        Persona p5 = new Persona("Luisina", 13832388);

        Precedable<Persona>[] personas = new Persona[5];

        personas[0] = p1;
        personas[1] = p2;
        personas[2] = p3;
        personas[3] = p4;
        personas[4] = p5;

        SortUtil.ordenar(personas);
        printClase(personas);


        // Clase Celular
        System.out.println("\n###### Ordenando Celulares según su titular ######");

        Celular c1 = new Celular(23902049, "Maria");
        Celular c2 = new Celular(42348800, "Leonel");
        Celular c3 = new Celular(92348922, "Andrea");
        Celular c4 = new Celular(42348191, "Ximena");
        Celular c5 = new Celular(13832388, "Oscar");

        Precedable<Celular>[] celulares = new Celular[5];

        celulares[0] = c1;
        celulares[1] = c2;
        celulares[2] = c3;
        celulares[3] = c4;
        celulares[4] = c5;

        SortUtil.ordenar(celulares);
        printClase(celulares);

    }

    public static <T> void printClase(Precedable<T>[] lista) {

        for (Precedable<T> element : lista) {
            System.out.println(element);
        }
    }
}