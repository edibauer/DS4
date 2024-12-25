#include <stdio.h>
#include <stddef.h>

size_t str_count(const char *str, char letter) {
    size_t counter = 0;

    while(*str != '\0') {
        if(*str == letter) counter ++;

        str++;
    }
  return counter;
}

int main() {
    const char *cadena = "i dont make mistakes";
    char letra = 'a';

    printf("%zu\n", str_count(cadena, letra));
    return 0;
}