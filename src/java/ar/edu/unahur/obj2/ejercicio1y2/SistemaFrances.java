package ar.edu.unahur.obj2.ejercicio1y2;

public class SistemaFrances extends SistemaDe Amortizacion {

    public SistemaFrances(Prestamo prestamo) {
        super(prestamo);
    }

    @Override
    public double capital(Prestamo prestamo) {
        return super()*
                prestamo.getPorcentajeNoUtilizado();
    }
}
