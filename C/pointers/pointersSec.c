#include <stdio.h>

int main() {
    const char *cadena = "Hola mundo!";
    printf("La cadena es: %s\n", cadena);

    cadena = "i dont make mistakes"; // reasignación
    printf("La cadena es: %s\n", cadena);

    int x = 9;
    printf("Dirección en memoria: %p\n", &x);
    return 0;
}