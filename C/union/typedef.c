#include <stdio.h>
#include <string.h>

enum tipoEmpleado { ANALISTA, PROGRAMADOR };

typedef enum tipoEmpleado Tipo;

struct empleado_t {
    char nombre[127];
    char apellido[127];
    // No hay que guardar campos como teléfono o ID's como int o long si ni se van a usar para hacer operaciones matemáticas
    char id[127];
    char tel[127];
    Tipo tipo;
};

typedef struct empleado_t Empleado;

void imprimir(Empleado *empleado) {
    printf("%s %s\n", empleado->nombre, empleado->apellido);
    printf("ID : %s\n", empleado->id);
    printf("Tel: %s\n", empleado->tel);
    if (empleado->tipo == ANALISTA) {
        printf("El empleado es analista\n");
    } else {
        printf("El empleado es programador\n");
    }
}

int main() {
    Empleado empl;
    strncpy(empl.nombre, "Juan", strlen("Juan") + 1);
    strncpy(empl.apellido, "Lopez", strlen("Lopez") + 1);
    strncpy(empl.id, "369", strlen("Ju369an") + 1);
    strncpy(empl.tel, "5544810680", strlen("5544810680") + 1);
    empl.tipo = 0;
    imprimir(&empl);
    return 0;
}