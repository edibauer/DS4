#include <stdio.h>

enum diasemana { LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO };

int main() {
    // instance
    enum diasemana dia;
    dia = JUEVES;

    printf("%d\n", dia);
    return 0;
}