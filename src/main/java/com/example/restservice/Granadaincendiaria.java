/**
 * Especialización de Granada de tipo incendiaria.
 * No agrega atributos ni métodos propios respecto al diagrama.
 */
public class GranadaIncendiaria extends Granada {

    public GranadaIncendiaria(String nombre, float precio, int daño, float peso, int municionMax,
                               float radioExplosion) {
        super(nombre, precio, daño, peso, municionMax, GranadaTipo.INCENDIARIA, radioExplosion);
    }
}