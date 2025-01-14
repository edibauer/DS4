#include <stdio.h>

// Define enumeration
enum TrafficLight {
    RED,
    YELLOW,
    GREEN
};

const char* getAction(enum TrafficLight light){
    switch(light) {
        case RED:
            return "Stop";
        case YELLOW:
            return "Slow down";
        case GREEN:
            return "Go";
        default:
            return "Invalid Output";
    }
}

int main() {
    // Define var to traffic light
    enum TrafficLight currentLight = RED;

    printf("The light is RED: %s\n", getAction(currentLight));
    printf("The light is YELOW: %s\n", getAction(currentLight));
    printf("The light is GREEN: %s\n", getAction(currentLight));
    
    return 0;
}