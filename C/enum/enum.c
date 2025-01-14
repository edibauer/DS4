#include <stdio.h>

// Define enumaration of days
enum Day {
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday
};

int main() {
    // Declare variable of enum
    enum Day today = Wednesday;

    if(today == Wednesday) printf("Today is wednesday\n");
    
    printf("It's not Wednesday\n");

    // Print the number of day
    printf("Numeric Value: %d\n", today);

    return 0;
}