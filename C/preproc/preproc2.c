#include <stdio.h>
// macros

/*
int arearec(int a, int b) {
    return a * b;
}
*/

#define AREA_REC(x, y) (x * y)
#define EDAD 17
#define PREMIUM

int main() {
    int ancho = 3;
    int alto = 6;

    printf("El área del rectangulo %d x %d es = %d\n", ancho, alto, AREA_REC(ancho, alto));

    #if EDAD >= 18
        printf("Eres mayor de edadn\n");
    #else
        printf("No eres mayor de edad\n"); 
    #endif

    #if defined(PREMIUM)
        printf("Estás usando la versión premium\n");
    #else
        printf("Estás usando la versión gratuita\n");
    #endif
    return 0;
}