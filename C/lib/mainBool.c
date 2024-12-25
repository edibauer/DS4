#include <stdio.h>
#include <stdbool.h>

bool set_alarm(bool employed, bool vacation) {
    
    if(employed == true && vacation == false) return true;

    return false;

}

int main() {
    bool esMayorEdad = true;
    bool ans = set_alarm(true, true);

    if (esMayorEdad) {
        printf("Eres masyor de edad\n");
    } else {
        printf("Eres menor de edad\n");
    }

    printf("%d\n", ans);

    return 0;
}