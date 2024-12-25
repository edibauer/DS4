#include <stdio.h>
#include <string.h>

struct cuenta {
    // att 
    char nombre[30];
    char apellido[40];
    int identificador;
    int saldo;
};

void showData(struct cuenta *c) {
    printf("El cliente %s %s tiene %d euros en cuenta\n", c->nombre, c->apellido, c->saldo);
}

int main() {
    struct cuenta c1;
    c1.identificador = 1;
    c1.saldo = 369;
    strcpy(c1.nombre, "Sam");
    strcpy(c1.apellido, "Sepiol");

    showData(&c1);

    return 0;
}