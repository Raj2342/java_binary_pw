#include <stdint.h>  // Includes standard integer types

void delay() {
    for (uint32_t i = 0; i < 100000; i++);  // Simple busy loop delay (not recommended for accurate timing)
}

int main(void) {

    uint32_t enb_clckA = (uint32_t)0x40023830;  // Likely base address for Clock Enable Register A
    uint32_t enb_clckC = (uint32_t)0x40023830;  // Potentially incorrect - check for Clock Enable Register C address

    uint32_t enb_modeA = (uint32_t)0x40020000;  // Likely base address for Mode Enable Register A

    uint32_t led = (uint32_t)0x40020014;        // Likely address for LED control register (bit 5 controls LED)
    uint32_t switch_idr = (uint32_t)0x40020810;  // Likely address for Input Data Register (bit 13 for switch?)

    // Enable clock for peripherals (assuming these are the correct register addresses)
    *enb_clckA |= (1 << 0);
    *enb_clckC |= (1 << 2);  // Double-check if Clock Enable Register C is needed and its bit position

    // Set LED control bit in Mode Enable Register A (assuming correct register and bit position)
    *enb_modeA |= (1 << 10);

    while (1) {
        uint8_t value;

        // Read switch state (assuming bit 13 of Input Data Register)
        value = (uint8_t)((*switch_idr >> 13) & (0x01));

        if (value == 0) {  // If switch is pressed (active low)
            delay();         // Introduce a delay (consider alternatives like timers for better accuracy)
            *led ^= (1 << 5);  // Toggle LED state (bitwise XOR flips bit 5)
        }
    }

    return 0;
}
