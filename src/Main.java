import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<CabinaTelefonica> llamadasLocales = new ArrayList<>();
        List<CabinaTelefonica> llamadaslargas = new ArrayList<>();
        List<CabinaTelefonica> llamadasCelular = new ArrayList<>();
        List<CabinaTelefonica> llamadasx = new ArrayList<>();
        boolean estado = true;
        Random ale = new Random();
        double rondas;

        do{
            System.out.println("""
                    1. Crear una cabina Telefonica.
                    2. seleccionar tu cabina telefonica y realizar una llamada.
                    3.Informacion de una cabina.
                    4.Informacion de todas las cabinas por tipo de linea.""");
            int respuesta = teclado.nextInt();
            switch ( respuesta) {
                case 1 -> {
                    System.out.println("""
                            Para poder utilizar tu canbina  responde lo siguiente. ¿Qué tipo de llamada deseas realiazar en este cabina?
                            1. llamada Local.
                            2. llamada a larga distancia.
                            3. llamada por celular. """);
                    int respuestatipodellamada = teclado.nextInt();
                    if (respuestatipodellamada==1){
                        System.out.println("digite un nombre para su cabina");
                        String idLLamada = teclado.next();

                        rondas = ale.nextDouble((60 - 1 + 1)) + 1;
                        String tipodeLlamada = "llamadaLocal";
                        double duraciondelallamada = rondas;
                        int costodelallamda = 50;

                        llamadasLocales.add(new CabinaTelefonica(tipodeLlamada ,duraciondelallamada,costodelallamda, idLLamada));
                        llamadasx.add(new CabinaTelefonica(tipodeLlamada ,duraciondelallamada,costodelallamda, idLLamada));
                        System.out.println("has creado una cabina con el tipo de llamada Local");
                    }else if ( respuestatipodellamada == 2){
                        System.out.println("digite un nombre para su cabina");
                        String idLLamada = teclado.next();
                        rondas = ale.nextDouble((60 - 1 + 1)) + 1;
                        String tipodeLlamada = "llamada a larga distancia";
                        double duraciondelallamada = rondas;
                        int costodelallamda = 350;
                        llamadaslargas.add(new CabinaTelefonica(tipodeLlamada,duraciondelallamada, costodelallamda, idLLamada));
                        llamadasx.add(new CabinaTelefonica(tipodeLlamada ,duraciondelallamada,costodelallamda, idLLamada));
                        System.out.println("has creado una cabina con el tipo de llamada por distancia ");
                    } else if ( respuestatipodellamada == 3){
                        System.out.println("digite un nombre para su cabina");
                        String idLLamada = teclado.next();
                        rondas = ale.nextDouble((60 - 1 + 1)) + 1;
                        String tipodeLlamada = "llamada por celular ";
                        double duraciondelallamada = rondas;
                        int costodelallamda = 150;
                        llamadasCelular.add(new CabinaTelefonica(tipodeLlamada,duraciondelallamada, costodelallamda,idLLamada) );
                        llamadasx.add(new CabinaTelefonica(tipodeLlamada ,duraciondelallamada,costodelallamda, idLLamada));
                        System.out.println("has creado una cabina con el tipo de llamada por celular ");

                    }
                }
                case 2 -> {
                    System.out.println(" digite el nombre de su cabina ");
                    String idnombre = teclado.next();

                    for (CabinaTelefonica cualquiera: llamadasx ){
if (cualquiera.idLLamada.equalsIgnoreCase(idnombre)){
    cualquiera.getCostodelallamda();

    double costoTotal = costodelallamda*duraciondelallamada;
    System.out.println(" tu llamada tiene un costo de "+costoTotal);
}
                        System.out.println(cualquiera.mostrarInformacion()+ );
                    } else {
    System.out.println(" tu cabina no existe ");
                    }


                }


            }


        }while(estado);

    }
}